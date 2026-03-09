package coordinate.main.Functions.Boolean;

import coordinate.main.Error;

public class Operations {

    public static boolean not(Boolean bool) {
        // list func here
        return !bool;
    }

    public static boolean not(Long bool) {
        // list func here
        return bool.compareTo(0L) == 0;
    }

    public static boolean not(Double bool) {
        // list func here
        return bool.compareTo(0d) == 0;
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
