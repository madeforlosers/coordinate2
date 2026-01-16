# coordtester by madeforlosers 2026
# tests one-line coordinate2 code to make sure the interpreter works
# 
# version 1.0
#
# TODO: 
#   - add support for custom result and test folder names
#   - add support for multi-line code
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
# --------------------------------------------------------------------


# clear result page
echo -n "" > z.test/result.txt

# create temporary file run.coo to run test code
touch z.test/run.coo

# compile file using ./runjar.sh, put out to /dev/null
# do this so it doesn't have to compile for every test (very slow)
./runjar.sh -silent input.coo > /dev/null

# counter, only used to skip the first 4 lines in tests.txt
let "counter=0"

# increment through lines of tests.txt
while IFS= read -r line; do

  # if counter > 3
  if [ $counter -gt 3 ]; then

    # get code in line to be tested
    code=$(echo $line | cut -d ";" -f 1)

    # get expected result of said code
    exp=$(echo $line | cut -d ";" -f 2)

    # change run.coo to code (so the jar can run it)
    echo $code > z.test/run.coo

    # run test code, get the result
    res=$(java -jar Runner.jar z.test/run.coo)

    # account for comment lines
    cfix=$(( $counter - 3 ))

    # write to result.txt
    echo -n "TEST $cfix: $code ; " >> z.test/result.txt

    if [[ "$res" == "$exp" ]]; then

        echo "TEST $cfix SUCCESS"
        echo "SUCCESS" >> z.test/result.txt

    else

        echo "TEST $cfix FAIL"
        echo "FAIL" >> z.test/result.txt

    fi

    echo "expectation: $exp" >> z.test/result.txt
    echo "test return: $res" >> z.test/result.txt

    # newline
    echo "" >> z.test/result.txt

  fi

  # increment
  let "counter+=1"
done < "z.test/tests.txt"

# delete temporary file
rm z.test/run.coo

echo "TESTS DONE! check z.test/result.txt to see results"