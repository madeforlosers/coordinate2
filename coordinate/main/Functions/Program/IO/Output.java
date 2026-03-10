package coordinate.main.Functions.Program.IO;

import java.util.ArrayList;

public class Output {

    public static void puts(String item) {
        System.out.println(item);
    }

    public static void puts(Object item) {
        System.out.println(item);
    }

    public static void puts(Boolean item) {
        System.out.println(item);
    }

    public static void puts(Long item) {
        System.out.println(item);
    }

    public static void puts(Double item) {
        if (item - Math.floor(item) == 0 && !item.toString().contains("E")) {
            System.out.println(item.intValue());
        } else {
            System.out.println(item);
        }

    }

    public static void putsin(String item) {
        System.out.print(item);
    }

    public static void putsin(Boolean item) {
        System.out.print(item);
    }

    public static void putsin(Long item) {
        System.out.print(item);
    }

    public static void putsin(Double item) {
        System.out.print(item);
    }

    public static void puts(ArrayList<?> item) {
        System.out.println(item.toString().replaceAll("\\.0(?![0-9])", ""));
    }
}
