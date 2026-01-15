package coordinate.main;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.BigInteger;
import coordinate.Error;
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

    public static Object set(BigInteger index, String item) {
        Runner.memory.set(index.intValue(), item);
        return item;
    }
    public static Object set(BigInteger index, BigDecimal item) {
        Runner.memory.set(index.intValue(), item);
        return item;
    }

    public static BigDecimal increment(BigInteger index) {
        if (!(Runner.memory.get(index.intValue()) instanceof java.math.BigDecimal)) {
            Error.throwError(2);
        }
        Runner.memory.set(index.intValue(),
                new BigDecimal(String.valueOf(Runner.memory.get(index.intValue()))).add(BigDecimal.ONE));
        return new BigDecimal(String.valueOf(Runner.memory.get(index.intValue()))).subtract(BigDecimal.ONE);
    }

    public static BigDecimal decrement(BigInteger index) {
        if (!(Runner.memory.get(index.intValue()) instanceof java.math.BigDecimal)) {
            Error.throwError(2);
        }
        Runner.memory.set(index.intValue(),
                new BigDecimal(String.valueOf(Runner.memory.get(index.intValue()))).subtract(BigDecimal.ONE));
        return new BigDecimal(String.valueOf(Runner.memory.get(index.intValue()))).add(BigDecimal.ONE);
    }

    public static boolean more(BigDecimal number1, BigDecimal number2) {
        // list func here
        return number1.compareTo(number2) == 1;
    }

    public static boolean more(BigInteger number1, BigDecimal number2) {
        // list func here
        return new BigDecimal(number1).compareTo(number2) == 1;
    }

    public static boolean more(BigDecimal number1, BigInteger number2) {
        // list func here
        return number1.compareTo(new BigDecimal(number2)) == 1;
    }

    public static boolean more(BigInteger number1, BigInteger number2) {
        // list func here
        return number1.compareTo(number2) == 1;
    }

    public static boolean less(BigDecimal number1, BigDecimal number2) {
        // list func here
        return number1.compareTo(number2) == -1;
    }

    public static boolean less(BigInteger number1, BigDecimal number2) {
        // list func here
        return new BigDecimal(number1).compareTo(number2) == -1;
    }

    public static boolean less(BigDecimal number1, BigInteger number2) {
        // list func here
        return number1.compareTo(new BigDecimal(number2)) == -1;
    }

    public static boolean less(BigInteger number1, BigInteger number2) {
        // list func here
        return number1.compareTo(number2) == -1;
    }

    public static boolean moreis(BigDecimal number1, BigDecimal number2) {
        // list func here
        return number1.compareTo(number2) >= 0;
    }

    public static boolean moreis(BigInteger number1, BigDecimal number2) {
        // list func here
        return new BigDecimal(number1).compareTo(number2) >= 0;
    }

    public static boolean moreis(BigDecimal number1, BigInteger number2) {
        // list func here
        return number1 >= number2;
    }

    public static boolean moreis(BigInteger number1, BigInteger number2) {
        // list func here
        return number1 >= number2;
    }

    public static boolean lessis(BigDecimal number1, BigDecimal number2) {
        // list func here
        return number1 >= number2;
    }

    public static boolean lessis(BigInteger number1, BigDecimal number2) {
        // list func here
        return number1 >= number2;
    }

    public static boolean lessis(BigDecimal number1, BigInteger number2) {
        // list func here
        return number1 >= number2;
    }

    public static boolean lessis(BigInteger number1, BigInteger number2) {
        // list func here
        return number1 >= number2;
    }

    // hasnumber

    public static boolean is(BigDecimal number1, BigDecimal number2) {
        return number1 == number2;
    }

    public static boolean is(BigDecimal number1, BigInteger number2) {
        return number1 == (double) number2;
    }

    public static boolean is(BigInteger number1, BigDecimal number2) {
        return (double) number1 == number2;
    }

    public static boolean is(BigInteger number1, BigInteger number2) {
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

    public static double subtract(BigDecimal number1, BigDecimal number2) {
        // list func here
        return number1 - number2;
    }

    public static double subtract(BigDecimal number1, BigInteger number2) {
        // list func here
        return number1 - number2;
    }

    public static double subtract(BigInteger number1, BigDecimal number2) {
        // list func here
        return number1 - number2;
    }

    public static int subtract(BigInteger number1, BigInteger number2) {
        // list func here
        return number1 - number2;
    }

    public static double add(BigDecimal number1, BigDecimal number2) {
        // list func here
        return number1 + number2;
    }

    public static int add(BigInteger number1, BigInteger number2) {
        // list func here
        return number1 + number2;
    }

    public static double add(BigDecimal number1, BigInteger number2) {
        // list func here
        return number1 + number2;
    }

    public static double add(BigInteger number1, BigDecimal number2) {
        // list func here
        return number1 + number2;
    }

    public static double multiply(BigDecimal number1, BigDecimal number2) {
        // list func here
        return number1 * number2;
    }

    public static double multiply(BigInteger number1, BigDecimal number2) {
        // list func here
        return number1 * number2;
    }

    public static double multiply(BigDecimal number1, BigInteger number2) {
        // list func here
        return number1 * number2;
    }

    public static int multiply(BigInteger number1, BigInteger number2) {
        // list func here
        return number1 * number2;
    }

    public static double divide(BigDecimal number1, BigDecimal number2) {
        // list func here
        return number1 / number2;
    }

    public static double divide(BigDecimal number1, BigInteger number2) {
        // list func here
        return number1 / number2.doubleValue();
    }

    public static double divide(BigInteger number1, BigDecimal number2) {
        // list func here
        return number1.doubleValue() / number2;
    }

    public static double divide(BigInteger number1, BigInteger number2) {
        // list func here
        return number1.doubleValue() / number2.doubleValue();
    }

    public static int and(BigInteger number1, BigInteger number2) {
        // list func here
        return number1 & number2;
    }

    public static int or(BigInteger number1, BigInteger number2) {
        // list func here
        return number1 | number2;
    }

    public static int xor(BigInteger number1, BigInteger number2) {
        // list func here
        return number1 ^ number2;
    }

    public static boolean not(boolean bool) {
        // list func here
        return !bool;
    }

    public static boolean not(BigInteger bool) {
        // list func here
        return !(bool != 0);
    }

    public static boolean not(BigDecimal bool) {
        // list func here
        return !(bool != 0);
    }

    public static int modulo(BigDecimal number1, BigDecimal number2) {
        // list func here
        return number1.intValue() % number2.intValue();
    }

    public static int modulo(BigInteger number1, BigDecimal number2) {
        // list func here
        return number1 % number2.intValue();
    }

    public static int modulo(BigDecimal number1, BigInteger number2) {
        // list func here
        return number1.intValue() % number2;
    }

    public static int modulo(BigInteger number1, BigInteger number2) {
        // list func here
        return number1 % number2;
    }

    public static double exp(BigDecimal number1, BigDecimal number2) {
        // list func here
        return Math.pow(number1, number2);
    }

    public static double exp(BigInteger number1, BigDecimal number2) {
        // list func here
        return Math.pow(number1, number2);
    }

    public static double exp(BigDecimal number1, BigInteger number2) {
        // list func here
        return Math.pow(number1, number2);
    }

    public static double exp(BigInteger number1, BigInteger number2) {
        // list func here
        return Math.pow(number1, number2);
    }

    public static double root(BigDecimal number1, BigDecimal number2) {
        // list func here
        return Math.pow(number1, 1.0 / number2);
    }

    public static double root(BigInteger number1, BigDecimal number2) {
        // list func here
        return Math.pow(number1, 1.0 / number2);
    }

    public static double root(BigDecimal number1, BigInteger number2) {
        // list func here
        return Math.pow(number1, 1.0 / number2.doubleValue());
    }

    public static Object get(BigInteger index) {
        return Runner.memory.get(index);
    }

    public static Object get(BigDecimal index) {
        return Runner.memory.get(index.intValue());
    }

    public static int toint(String number) {
        return BigInteger.valueOf(number);
    }

    public static int toint(BigDecimal number) {
        return number.intValue();
    }

    public static int toint(BigInteger number) {
        return number.intValue();
    }

    public static double log(BigDecimal number, BigDecimal base) {
        return Math.log(base) / Math.log(number);
    }

    public static double log(BigInteger number, BigDecimal base) {
        return Math.log(base) / Math.log(number.doubleValue());
    }

    public static double log(BigDecimal number, BigInteger base) {
        return Math.log(base.doubleValue()) / Math.log(number);
    }

    public static double log(BigInteger number, BigInteger base) {
        return Math.log(base.doubleValue()) / Math.log(number.doubleValue());
    }

    public static double abs(BigDecimal number) {
        return Math.abs(number);
    }

    public static double abs(BigInteger number) {
        return Math.abs(number);
    }

    public static double todouble(BigInteger number) {
        return number.doubleValue();
    }

    public static double todouble(String number) {
        return BigDecimal.parseBigDecimal(number);
    }

    public static double todouble(BigDecimal number) {
        return number.doubleValue();
    }

    public static double round(BigDecimal number) {
        return (double) Math.round(number);
    }

    public static double round(BigInteger number) {
        return number.doubleValue();
    }

    public static double fix(BigDecimal number, BigInteger digits) {
        double scale = Math.pow(10, digits);
        return Math.round(number * scale) / scale;
    }

    public static double fix(BigDecimal number, BigDecimal digits) {
        double scale = Math.pow(10, digits);
        return Math.round(number * scale) / scale;
    }

    public static int ceil(BigDecimal number) {
        return (int) Math.ceil(number);
    }

    public static int ceil(BigInteger number) {
        return number.intValue();
    }

    public static double fpart(BigDecimal number) {
        return number - Math.floor(number);
    }

    public static double fpart(BigInteger number) {
        return 0.0;
    }

    public static Number min(ArrayList<Number> arguments) {
        Number item = BigDecimal.POSITIVE_INFINITY;
        for (BigInteger i = 0; i < arguments.size(); i++) {
            if (item.doubleValue() > BigDecimal.valueOf(String.valueOf(arguments.get(i)))) {
                item = arguments.get(i);
            }
        }
        return item;
    }

    public static Number max(ArrayList<Number> arguments) {
        Number item = BigDecimal.NEGATIVE_INFINITY;
        for (BigInteger i = 0; i < arguments.size(); i++) {
            if (item.doubleValue() < BigDecimal.valueOf(String.valueOf(arguments.get(i)))) {
                item = arguments.get(i);
            }
        }
        return item;
    }

    public static Object single(ArrayList<Object> list, BigInteger index) {
        return list.get(index);
    }

    public static Object single(ArrayList<Object> list, BigDecimal index) {
        return list.get(index.intValue());
    }

    public static ArrayList<Object> piece(BigInteger start, BigInteger end) {
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
            for (BigInteger h = Runner.i + 1; h < Runner.codeSp.length; h++) {
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
            for (BigInteger h = Runner.i; h < Runner.codeSp.length; h++) {
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
        for (BigInteger h = Runner.i; h >= 0; h--) {
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
        for (BigInteger h = Runner.i; h < Runner.codeSp.length; h++) {
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

    public static void puts(Boolean item) {
        System.out.println(item);
    }

    public static void puts(BigDecimal item) {
        System.out.println(item);
    }

    public static void putsin(String item) {
        System.out.print(item);
    }

    public static void putsin(Boolean item) {
        System.out.print(item);
    }

    public static void putsin(BigDecimal item) {
        System.out.print(item);
    }
}