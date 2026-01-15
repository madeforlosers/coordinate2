package coordinate.main;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;
/* god: my child will modularize all of their code and
*  keep filesizes down to a minimum.
*  
*  satan:
*/ 

public class Functions {
    public static Object push(Object item) {
        Runner.memory.push(item);
        return item;
    }

    public static Object set(BigDecimal index, Object item) {
        Runner.memory.set(index.intValue(), item);
        return item;
    }

    public static double increment(Integer index) {
        Runner.memory.set(index, 1.0 + Help.doub(Runner.memory.get(index)));
        return Help.doub(Runner.memory.get((int) index)) - 1.0;
    }

    public static double decrement(Integer index) {
        Runner.memory.set(index, Help.doub(Runner.memory.get(index)) - 1.0);
        return Help.doub(Runner.memory.get((int) index)) + 1.0;
    }

    public static boolean more(Double number1, Double number2) {
        // list func here
        return number1 > number2;
    }

    public static boolean more(Integer number1, Double number2) {
        // list func here
        return number1 > number2;
    }

    public static boolean more(Double number1, Integer number2) {
        // list func here
        return number1 > number2;
    }

    public static boolean more(Integer number1, Integer number2) {
        // list func here
        return number1 > number2;
    }

    public static boolean less(Double number1, Double number2) {
        // list func here
        return number1 < number2;
    }

    public static boolean less(Integer number1, Double number2) {
        // list func here
        return number1 < number2;
    }

    public static boolean less(Double number1, Integer number2) {
        // list func here
        return number1 < number2;
    }

    public static boolean less(Integer number1, Integer number2) {
        // list func here
        return number1 < number2;
    }

    public static boolean moreis(Double number1, Double number2) {
        // list func here
        return number1 >= number2;
    }

    public static boolean moreis(Integer number1, Double number2) {
        // list func here
        return number1 >= number2;
    }

    public static boolean moreis(Double number1, Integer number2) {
        // list func here
        return number1 >= number2;
    }

    public static boolean moreis(Integer number1, Integer number2) {
        // list func here
        return number1 >= number2;
    }

    public static boolean lessis(Double number1, Double number2) {
        // list func here
        return number1 >= number2;
    }

    public static boolean lessis(Integer number1, Double number2) {
        // list func here
        return number1 >= number2;
    }

    public static boolean lessis(Double number1, Integer number2) {
        // list func here
        return number1 >= number2;
    }

    public static boolean lessis(Integer number1, Integer number2) {
        // list func here
        return number1 >= number2;
    }

    // hasnumber

    public static boolean is(Double number1, Double number2) {
        return number1 == number2;
    }

    public static boolean is(Double number1, Integer number2) {
        return number1 == (double) number2;
    }

    public static boolean is(Integer number1, Double number2) {
        return (double) number1 == number2;
    }

    public static boolean is(Integer number1, Integer number2) {
        return number1 == number2;
    }

    public static boolean is(String number1, String number2) {
        return number1.equals(number2);
    }

    public static String ask(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(question);
        String answer = scanner.nextLine();
        scanner.close(); // memory leak! :3
        return answer;
    }

    public static double subtract(Double number1, Double number2) {
        // list func here
        return number1 - number2;
    }

    public static double subtract(Double number1, Integer number2) {
        // list func here
        return number1 - number2;
    }

    public static double subtract(Integer number1, Double number2) {
        // list func here
        return number1 - number2;
    }

    public static int subtract(Integer number1, Integer number2) {
        // list func here
        return number1 - number2;
    }

    public static double add(Double number1, Double number2) {
        // list func here
        return number1 + number2;
    }

    public static int add(Integer number1, Integer number2) {
        // list func here
        return number1 + number2;
    }

    public static double add(Double number1, Integer number2) {
        // list func here
        return number1 + number2;
    }

    public static double add(Integer number1, Double number2) {
        // list func here
        return number1 + number2;
    }

    public static double multiply(Double number1, Double number2) {
        // list func here
        return number1 * number2;
    }

    public static double multiply(Integer number1, Double number2) {
        // list func here
        return number1 * number2;
    }

    public static double multiply(Double number1, Integer number2) {
        // list func here
        return number1 * number2;
    }

    public static int multiply(Integer number1, Integer number2) {
        // list func here
        return number1 * number2;
    }

    public static double divide(Double number1, Double number2) {
        // list func here
        return number1 / number2;
    }

    public static double divide(Double number1, Integer number2) {
        // list func here
        return number1 / number2.doubleValue();
    }

    public static double divide(Integer number1, Double number2) {
        // list func here
        return number1.doubleValue() / number2;
    }

    public static double divide(Integer number1, Integer number2) {
        // list func here
        return number1.doubleValue() / number2.doubleValue();
    }

    public static int and(Integer number1, Integer number2) {
        // list func here
        return number1 & number2;
    }

    public static int or(Integer number1, Integer number2) {
        // list func here
        return number1 | number2;
    }

    public static int xor(Integer number1, Integer number2) {
        // list func here
        return number1 ^ number2;
    }

    public static boolean not(boolean bool) {
        // list func here
        return !bool;
    }

    public static boolean not(Integer bool) {
        // list func here
        return !(bool != 0);
    }

    public static boolean not(Double bool) {
        // list func here
        return !(bool != 0);
    }

    public static int modulo(Double number1, Double number2) {
        // list func here
        return number1.intValue() % number2.intValue();
    }

    public static int modulo(Integer number1, Double number2) {
        // list func here
        return number1 % number2.intValue();
    }

    public static int modulo(Double number1, Integer number2) {
        // list func here
        return number1.intValue() % number2;
    }

    public static int modulo(Integer number1, Integer number2) {
        // list func here
        return number1 % number2;
    }

    public static double exp(Double number1, Double number2) {
        // list func here
        return Math.pow(number1, number2);
    }

    public static double exp(Integer number1, Double number2) {
        // list func here
        return Math.pow(number1, number2);
    }

    public static double exp(Double number1, Integer number2) {
        // list func here
        return Math.pow(number1, number2);
    }

    public static double exp(Integer number1, Integer number2) {
        // list func here
        return Math.pow(number1, number2);
    }

    public static double root(Double number1, Double number2) {
        // list func here
        return Math.pow(number1, 1.0 / number2);
    }

    public static double root(Integer number1, Double number2) {
        // list func here
        return Math.pow(number1, 1.0 / number2);
    }

    public static double root(Double number1, Integer number2) {
        // list func here
        return Math.pow(number1, 1.0 / number2.doubleValue());
    }

    public static Object get(Integer index) {
        return Runner.memory.get(index);
    }

    public static Object get(Double index) {
        return Runner.memory.get(index.intValue());
    }

    public static int toint(String number) {
        return Integer.valueOf(number);
    }

    public static int toint(Double number) {
        return number.intValue();
    }

    public static int toint(Integer number) {
        return number.intValue();
    }

    public static double log(Double number, Double base) {
        return Math.log(base) / Math.log(number);
    }

    public static double log(Integer number, Double base) {
        return Math.log(base) / Math.log(number.doubleValue());
    }

    public static double log(Double number, Integer base) {
        return Math.log(base.doubleValue()) / Math.log(number);
    }

    public static double log(Integer number, Integer base) {
        return Math.log(base.doubleValue()) / Math.log(number.doubleValue());
    }

    public static double abs(Double number) {
        return Math.abs(number);
    }

    public static double abs(Integer number) {
        return Math.abs(number);
    }

    public static double todouble(Integer number) {
        return number.doubleValue();
    }

    public static double todouble(String number) {
        return Double.parseDouble(number);
    }

    public static double todouble(Double number) {
        return number.doubleValue();
    }

    public static double round(Double number) {
        return (double) Math.round(number);
    }

    public static double round(Integer number) {
        return number.doubleValue();
    }

    public static double fix(Double number, Integer digits) {
        double scale = Math.pow(10, digits);
        return Math.round(number * scale) / scale;
    }

    public static double fix(Double number, Double digits) {
        double scale = Math.pow(10, digits);
        return Math.round(number * scale) / scale;
    }

    public static int ceil(Double number) {
        return (int) Math.ceil(number);
    }

    public static int ceil(Integer number) {
        return number.intValue();
    }

    public static double fpart(Double number) {
        return number - Math.floor(number);
    }

    public static double fpart(Integer number) {
        return 0.0;
    }

    public static Number min(ArrayList<Number> arguments) {
        Number item = Double.POSITIVE_INFINITY;
        for (Integer i = 0; i < arguments.size(); i++) {
            if (item.doubleValue() > Double.valueOf(String.valueOf(arguments.get(i)))) {
                item = arguments.get(i);
            }
        }
        return item;
    }

    public static Number max(ArrayList<Number> arguments) {
        Number item = Double.NEGATIVE_INFINITY;
        for (Integer i = 0; i < arguments.size(); i++) {
            if (item.doubleValue() < Double.valueOf(String.valueOf(arguments.get(i)))) {
                item = arguments.get(i);
            }
        }
        return item;
    }

    public static Object single(ArrayList<Object> list, Integer index) {
        return list.get(index);
    }

    public static Object single(ArrayList<Object> list, Double index) {
        return list.get(index.intValue());
    }

    public static ArrayList<Object> piece(Integer start, Integer end) {
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
            for (Integer h = Runner.i + 1; h < Runner.codeSp.length; h++) {
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
            for (Integer h = Runner.i; h < Runner.codeSp.length; h++) {
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
        for (Integer h = Runner.i; h >= 0; h--) {
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
        for (Integer h = Runner.i; h < Runner.codeSp.length; h++) {
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

    public static void puts(String item) {
        System.out.println(item);
    }

    public static void puts(Integer item) {
        System.out.println(item);
    }

    public static void puts(Boolean item) {
        System.out.println(item);
    }

    public static void puts(Double item) {
        System.out.println(item);
    }

    public static void putsin(String item) {
        System.out.print(item);
    }

    public static void putsin(Integer item) {
        System.out.print(item);
    }

    public static void putsin(Boolean item) {
        System.out.print(item);
    }

    public static void putsin(Double item) {
        System.out.print(item);
    }
}