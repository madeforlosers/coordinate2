package coordinate.main;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import java.util.Collections;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Functions {
    public static Object push(Object item) {
        Runner.memory.push(item);
        return item;
    }

    public static Object set(int index, Object item) {
        Runner.memory.set((int) index, item);
        return item;
    }

    public static double increment(int index) {
        Runner.memory.set(index, 1.0 +Help.doub(Runner.memory.get(index)));
        return Help.doub(Runner.memory.get((int) index)) - 1.0;
    }

    public static double decrement(int index) {
        Runner.memory.set(index, Help.doub(Runner.memory.get(index)) - 1.0);
        return Help.doub(Runner.memory.get((int) index)) + 1.0;
    }

    public static boolean more(double number1, double number2) {
        // list func here
        return number1 > number2;
    }

    public static boolean less(double number1, double number2) {
        // list func here
        return number1 < number2;
    }

    public static boolean moreis(double number1, double number2) {
        // list func here
        return number1 >= number2;
    }

    public static boolean lessis(double number1, double number2) {
        // list func here
        return number1 >= number2;
    }

    // hasnumber
    public static boolean is(Object number1, Object number2) {
        if ((number1 instanceof String && number2 instanceof String) ||
                (number1 instanceof java.util.ArrayList) && (number2 instanceof java.util.ArrayList)) {
            return number1.equals(number2);
        }
        double num1 = ((Number) number1).doubleValue(); // goddddddddddd
        double num2 = ((Number) number2).doubleValue();
        return num1 == num2;
    }

    public static String ask(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(question);
        String answer = scanner.nextLine();
        scanner.close(); // memory leak! :3
        return answer;
    }

    public static double subtract(double number1, double number2) {
        // list func here
        return number1 - number2;
    }

    public static double add(double number1, double number2) {
        // list func here
        return number1 + number2;
    }

    public static double multiply(double number1, double number2) {
        // list func here
        return number1 * number2;
    }

    public static double divide(double number1, double number2) {
        // list func here
        return number1 / number2;
    }

    public static int and(int number1, int number2) {
        // list func here
        return number1 & number2;
    }

    public static double or(int number1, int number2) {
        // list func here
        return number1 | number2;
    }

    public static double xor(int number1, int number2) {
        // list func here
        return number1 ^ number2;
    }

    public static boolean not(boolean bool) {
        // list func here
        return !bool;
    }

    public static double modulo(double number1, double number2) {
        // list func here
        return number1 % number2;
    }

    public static double exp(double number1, double number2) {
        // list func here
        return Math.pow(number1, number2);
    }

    public static double root(double number1, double number2) {
        // list func here
        return Math.pow(number1, 1.0 / number2);
    }

    public static Object get(int index) {
        return Runner.memory.get(index);
    }

    public static int toint(Object number) {
        if (number instanceof String) {
            return Integer.parseInt(String.valueOf(number));
        }
        return ((Number) number).intValue();
    }

    public static double log(double number, double base) {
        return Math.log(base) / Math.log(number);
    }

    public static double abs(double number) {
        return Math.abs(number);
    }

    public static double todouble(Object number) {
        if (number instanceof String) {
            return Double.parseDouble(String.valueOf(number));
        }
        return Help.doub(number);
    }

    public static double round(double number) {
        return (double) Math.round(number);
    }

    public static double fix(double number, int digits) {
        double scale = Math.pow(10, digits);
        return Math.round(number * scale) / scale;
    }

    public static int ceil(double number) {
        return (int) Math.ceil(number);
    }

    public static double fpart(double number) {
        return number - Math.floor(number);
    }

    public static Number min(ArrayList<Number> arguments) {
        Number item = Double.POSITIVE_INFINITY;
        for (int i = 0; i < arguments.size(); i++) {
            if (item.doubleValue() > Double.valueOf(String.valueOf(arguments.get(i)))) {
                item = arguments.get(i);
            }
        }
        return item;
    }

    public static Number max(ArrayList<Number> arguments) {
        Number item = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < arguments.size(); i++) {
            if (item.doubleValue() < Double.valueOf(String.valueOf(arguments.get(i)))) {
                item = arguments.get(i);
            }
        }
        return item;
    }

    public static Object single(ArrayList<Object> list, int index) {
        return list.get(index);
    }

    public static ArrayList<Object> piece(int start, int end) {
        return new ArrayList<>(Runner.memory.tape.subList(start, end + 1));
    }

    public static ArrayList<Object> aslist(Object[] arguments) {
        ArrayList<Object> doubleList = new ArrayList<>();

        for (Object value : arguments) {
            doubleList.add(value); // this is so stupid
        }
        return doubleList;
    }

    public static void check(boolean item) {
        if (!item) {
            int skip = 0;
            for (int h = Runner.i + 1; h < Runner.codeSp.length; h++) {
                if (Runner.codeSp[h].split("\\(")[0].equals("check")) {
                    skip++;
                }
                if (Runner.codeSp[h].split("\\(")[0].equals("endch") && skip != 0) {
                    skip--;
                }
                if (Runner.codeSp[h].split("\\(")[0].equals("otherwise") && skip == 0) {
                    Runner.i = h;
                    break;
                }
                if (Runner.codeSp[h].split("\\(")[0].equals("endch") && skip == 0) {
                    Runner.i = h;
                    break;
                }
            }
        }
    }

    public static void loopwhile(boolean condition) {
        if (!condition) {
            int skip = 0;
            for (int h = Runner.i; h < Runner.codeSp.length; h++) {
                if (Runner.codeSp[h].split("\\(")[0].equals("loopwhile")) {
                    skip++;
                }
                if (Runner.codeSp[h].split("\\(")[0].equals("endloop") && skip != 0) {
                    skip--;
                }
                if (Runner.codeSp[h].split("\\(")[0].equals("endloop") && skip == 0) {
                    Runner.i = h;
                    break;
                }
            }
        }
    }

    public static void endloop(Object obj) {

        int skip = 0;
        for (int h = Runner.i; h >= 0; h--) {
            if (Runner.codeSp[h].split("\\(")[0].equals("endloop")) {
                skip++;
            }
            if (Runner.codeSp[h].split("\\(")[0].equals("loopwhile") && skip != 0) {
                skip--;
            }
            if (Runner.codeSp[h].split("\\(")[0].equals("loopwhile") && skip == 0) {
                Runner.i = h - 1;
                break;
            }

        }
    }

    public static void otherwise(Object obj) {
        int skip = 0;
        for (int h = Runner.i; h < Runner.codeSp.length; h++) {
            if (Runner.codeSp[h].split("\\(")[0].equals("check")) {
                skip++;
            }
            if (Runner.codeSp[h].split("\\(")[0].equals("endch") && skip != 0) {
                skip--;
            }
            if (Runner.codeSp[h].split("\\(")[0].equals("endch") && skip == 0) {
                Runner.i = h;
                break;
            }
        }
    }

    public static void endch(Object obj) {
        // nothing
    }

    public static void puts(Object item) {
        if (item instanceof Double && ((double) item) == Math.floor((double) item)) {
            System.out.println((int) Math.floor(Double.valueOf(String.valueOf(item))));
        } else {
            System.out.println(item);
        }

    }
    public static void putsin(Object item) {
        if (item instanceof Double && ((double) item) == Math.floor((double) item)) {
            System.out.print((int) Math.floor(Double.valueOf(String.valueOf(item))));
        } else {
            System.out.print(item);
        }

    }
}