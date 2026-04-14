package coordinate.main.Functions.List;

import java.util.ArrayList;

public class Manipulation {

    public static String glue(ArrayList<String> item) {
        return String.join("", item);
    }

    public static String glue(ArrayList<String> item, String delimiter) {
        return String.join(delimiter, item);
    }

    public static Object recruit(ArrayList<?> list, Long item) {
        ArrayList<Object> nlist = new ArrayList<>(list);
        nlist.add(item);
        return nlist;
    }

    public static Object recruit(ArrayList<?> list, Double item) {
        ArrayList<Object> nlist = new ArrayList<>(list);
        nlist.add(item);
        return nlist;
    }

    public static Object recruit(ArrayList<?> list, String item) {
        ArrayList<Object> nlist = new ArrayList<>(list);
        nlist.add(item);
        return nlist;
    }

    public static Object edit(ArrayList<?> str, Long id, Object text) {
        ArrayList<Object> build = new ArrayList<>();
        for (int n = 0; n < str.size(); n++) {
            if (n == id) {
                build.add(text);
            } else {
                build.add(str.get(n));
            }
        }
        return build;
    }

    public static Object edit(ArrayList<?> str, Long id, ArrayList<?> text) {
        ArrayList<Object> build = new ArrayList<>();
        for (int n = 0; n < str.size(); n++) {
            if (n == id) {
                build.add(text.get(n));
            } else {
                build.add(str.get(n));
            }
        }
        return build;
    }
}
