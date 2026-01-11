
echo "Compiling..."

javac $(find . -name "*.java")
if [ $? -eq 0 ]; then
    echo "IT ALL COMPILED!!!"
else
    echo "IT DIDNT COMPILE :( FIX UR MISTAKE GOOBER"
fi
echo "packing into jar.."
jar cfm Runner.jar manifest.txt coordinate
echo "ya!"
java -jar Runner.jar