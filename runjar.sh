# JRAS (Jar Run And Stats) by madeforlosers 2026
# version 1.2
# usage: ./runjar.sh [-silent] [file]

[[ $1 != "-silent" ]] && echo "Compiling..."


if [[ $1 != "-silent" ]]; then

    # find all .class files
    javac $(find . -name "*.java")

else

    # make sure we supress warnings because its silent!!
    javac -XDsuppressNotes $(find . -name "*.java")

fi

# check end result of compile
if [ $? -eq 0 ]; then
    # it compiled

    [[ $1 != "-silent" ]] && echo "packing into jar.."

    # pack into jar
    jar cfm Runner.jar manifest.txt coordinate

    [[ $1 != "-silent" ]] && echo "packed! running!"

    # update stats.txt
    inc=$(($(head -n 1 stats.txt | cut -c 10-) + 1))
    sed -i "1cSuccess: $inc" stats.txt

    # account for flag if given, run Runner.jar
    if [[ $1 != "-silent" ]]; then
        java -jar Runner.jar $1
    else
        java -jar Runner.jar $2
    fi

else
    # it did not compile

    [[ $1 != "-silent" ]] && echo "IT DIDNT COMPILE :( FIX UR MISTAKE GOOBER"

    # update stats.txt
    inc=$(($(tail -n 1 stats.txt | cut -c 7-) + 1))
    sed -i "2cFail: $inc" stats.txt

fi