# coordtester by madeforlosers 2026
# tests one-line coordinate2 code to make sure the interpreter works
# 
# version 2.2
#
# TODO: 
#   - add support for custom result and test folder names
#
# --------------------------------------------------------------------
#
# folder for in/out is "z.test/" for now
#
# result.txt:
#   result page for tests, shows expected and actual result
#
# tests.txt:
#   list of tests to be ran
#
# run.coo:
#   temporary file used to run the test code
#  
# exp.txt:
#   temporary, for specific test, the expected result when ran
#
# res.txt:
#   temporary, for specific test, the actual result when ran
#
#
# --------------------------------------------------------------------

clear
# clear result page
echo "- COORDINATE2 COORDTESTER v2.2" > z.test/result.txt
echo "- made by madeforlosers 2026" >> z.test/result.txt
echo "- result page for the tests!!" >> z.test/result.txt


# create temporary file run.coo to run test code
touch z.test/run.coo
touch z.test/exp.txt
touch z.test/res.txt

# compile file using ./runjar.sh, put out to /dev/null
# do this so it doesn't have to compile for every test (very slow)
./runjar.sh -silent input.coo > /dev/null

# flags to let loop know what to log
let "expc=0"
let "done=0"

resulting=""

# counter for output
let "counter=1"

# increment through lines of testsML.txt
while IFS= read -r line; do
    # $line is the text of the current line we're on in testsML.txt
    
    # if it's on this, the input has ended and is ready to be tested
    if [[ "${line:0:5}" == ";-end" ]]; then
        let "done=1"
    fi

    # if it's not done, 
    if [ $done -eq 0 ]; then

        # if it's on this, that means the code part of input is done
        # and it should switch to logging the expected result
        if [[ "${line:0:5}" == ";-res" ]]; then
            let "expc=1"
        fi
        
        # make sure we ignore all comment lines
        if [[ "${line:0:1}" != ";" ]]; then
            # make sure we're logging the right thing
            if [ $expc -eq 0 ]; then
                # append line of code to run file
                echo $line >> z.test/run.coo
            else
                # append line of expected result to result file for comparison
                echo $line >> z.test/exp.txt
            fi
        fi
    else
        clear
        echo -e "\e[HTEST $counter $resulting"  
        # run coordinate2 program, log its result
        java -jar Runner.jar z.test/run.coo | tee z.test/res.txt
        # strip unneeded lines
        printf "%s\n" "$(< z.test/res.txt)" > z.test/res.txt
        printf "%s\n" "$(< z.test/exp.txt)" > z.test/exp.txt
        # let user know what test we're on
        echo -n "TEST $counter ; " >> z.test/result.txt

        # compare the 2 files
        if cmp -s "z.test/res.txt" "z.test/exp.txt"; then
            
            resulting+="O"
            # echo -e "\e[HTEST $counter SUCCESS"
            echo "SUCCESS" >> z.test/result.txt

        else
            resulting+="X"
            # echo -e "\e[HTEST $counter FAIL"
            echo "FAIL" >> z.test/result.txt
            echo "expectation:" >> z.test/result.txt
            cat z.test/exp.txt >> z.test/result.txt
            echo "test return:" >> z.test/result.txt
            cat z.test/res.txt >> z.test/result.txt

        fi

        # update result page
        echo "" >> z.test/result.txt

        # revert everything and increment counter
        let "expc=0"
        let "done=0"
        > z.test/exp.txt
        > z.test/res.txt
        > z.test/run.coo
        let "counter+=1"
        echo -e "\e[HTEST $counter $resulting"
    fi
    
done < "z.test/tests.txt"

# remove temp files
rm z.test/run.coo
rm z.test/res.txt
rm z.test/exp.txt

echo "TESTS DONE! check z.test/result.txt to see results"