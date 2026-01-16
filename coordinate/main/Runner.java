package coordinate.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.math.BigInteger;

/*  
 *  COORDINATE LANGUAGE
 *  by madeforlosers 2026
 *  
 *  Runner.java
 *      Main Running code for Coordinate
*/

class Runner {
    // global state for the interpreter
    public static Memory memory = new Memory();
    public static int i = 0; // current instruction index
    public static String[] codeSp; // split code lines


    // unused at the moment, i gotta add the functionality soon
    // static String curFunc = "";
    // static int[] functionC = {};
    // static Object[] funcargs = {};
    // static int[] summation = { 0, 0, 0 };
    // static boolean summationRunning = false;


    // run funcs
    public static Object runFunc(String input) {
        String getFunc = input.split("\\(")[0];

        // make sure its actually a function
        if (!FunctionHandler.testFunc(getFunc)) {
            Error.throwError(8);
        }
        // get args
        String fah = input.split("^\\w+\\(")[1];

        // run through all nested args recursively
        Object[] getArg = Arrays.stream(Utils.splitCom(fah.substring(0, fah.length() - 1), ','))
                .filter(arg -> !arg.equals("") && !arg.equals(","))
                .map(Runner::runCommands)
                .collect(Collectors.toList()).toArray(new Object[0]);

        // run initial function
        return FunctionHandler.runFunc(getFunc, getArg);
    }

    public static Object runCommands(String input) {
        try {
            if (input.matches("^\"[^\"]+\"$")) { // string
                return input.replaceAll("\"", "");
            }
            if (input.matches("^\\w+\\(.*\\)$")) { // function
                return runFunc(input);
            }
            if (input.matches("^[0-9]+$")) { // number
                return new BigInteger(input);
            }
        } catch (Exception e) {
            System.err.println("erm " + input);
            e.printStackTrace();
            System.exit(1);
        }
        return input;
    }

    public static void main(String[] args) {
        String filePath = args.length > 0 ? args[0] : "input.coo"; // get file
        String code = "";
        try {
            code = Files.readString(Path.of(filePath));
        } catch (IOException e) {
            System.err.println("fix yo file mista white " + filePath);
            e.printStackTrace();
            System.exit(1);
        }

        codeSp = Utils.stripInlineComments(code).split("\n"); // remove comments and split by newline
        try {
            for (i = 0; i < codeSp.length; i++) {
                runCommands(codeSp[i].trim()); // run all the commands!!
            }
        } finally {
            memory.input.close(); // ensure input is closed
        }
    }
}