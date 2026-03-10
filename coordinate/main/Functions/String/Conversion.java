package coordinate.main.Functions.String;

import coordinate.main.Error;

public class Conversion {

    public static Double todec(String number) {
        try {
            return Double.valueOf(number);
        } catch (NumberFormatException e) {
            Error.throwError(2);
            return 67d;
        }
    }

    public static Long toint(String number) {
        try {
            return Long.valueOf(number);
        } catch (NumberFormatException e) {
            Error.throwError(2);
            return 67L;
        }
    }

    public static String tostr(String number) {
        return number;
    }

    public static Long charcode(String chr) {
        return (long) chr.codePointAt(0);
    }

}
