package coordinate.main;

import java.math.BigInteger;

public class Utils {

    // From Nums.java
    public static int parseInt(int item) {
        return parseInt(String.valueOf(item));
    }

    public static BigInteger parseInt(BigInteger item) {
        return item;
    }

    public static int parseInt(String item) {
        try {
            return Integer.parseInt(item);
        } catch (NumberFormatException e) {
            coordinate.main.Error.throwError(4);
        }
        return 0; // womp
    }

    public static int parseInt(Object item) {
        if (item instanceof Integer) {
            return (Integer) item;
        } else if (item instanceof BigInteger) {
            try {
                return ((BigInteger) item).intValueExact();
            } catch (ArithmeticException e) {
                coordinate.main.Error.throwError(4);
            }
        }
        coordinate.main.Error.throwError(4);
        return 0;
    }

    public static String stripInlineComments(String code) {
        String result = "";
        boolean inString = false;
        char stringChar = 0;

        for (int i = 0; i < code.length(); i++) {
            char chr = code.charAt(i);
            if (chr == '"') {
                if (!inString) {
                    inString = true;
                    stringChar = chr;
                } else if (chr == stringChar) {
                    inString = false;
                    stringChar = 0;
                }
                result += chr;
                continue;
            }
            if (chr == ';' && !inString) {
                while (i < code.length() && code.charAt(i) != '\n') {
                    i++;
                }
                if (i < code.length())
                    result += "\n";
                continue;
            }
            result += chr;
        }
        return result;
    }

    public static String[] splitCom(String s, char item) {
        char[] result = s.toCharArray();
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            a += ("{[()]}".indexOf(result[i]) + 4) % 7 - 3;
            result[i] = result[i] == item && a == 0 ? '\n' : result[i];
        }
        return new String(result).split("\n");
    }
}