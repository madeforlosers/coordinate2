package coordinate.main.Functions.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Manipulation {

    public static String add(String one, String two) {
        return one + two;
    }

    public static String reverse(String in) {
        String out = "";
        for (String g : in.split("")) {
            out = g + out;
        }
        return out;
    }

    public static String cut(String item, Long start) {
        return item.substring(start.intValue());
    }

    public static String cut(String item, Long start, Long end) {
        return item.substring(start.intValue(), end.intValue());
    }

    public static Long find(String item, String find) {
        return (long) item.indexOf(find);
    }

    public static String pad(String item, String chr, Long tolength) {
        return chr.repeat(tolength.intValue() - item.length()) + item;
    }

    public static String replace(String item, String what, String with) {
        return item.replace(what, with);
    }

    public static String insertafter(String item, String find, String insert) {
        return item.replace(find, find + insert);
    }

    public static ArrayList<String> split(String item, String spl) {
        return new ArrayList<String>(Arrays.asList(item.split(Pattern.quote(spl))));
    }

    public static ArrayList<String> chararray(String item) {
        return split(item, "");
    }

    public static String edit(String str, Long id, String text) {
        String build = "";
        for (int n = 0; n < str.length(); n++) {
            if (n == id) {
                build += text;
            } else {
                build += str.charAt(n);
            }
        }
        return build;
    }

    public static String repeat(String str, Long rep) {
        return str.repeat(rep.intValue());
    }

    public static String repeat(String str, Double rep) {
        return str.repeat(rep.intValue());
    }

}
