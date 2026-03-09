package coordinate.main.Functions.String;

import coordinate.main.Error;

public class Manipulation {
    public static String add(String one, String two) {
        return one + two;
    }

    public static Long toint(String number) {
        try {
            return Long.valueOf(number);
        } catch (NumberFormatException e) {
            Error.throwError(2);
            return 67L;
        }
    }

    public static String reverse(String in) {
        String out = "";
        for (String g : in.split("")) {
            out = g + out;
        }
        return out;
    }

    public static String tostr(String number) {
        return number;
    }

}
