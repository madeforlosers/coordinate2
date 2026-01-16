#usage: ./runjar.sh [-silent] [file]

if [[ $1 != "-silent" ]]; then
    echo "Compiling..."
fi

if [[ $1 != "-silent" ]]; then
    javac $(find . -name "*.java")
else
    javac -XDsuppressNotes $(find . -name "*.java")
fi

if [ $? -eq 0 ]; then
    if [[ $1 != "-silent" ]]; then
        echo "IT ALL COMPILED!!!"
        echo "packing into jar.."
    fi
    jar cfm Runner.jar manifest.txt coordinate
    if [[ $1 != "-silent" ]]; then
        echo "packed! running!"
    fi
    inc=$(($(head -n 1 stats.txt | cut -c 10-) + 1))
    sed -i "1cSuccess: $inc" stats.txt
    if [[ $1 != "-silent" ]]; then
        java -jar Runner.jar $1
    else
        java -jar Runner.jar $2
    fi
else
    echo "IT DIDNT COMPILE :( FIX UR MISTAKE GOOBER"
    inc=$(($(tail -n 1 stats.txt | cut -c 7-) + 1))
    sed -i "2cFail: $inc" stats.txt
fi