# Coordinate2

## STATE OF LANGUAGE

The state of the language as a whole is deemed **MAJORLY INCOMPLETE**

this means that Coordinate2 code working in one commit will most likely not work in the next. it is highly recommended to not code in it right now.

| feature | not started | incomplete, non/semi-functional | incomplete, functional | done maybe |
|---|---|---|---|---|
| math |  |  | X |  |
| output |  |  |  | X |
| input |  |  | X |  |
| strings |  |  | X |  |
| string manipulation | X |  |  |  |
| lists |  | X |  |  |
| list manipulation |  | X |  |  |
| comparisons |  |  |  | X |
| flow control |  |  | X |  |
| type conversion |  |  |  | X |
| more type support | X |  |  |  |
| better modulation | | X |  |  |
| switch to BigDecimal instead of doubles  | X |  |  |  |
| switchover to overloaded methods |  | X |  |  |

## ABOUT


This is a language branched off of [coordinate](https://github.com/madeforlosers/coordinate), marked as the "better" version.

Originally, I wrote coordinate in Node.js. I got so pissed off by Node.js that I decided to code coordinate in an entirely different language I only have experience for in my coding classes. I would like to thank Google, W3Schools, StackOverflow, and GeeksForGeeks as contributers. NO AI!!!

This also means that the original coordinate repository (when i get this finished) will be DEPRECATED!! THIS is the better version! Trust me!

for now, ALL code has to be ran from `input.coo`. SORRY!!

# TO COMPILE

run the `runjar.sh` file. This automatically compiles to .class-es and .jar-s, and runs. it also changes `stats.txt` depending on whether it compiled successfully or not.

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
