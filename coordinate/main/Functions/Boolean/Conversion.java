package coordinate.main.Functions.Boolean;

import coordinate.main.Error;

public class Conversion {
    
    public static Double todec(boolean number) {
        try {
            return number ? 1.0 : 0.0;
        } catch (NumberFormatException e) {
            Error.throwError(2);
            return 67.0;
        }
    }

    public static Long toint(Boolean number) {
        try {
            return number ? 1L : 0L;
        } catch (NumberFormatException e) {
            Error.throwError(2);
            return 67L;
        }
    }

    public static String tostr(boolean number) {
        return number ? "true" : "false";
    }

}
