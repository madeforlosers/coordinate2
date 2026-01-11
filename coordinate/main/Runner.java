package coordinate.main;

import java.io.IOException;
import java.io.ObjectInputFilter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Function;
import coordinate.Error;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Runner {
    static String curFunc = "";
    public static Memory memory = new Memory();
    static int[] functionC = {};
    static Object[] funcargs = {};
    static int i = 0;
    static int[] summation = { 0, 0, 0 };
    static boolean summationRunning = false;

    public static Object runFunc(String input) {
        String getFunc = input.split("\\(")[0];
        if (!FunctionHandler.testFunc(getFunc)) {
            Error.throwError(8);
        }
        String fah = input.split("^\\w+\\(")[1];

        Object[] getArg = Arrays.stream(Help.splitCom(fah.substring(0, fah.length() - 1), ','))
                .filter(i -> !i.equals(null) && !i.equals(","))
                .map(i -> runCommands(i))
                .collect(Collectors.toList()).toArray(new Object[0]);
        // error catch to make sure all arguments are fufilled.
        // wont work here as far as i know lol

        return FunctionHandler.runFunc(getFunc, getArg);
    }

    public static Object runCommands(String input) {

        if (input.matches("^\"[^\"]+\"$")) {
            return input.replaceAll("\"", "");
        }
        if (input.matches("^\\w+\\(.*\\)+$")) {
            return runFunc(input);
        }
        if (input.matches("^[0-9]+")) {
            return Integer.parseInt(input);
        }
        return input;
    }

    public static void main(String[] args) {
        String code = "";
        try {
            code = Files.readString(Path.of("input.coo"));
        } catch (IOException e) {
            System.out.println(e);
            System.exit(0);
        }

        String[] codeSp = Help.stripInlineComments(code).split("\n");
        for (i = 0; i < codeSp.length; i++) {
            runCommands(codeSp[i].trim());
        }
    }
}