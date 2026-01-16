package coordinate.main;

/*  
 *  COORDINATE LANGUAGE
 *  by madeforlosers 2026
 *  
 *  Utils.java
 *      Basic utils to help
 * 
 *  TODO:
 *      comment code more
*/

public class Utils {

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