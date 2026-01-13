
echo "Compiling..."

javac $(find . -name "*.java")
if [ $? -eq 0 ]; then
    echo "IT ALL COMPILED!!!"
    echo "packing into jar.."
    jar cfm Runner.jar manifest.txt coordinate
    echo "packed! running!"
    inc=$(($(head -n 1 stats.txt | cut -c 10-) + 1))
    sed -i "1cSuccess: $inc" stats.txt
    java -jar Runner.jar
else
    echo "IT DIDNT COMPILE :( FIX UR MISTAKE GOOBER"
    inc=$(($(tail -n 1 stats.txt | cut -c 7-) + 1))
    sed -i "2cFail: $inc" stats.txt
fi