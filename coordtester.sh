# coordtester by madeforlosers 2026
# tests one-line coordinate2 code to make sure the interpreter works
# 
# version 3.0
#
#
# --------------------------------------------------------------------
#
  FOLDER_NAME="z.test"
#   default folder name
#
  RESULT_NAME="result.txt"
#   result page for tests, shows expected and actual result
#
  TESTS_NAME="tests.txt"
#   list of tests to be ran
#
  RUN_NAME="run.coo"
#   temporary file used to run the test code
#  
  EXP_NAME="exp.txt"
#   temporary, for specific test, the expected result when ran
#
  RES_NAME="res.txt"
#   temporary, for specific test, the actual result when ran
#
  EXPECTEDFILENAMES="expected.txt"
#   expected file names for program, name cannot be changed sadly
#
# --------------------------------------------------------------------

# parse flags
while getopts "n:v" OPTION; do
  case "$OPTION" in
    f)
      # custom folder flag!!
      FOLDER_NAME="$OPTARG"
      ;;
    ?)
      # Handle invalid options or missing arguments
      echo "Usage: $(basename $0) [-f customfolder]" >&2
      exit 1
      ;;
  esac
done

# make sure folder actually exists
if [ ! -d "$FOLDER_NAME" ]; then
    echo "[!] [NOTICE] test folder \"$FOLDER_NAME\" does not exist."
    echo "to change from the default folder name z.test, use flag [-f foldername]."
    exit 1
fi


# make sure expected.txt exists
if [ -f "$FOLDER_NAME/expected.txt" ]; then

    # loop through expected.txt and overwrite vars
    while IFS= read -r line; do

        # split var name with var item
        split=($(echo "$line" | tr "=" "\n"))

        # redeclare the var
        declare "${split[0]}"="${split[1]}"

    done < "$FOLDER_NAME/expected.txt"
fi

# see if tests file is there. this is needed for the program to run
if [ ! -f "$FOLDER_NAME/$TESTS_NAME" ]; then
    echo "[!] [NOTICE] file $FOLDER_NAME/$TESTS_NAME does not exist! this is needed!"
    echo "please check $FOLDER_NAME/expected.txt to see if the name is correct!"
    exit 1
fi




clear
# clear result page
echo "- COORDINATE2 COORDTESTER v3.0" > $FOLDER_NAME/$RESULT_NAME
echo "- made by madeforlosers 2026" >> $FOLDER_NAME/$RESULT_NAME
echo "- result page for the tests!!" >> $FOLDER_NAME/$RESULT_NAME


# create temporary files to run test code
touch $FOLDER_NAME/$RUN_NAME
touch $FOLDER_NAME/$EXP_NAME
touch $FOLDER_NAME/$RES_NAME


# create temporary running file for compilation
echo "puts(\"worked!\")" > COORDTESTER_TEST_RUN_FILE.coo

# compile file using ./runjar.sh, put out to /dev/null
# do this so it doesn't have to compile for every test (very slow)
./runjar.sh -silent COORDTESTER_TEST_RUN_FILE.coo > /dev/null

# remove 
rm COORDTESTER_TEST_RUN_FILE.coo

# flags to let loop know what to log
let "expc=0"
let "done=0"

resulting=""

# counter for output
let "counter=1"

# increment through lines of TESTS_NAME
while IFS= read -r line; do
    # $line is the text of the current line we're on in TESTS_NAME
    
    # if it's on this, the input has ended and is ready to be tested
    [[ "${line:0:5}" == ";-end" ]] && let "done=1"

    # if it's not done, 
    if [ $done -eq 0 ]; then

        # if it's on this, that means the code part of input is done
        # and it should switch to logging the expected result
        [[ "${line:0:5}" == ";-res" ]] && let "expc=1"
        
        # make sure we ignore all comment lines
        if [[ "${line:0:1}" != ";" ]]; then
            # make sure we're logging the right thing

            # append line of code to run file
            [ $expc -eq 0 ] && echo $line >> $FOLDER_NAME/$RUN_NAME

            # append line of expected result to result file for comparison
            [ $expc -eq 0 ] || echo $line >> $FOLDER_NAME/$EXP_NAME
        fi

    else

        clear
        echo -e "\e[HTEST $counter $resulting"  

        START_TIME=$(date +%s.%N)

        # run coordinate2 program, log its result
        java -jar Runner.jar $FOLDER_NAME/$RUN_NAME | tee $FOLDER_NAME/$RES_NAME

        END_TIME=$(date +%s.%N)
        ELAPSED=$( printf "%.3f\n" $(bc <<<"$END_TIME - $START_TIME") )

        # strip unneeded lines
        printf "%s\n" "$(< $FOLDER_NAME/$RES_NAME)" > $FOLDER_NAME/$RES_NAME
        printf "%s\n" "$(< $FOLDER_NAME/$EXP_NAME)" > $FOLDER_NAME/$EXP_NAME

        # let user know what test we're on
        echo -n "TEST $counter (${ELAPSED}sec) ; " >> $FOLDER_NAME/$RESULT_NAME

        # compare the 2 files
        if cmp -s "$FOLDER_NAME/$RES_NAME" "$FOLDER_NAME/$EXP_NAME"; then
            
            resulting+="O"
            echo "SUCCESS" >> $FOLDER_NAME/$RESULT_NAME

        else

            resulting+="X"
            echo "FAIL" >> $FOLDER_NAME/$RESULT_NAME
            echo "expectation:" >> $FOLDER_NAME/$RESULT_NAME
            cat $FOLDER_NAME/$EXP_NAME >> $FOLDER_NAME/$RESULT_NAME
            echo "test return:" >> $FOLDER_NAME/$RESULT_NAME
            cat $FOLDER_NAME/$RES_NAME >> $FOLDER_NAME/$RESULT_NAME

        fi

        # update result page
        echo "" >> $FOLDER_NAME/$RESULT_NAME

        # revert everything and increment counter
        let "expc=0"
        let "done=0"
        > $FOLDER_NAME/$EXP_NAME
        > $FOLDER_NAME/$RES_NAME
        > $FOLDER_NAME/$RUN_NAME
        let "counter+=1"
        echo -e "\e[HTEST $counter $resulting"

    fi
    
done < "$FOLDER_NAME/$TESTS_NAME"

# remove temp files
rm $FOLDER_NAME/$RUN_NAME
rm $FOLDER_NAME/$RES_NAME
rm $FOLDER_NAME/$EXP_NAME

echo "TESTS DONE! check $FOLDER_NAME/$RESULT_NAME to see results"