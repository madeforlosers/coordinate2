# Coordinate2

This is a language branched off of [coordinate](https://github.com/madeforlosers/coordinate), marked as the "better" version.

Originally, I wrote coordinate in Node.js. I got so pissed off by Node.js that I decided to code coordinate in an entirely different language I only have experience for in my coding classes. I would like to thank Google, W3Schools, StackOverflow, and GeeksForGeeks as contributers. NO AI!!!

This is still a work in progress. As far as I know, the command interpreter is finished (unless theres a few bugs, which there probably is), so all I gotta do is add the commands. Of course, there will be a few I can't add back, or am not willing to add back because I'm too lazy.

This also means that the original coordinate repository (when i get this finished) will be DEPRECATED!! THIS is the better version! Trust me!

for now, ALL code has to be ran from `input.coo`. SORRY!!

# TO COMPILE

run the `runjar.sh` file.

## IF YOU DON'T TRUST THIS FILE (for some ungodly reason)

compile the code into .class files right next to their .java counterparts with this command:

```bash
$ javac $(find . -name "*.java")
```
This finds all the .java files in the CURRENT DIRECTORY and gives them a .class file.

### TO RUN FROM RIGHT HERE:

just run `$ java coordinate.main.Runner`.

### TO COMPILE INTO JAR:

```bash
$ jar cfm Runner.jar manifest.txt coordinate
```
this compiles it into a jar, along with the manifest.txt file in it.

now just run `java -jar Runner.jar`. it should work.
