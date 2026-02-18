package coordinate.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.regex.Pattern;

/*  
 *  COORDINATE LANGUAGE
 *  by madeforlosers 2026
 *  
 *  Functions.java
 *      All of the coordinate functions
 * 
 *  TODO:
 *      error catch
 *      comment code more
*/

public class Functions {
    public static void wait(Long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static Object push(Long item) {
        Runner.memory.tape.push(item);
        return item;
    }

    public static Object push(Double item) {
        Runner.memory.tape.push(item);
        return item;
    }

    public static Object push(String item) {
        Runner.memory.tape.push(item);
        return item;
    }

    public static Object push(ArrayList<?> item) {
        Runner.memory.tape.push(item);
        return item;
    }

    public static String set(Long index, String item) {
        try {
            Runner.memory.tape.set(index.intValue(), item);
        } catch (ArithmeticException e) {
            Error.throwError(2);
        }
        return item;
    }

    public static Object set(Long index, Double item) {
        try {
            Runner.memory.tape.set(index.intValue(), item);
        } catch (ArithmeticException e) {
            Error.throwError(2);
        }
        return item;
    }

    public static Object set(Long index, ArrayList<?> item) {
        try {
            Runner.memory.tape.set(index.intValue(), item);
        } catch (ArithmeticException e) {
            Error.throwError(2);
        }
        return item;
    }

    public static Long set(Long index, Long item) {
        try {
            Runner.memory.tape.set(index.intValue(), item);
        } catch (ArithmeticException e) {
            Error.throwError(2);
        }
        return item;
    }

    public static Double increment(Long index) {
        try {
            Object value = Runner.memory.tape.get(index.intValue());
            if (value == null || !(value instanceof Number)) {
                Error.throwError(2);
            }
            Double current = Double.valueOf(value.toString());
            Double newValue = current + 1;
            Runner.memory.tape.set(index.intValue(), newValue);
            return current;
        } catch (ArithmeticException e) {
            Error.throwError(2);
        }
        return null;
    }

    public static Double decrement(Long index) {
        try {
            Object value = Runner.memory.tape.get(index.intValue());
            if (value == null || !(value instanceof Number)) {
                Error.throwError(2);
            }
            Double current = Double.valueOf(value.toString());
            Double newValue = current - 1;
            Runner.memory.tape.set(index.intValue(), newValue);
            return current;
        } catch (ArithmeticException e) {
            Error.throwError(2);
        }
        return null;
    }

    public static boolean more(Double number1, Double number2) {
        // list func here
        return number1.compareTo(number2) == 1;
    }

    public static ArrayList<Boolean> more(ArrayList<Double> number1, Double number2) {
        ArrayList<Boolean> g = new ArrayList<Boolean>();
        for (double j : number1) {
            g.add(j > number2.doubleValue());
        }
        return g;
    }

    public static ArrayList<Boolean> more(ArrayList<Double> number1, Long number2) {
        return more(number1, number2.doubleValue());
    }

    public static boolean more(Long number1, Double number2) {
        // list func here
        return Double.valueOf(number1.doubleValue()).compareTo(number2) == 1;
    }

    public static boolean more(Double number1, Long number2) {
        // list func here
        return number1.compareTo(number2.doubleValue()) == 1;
    }

    public static boolean more(Long number1, Long number2) {
        // list func here
        return number1.compareTo(number2) == 1;
    }

    public static boolean less(Double number1, Double number2) {
        // list func here
        return number1.compareTo(number2) == -1;
    }

    public static boolean less(Long number1, Double number2) {
        // list func here
        return Double.valueOf(number1.doubleValue()).compareTo(number2) == -1;
    }

    public static boolean less(Double number1, Long number2) {
        // list func here
        return number1.compareTo(number2.doubleValue()) == -1;
    }

    public static boolean less(Long number1, Long number2) {
        // list func here
        return number1.compareTo(number2) == -1;
    }

    public static ArrayList<Boolean> less(ArrayList<Double> number1, Double number2) {
        ArrayList<Boolean> g = new ArrayList<Boolean>();
        for (double j : number1) {
            g.add(j < number2.doubleValue());
        }
        return g;
    }

    public static ArrayList<Boolean> less(ArrayList<Double> number1, Long number2) {
        return less(number1, number2.doubleValue());
    }

    public static boolean moreis(Double number1, Double number2) {
        // list func here
        return number1.compareTo(number2) >= 0;
    }

    public static boolean moreis(Long number1, Double number2) {
        // list func here
        return Double.valueOf(number1.doubleValue()).compareTo(number2) >= 0;
    }

    public static boolean moreis(Double number1, Long number2) {
        // list func here
        return number1.compareTo(number2.doubleValue()) >= 0;
    }

    public static boolean moreis(Long number1, Long number2) {
        // list func here
        return number1.compareTo(number2) >= 0;
    }

    public static ArrayList<Boolean> moreis(ArrayList<Double> number1, Double number2) {
        ArrayList<Boolean> g = new ArrayList<Boolean>();
        for (double j : number1) {
            g.add(j >= number2.doubleValue());
        }
        return g;
    }

    public static ArrayList<Boolean> moreis(ArrayList<Double> number1, Long number2) {
        return moreis(number1, number2.doubleValue());
    }

    public static boolean lessis(Double number1, Double number2) {
        // list func here
        return number1.compareTo(number2) < 1;
    }

    public static boolean lessis(Long number1, Double number2) {
        // list func here
        return Double.valueOf(number1.doubleValue()).compareTo(number2) < 1;
    }

    public static boolean lessis(Double number1, Long number2) {
        // list func here
        return number1.compareTo(Double.valueOf(number2.doubleValue())) < 1;
    }

    public static boolean lessis(Long number1, Long number2) {
        // list func here
        return number1.compareTo(number2) < 1;
    }

    public static ArrayList<Boolean> lessis(ArrayList<Double> number1, Double number2) {
        ArrayList<Boolean> g = new ArrayList<Boolean>();
        for (double j : number1) {
            g.add(j <= number2.doubleValue());
        }
        return g;
    }

    public static ArrayList<Boolean> lessis(ArrayList<Double> number1, Long number2) {
        return lessis(number1, number2.doubleValue());
    }

    // hasnumber

    public static boolean is(Double number1, Double number2) {
        return number1.compareTo(number2) == 0;
    }

    public static boolean is(Double number1, Long number2) {
        return number1.compareTo(Double.valueOf(number2.doubleValue())) == 0;
    }

    public static boolean is(Long number1, Double number2) {
        return Double.valueOf(number1.doubleValue()).compareTo(number2) == 0;
    }

    public static boolean is(Long number1, Long number2) {
        return number1.compareTo(number2) == 0;
    }

    public static boolean is(String number1, String number2) {
        return number1.equals(number2);
    }

    public static ArrayList<Boolean> is(ArrayList<?> number1, Double number2) {
        ArrayList<Boolean> g = new ArrayList<Boolean>();
        for (Object j : number1) {
            g.add(Double.valueOf(String.valueOf(j)) == number2.doubleValue());
        }
        return g;
    }

    public static ArrayList<Boolean> is(ArrayList<?> number1, Long number2) {
        return is(number1, number2.doubleValue());
    }

    public static String ask(String question) {
        System.out.print(question);
        String answer = Runner.memory.input.nextLine();
        return answer;
    }

    public static Double subtract(Double number1, Double number2) {
        // list func here
        return number1 - number2;
    }

    public static Double subtract(Double number1, Long number2) {
        // list func here
        return number1 - number2;
    }

    public static Double subtract(Long number1, Double number2) {
        // list func here
        return number1 - number2;
    }

    public static Long subtract(Long number1, Long number2) {
        // list func here
        return number1 - number2;
    }

    public static Double add(Double number1, Double number2) {
        // list func here
        return number1 + number2;
    }

    public static Long add(Long number1, Long number2) {
        // list func here
        return number1 + number2;
    }

    public static Double add(Double number1, Long number2) {
        // list func here
        return number1 + number2;
    }

    public static Double add(Long number1, Double number2) {
        // list func here
        return number1 + number2;
    }

    public static String add(String one, String two) {
        return one + two;
    }

    public static Double multiply(Double number1, Double number2) {
        // list func here
        return number1 * number2;
    }

    public static Double multiply(Long number1, Double number2) {
        // list func here
        return number1 * number2;
    }

    public static Double multiply(Double number1, Long number2) {
        // list func here
        return number1 * number2;
    }

    public static Long multiply(Long number1, Long number2) {
        // list func here
        return number1 * number2;
    }

    public static Double divide(Double number1, Double number2) {
        if (number2 == 0) {
            Error.throwError(3);
        }
        // list func here
        return number1 / number2;
    }

    public static Double divide(Double number1, Long number2) {
        if (number2 == 0) {
            Error.throwError(3);
        }
        // list func here
        return number1 / number2.doubleValue();
    }

    public static Double divide(Long number1, Double number2) {
        if (number2 == 0) {
            Error.throwError(3);
        }
        // list func here
        return number1.doubleValue() / number2;
    }

    public static Long divide(Long number1, Long number2) {
        if (number2 == 0) {
            Error.throwError(3);
        }
        // list func here
        return number1 / number2;
    }

    public static Long and(Long number1, Long number2) {
        // list func here
        return number1 & number2;
    }

    public static Boolean and(Boolean number1, Boolean number2) {
        // list func here
        return number1 && number2;
    }

    public static Long or(Long number1, Long number2) {
        // list func here
        return number1 | number2;
    }

    public static Boolean or(Boolean number1, Boolean number2) {
        // list func here
        return number1 || number2;
    }

    public static Long xor(Long number1, Long number2) {
        // list func here
        return number1 ^ number2;
    }

    public static Boolean xor(Boolean number1, Boolean number2) {
        // list func here
        return (number1 || number2) && !(number1 && number2);
    }

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

    public static Double modulo(Double number1, Double number2) {
        // list func here
        if (number2 == 0) {
            Error.throwError(3); // Division by zero
        }
        return number1 % number2;
    }

    public static Double modulo(Long number1, Double number2) {
        return modulo(number1.doubleValue(), number2);
    }

    public static Double modulo(Double number1, Long number2) {
        return modulo(number1, number2.doubleValue());
    }

    public static Double modulo(Long number1, Long number2) {
        return modulo(number1.doubleValue(), number2.doubleValue());
    }

    public static Double exp(Double number1, Double number2) {
        // list func here
        return Math.pow(number1, number2);
    }

    public static Double exp(Long number1, Double number2) {
        // list func here
        return Math.pow(number1, number2);
    }

    public static Double exp(Double number1, Long number2) {
        // list func here
        return Math.pow(number1, number2);
    }

    public static Long exp(Long number1, Long number2) {
        // list func here
        return Utils.powerN(number1, number2);
    }

    public static ArrayList<Double> exp(ArrayList<Double> number1, Double number2) {
        ArrayList<Double> g = new ArrayList<Double>();
        for (double j : number1) {
            g.add(Math.pow(j, number2.doubleValue()));
        }
        return g;
    }

    public static ArrayList<Double> exp(ArrayList<Double> number1, Long number2) {
        return exp(number1, number2.doubleValue());
    }

    public static Double root(Double number1, Double number2) {
        if (number2.doubleValue() == 0) {
            Error.throwError(3); // Division by zero
        }
        // list func here
        return Math.pow(number1, 1 / number2);
    }

    public static Double root(Long number1, Double number2) {
        return root(number1.doubleValue(), number2.doubleValue());
    }

    public static Double root(Double number1, Long number2) {
        return root(number1.doubleValue(), number2.doubleValue());
    }

    public static Double root(Long number1, Long number2) {
        return root(number1.doubleValue(), number2.doubleValue());
    }

    public static Object get(Long index) {
        try {
            return Runner.memory.tape.get(index.intValue());
        } catch (ArithmeticException e) {
            Error.throwError(2);
        }
        return null;
    }

    public static Object get(Double index) {
        try {
            return Runner.memory.tape.get(index.intValue());
        } catch (ArithmeticException e) {
            Error.throwError(2);
        }
        return null;
    }

    public static Long toint(Boolean number) {
        try {
            return number ? 1L : 0L;
        } catch (NumberFormatException e) {
            Error.throwError(2);
            return 67L;
        }
    }

    public static Long toint(String number) {
        try {
            return Long.valueOf(number);
        } catch (NumberFormatException e) {
            Error.throwError(2);
            return 67L;
        }
    }

    public static ArrayList<Double> toint(ArrayList<?> number1) {
        ArrayList<Double> g = new ArrayList<Double>();
        try {
            if (number1.get(0).getClass().getName().equals("java.lang.Double")) {
                ArrayList<Double> num = (ArrayList<Double>) number1;
                for (double j : num) {
                    g.add(Math.floor(j));
                }
            } else {
                ArrayList<String> num = (ArrayList<String>) number1;
                for (String j : num) {
                    g.add(Math.floor(Double.valueOf(j)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return g;
    }

    public static String reverse(String in) {
        String out = "";
        for (String g : in.split("")) {
            out = g + out;
        }
        return out;
    }

    public static String tostr(Double number) {
        return number.toString().toString().replaceAll("\\.0(?![0-9])", "");
    }

    public static String tostr(Long number) {
        return number.toString();
    }

    public static String tostr(boolean number) {
        return number ? "true" : "false";
    }

    public static String tostr(String number) {
        return number;
    }

    public static String tostr(ArrayList<?> numbers) {
        return numbers.toString();
    }

    public static Long toint(Double number) {
        return number.longValue();
    }

    public static Double floor(Double number) {
        return Math.floor(number);
    }

    public static Long toint(Long number) {
        return number.longValue();

    }

    public static Double log(Double number, Double base) {
        return Math.log(base) / Math.log(number);
    }

    public static Double log(Long number, Double base) {
        return log(number.doubleValue(), base);
    }

    public static Double log(Double number, Long base) {
        return log(number, base.doubleValue());
    }

    public static Double log(Long number, Long base) {
        return log(number.doubleValue(), base.doubleValue());
    }

    public static Double abs(Double number) {
        return Math.abs(number);
    }

    public static Long abs(Long number) {
        return Math.abs(number);
    }

    public static Double todec(Long number) {
        return number.doubleValue();
    }

    public static Double todec(String number) {
        try {
            return Double.valueOf(number);
        } catch (NumberFormatException e) {
            Error.throwError(2);
            return 67d;
        }
    }

    public static Double todec(boolean number) {
        try {
            return number ? 1.0 : 0.0;
        } catch (NumberFormatException e) {
            Error.throwError(2);
            return 67.0;
        }
    }

    public static Double todec(Double number) {
        return number;
    }

    public static Double round(Double number) {
        return (double) Math.round(number);
    }

    public static Long round(Long number) {
        return number;
    }

    public static Double fix(Double number, Long digits) {
        double scale = Math.pow(10, digits);
        return (double) Math.floor(number * scale) / scale;
    }

    public static Double ceil(Double number) {
        return Math.ceil(number);
    }

    public static Long ceil(Long number) {
        return number;
    }

    public static Double fpart(Double number) {
        return number - Math.floor(number);
    }

    public static Double fpart(Long number) {
        return 0d;
    }

    public static Double sum(ArrayList<?> list) {
        double sum = 0;
        for (Object i : list) {
            sum += Double.valueOf(String.valueOf(i));
        }
        return sum;
    }

    public static Number min(ArrayList<?> arguments) {
        if (arguments == null || arguments.isEmpty()) {
            Error.throwError(2); // assuming error code for invalid input
        }
        Object first = arguments.get(0);
        if (first instanceof Long) {
            try {
                Optional<Long> f = arguments.stream()
                        .map(obj -> (Long) obj)
                        .min(Long::compareTo);
                return f.orElse(null);
            } catch (ClassCastException e) {
                Error.throwError(2); // Type mismatch
            }
        } else if (first instanceof Double) {
            try {
                Optional<Double> f = arguments.stream()
                        .map(obj -> (Double) obj)
                        .min(Double::compareTo);
                return f.orElse(null);
            } catch (ClassCastException e) {
                Error.throwError(2);
            }
        }
        return null;
    }

    public static Number max(ArrayList<?> arguments) {
        if (arguments == null || arguments.isEmpty()) {
            Error.throwError(2); // assuming error code for invalid input
        }
        Object first = arguments.get(0);
        if (first instanceof Long) {
            try {
                Optional<Long> f = arguments.stream()
                        .map(obj -> (Long) obj)
                        .max(Long::compareTo);
                return f.orElse(null);
            } catch (ClassCastException e) {
                Error.throwError(2); // Type mismatch
            }
        } else if (first instanceof Double) {
            try {
                Optional<Double> f = arguments.stream()
                        .map(obj -> (Double) obj)
                        .max(Double::compareTo);
                return f.orElse(null);
            } catch (ClassCastException e) {
                Error.throwError(2);
            }
        }
        return null;
    }

    public static Object single(ArrayList<?> list, Long index) {
        try {
            return list.get(index.intValue());
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            Error.throwError(0);
        }
        return null;
    }

    public static Object single(ArrayList<?> list, Double index) {
        try {
            return list.get(index.intValue());
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            Error.throwError(0);
        }
        return null;
    }

    public static ArrayList<Object> piece(Long start, Long end) {
        try {
            int s = start.intValue();
            int e = end.intValue();
            if (s < 0 || e < s || e >= Runner.memory.tape.size()) {
                System.out.println(e);
                // System.out.println(Runner.memory.tape.size());
                Error.throwError(0);
            }
            return new ArrayList<>(Runner.memory.tape.subList(s, e + 1));
        } catch (ArithmeticException e) {
            e.printStackTrace();
            Error.throwError(0);
        }
        return null;
    }

    public static ArrayList<Object> piece(Double start, Long end) {
        return piece(start.longValue(), end.longValue());
    }

    public static ArrayList<Object> piece(Double start, Double end) {
        return piece(start.longValue(), end.longValue());
    }

    public static ArrayList<Object> piece(Long start, Double end) {
        return piece(start, end.longValue());
    }

    public static ArrayList<Object> aslist(Object[] arguments) {
        ArrayList<Object> doubleList = new ArrayList<>();

        for (Object value : arguments) {
            doubleList.add(value);
        }
        return doubleList;
    }

    public static void check(Boolean item) {
        if (!item) {
            int skip = 0;
            int h = Runner.i + 1;
            for (; h < Runner.codeSp.length; h++) {
                if (Runner.codeSp[h].split("\\(")[0].equals("check")) {
                    skip++;
                    continue;
                }
                if (Runner.codeSp[h].split("\\(")[0].equals("endch") && skip != 0) {
                    skip--;
                    continue;
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
            if (Runner.i != h) {
                Error.throwError(6);
            }
        }
    }

    public static Long factorial(Long number) {
        long num = 1;
        for (long i = 1; i <= number; i++) {
            num *= i;
        }
        return num;
    }

    public static Double factorial(Double number) {
        double num = 1;
        for (double i = 1; i <= number; i++) {
            num *= i;
        }
        return num;
    }

    public static Double sin(Long num) {
        return sin(num.doubleValue());
    }

    public static Double sin(Double num) {
        return Math.sin(num.doubleValue());
    }

    public static Double cos(Double num) {
        return Math.cos(num.doubleValue());
    }

    public static Double tan(Double num) {
        return Math.tan(num.doubleValue());
    }

    public static Double cos(Long num) {
        return cos(num.doubleValue());
    }

    public static Double tan(Long num) {
        return tan(num.doubleValue());
    }

    public static Double radtodeg(Double rad) {
        return Math.toDegrees(rad);
    }

    public static Double radtodeg(Long rad) {
        return radtodeg(rad.doubleValue());
    }

    public static Double degtorad(Double deg) {
        return Math.toRadians(deg);
    }

    public static Double degtorad(Long deg) {
        return degtorad(deg.doubleValue());
    }

    public static void incloop(Long id, Double start, Double end, Double increment) {
        try {
            Runner.memory.incloop.get(id.intValue());
        } catch (Exception e) {
            Runner.memory.incloop.set(id.intValue(), start - increment);
        }
        Runner.memory.incloop.crement(id.intValue(), increment);
        if (Runner.memory.incloop.get(id.intValue()) > end) {
            Runner.memory.incloop.remove(id.intValue());
            int skip = 0;
            int h = Runner.i + 1;
            for (; h < Runner.codeSp.length; h++) {
                if (Runner.codeSp[h].split("\\(")[0].equals("incloop")) {
                    skip++;
                    continue;
                }
                if (Runner.codeSp[h].split("\\(")[0].equals("next") && skip != 0) {
                    skip--;
                    continue;
                }
                if (Runner.codeSp[h].split("\\(")[0].equals("next") && skip == 0) {
                    Runner.i = h;
                    break;
                }
            }
            if (Runner.i != h) {
                Error.throwError(6);
            }
        }
        return;
    }

    public static Double incvar(Long id) {
        return Runner.memory.incloop.get(id.intValue());
    }

    public static Double incset(Long id, Double thing) {
        Runner.memory.incloop.set(id.intValue(), thing);
        return incvar(id);
    }

    public static Double incset(Long id, Long thing) {
        Runner.memory.incloop.set(id.intValue(), thing.doubleValue());
        return incvar(id);
    }

    public static void next() {
        int skip = 0;
        int h = Runner.i - 1;
        for (; h >= 0; h--) {
            if (Runner.codeSp[h].split("\\(")[0].equals("next")) {
                skip++;
                continue;
            }
            if (Runner.codeSp[h].split("\\(")[0].equals("incloop") && skip != 0) {
                skip--;
                continue;
            }
            if (Runner.codeSp[h].split("\\(")[0].equals("incloop") && skip == 0) {
                Runner.i = h - 1;
                break;
            }

        }
        if (Runner.i != h - 1) {
            Error.throwError(6);
        }

    }

    public static void loopwhile(Boolean condition) { // fix
        if (!condition) {
            int skip = 0;
            int h = Runner.i + 1;
            for (; h < Runner.codeSp.length; h++) {
                if (Runner.codeSp[h].split("\\(")[0].equals("loopwhile")) {
                    skip++;
                    continue;
                }
                if (Runner.codeSp[h].split("\\(")[0].equals("endloop") && skip != 0) {
                    skip--;
                    continue;
                }
                if (Runner.codeSp[h].split("\\(")[0].equals("endloop") && skip == 0) {
                    Runner.i = h;
                    break;
                }
            }
            if (Runner.i != h) {
                Error.throwError(6);
            }
        }
    }

    public static void endloop() {

        int skip = 0;
        int h = Runner.i - 1;
        for (; h >= 0; h--) {
            if (Runner.codeSp[h].split("\\(")[0].equals("endloop")) {
                skip++;
                continue;
            }
            if (Runner.codeSp[h].split("\\(")[0].equals("loopwhile") && skip != 0) {
                skip--;
                continue;
            }
            if (Runner.codeSp[h].split("\\(")[0].equals("loopwhile") && skip == 0) {
                Runner.i = h - 1;
                break;
            }

        }
        if (Runner.i != h - 1) {
            Error.throwError(6);
        }
    }

    public static void otherwise() {
        int skip = 0;
        int h = Runner.i + 1;
        for (; h < Runner.codeSp.length; h++) {
            if (Runner.codeSp[h].split("\\(")[0].equals("check")) {
                skip++;
                continue;
            }
            if (Runner.codeSp[h].split("\\(")[0].equals("endch") && skip != 0) {
                skip--;
                continue;
            }
            if (Runner.codeSp[h].split("\\(")[0].equals("endch") && skip == 0) {
                Runner.i = h;
                break;
            }
        }
        if (Runner.i != h) {
            Error.throwError(6);
        }
    }

    public static void endch() {
        // nothing
    }

    public static Boolean tobool(Double num) {
        return num != 0d;
    }

    public static Boolean tobool(Long num) {
        return num != 0;
    }

    public static Double summation(String code, Long start, Long end, Double increment) {

        if (Runner.memory.summation.running) {
            Error.throwError(5);
        }
        Runner.memory.summation.clear();
        Runner.memory.summation.running = true;

        Runner.memory.summation.setItem(1, end.intValue());
        Double accumulator = 0d;
        for (Runner.memory.summation.setItem(0,
                start.intValue()); Runner.memory.summation.getItem(0) < Runner.memory.summation
                        .getItem(1); Runner.memory.summation
                                .setItem(0,
                                        Runner.memory.summation.getItem(0) + 1)) {
            try {
                accumulator = accumulator += Double.valueOf(String.valueOf(Runner.runCommands(code)));

            } catch (Exception e) {
                Error.throwError(6);
            }
        }
        Runner.memory.summation.running = false;
        return accumulator;
    }

    public static Double summation(String code, Long start, Double end) {
        return summation(code, start, end.longValue(), 1d);
    }

    public static Double summation(String code, Long start, Long end) {
        return summation(code, start, end.longValue(), 1d);
    }

    public static Double summation(String code, Double start, Double end) {
        return summation(code, start.longValue(), end.longValue(), 1d);
    }

    public static Double summation(String code, Double start, Long end) {
        return summation(code, start.longValue(), end.longValue(), 1d);
    }

    public static Double summation(String code, Double start, Double end, Double increment) {
        return summation(code, start.longValue(), end.longValue(), increment);
    }

    public static Double pi() {
        return Math.PI;
    }

    public static void loop(String code, Long start, Long end, Double increment) {
        Runner.memory.summation.clear();

        if (Runner.memory.summation.running) {
            Error.throwError(5);
        }
        Runner.memory.summation.running = true;

        Runner.memory.summation.setItem(1, end.intValue());

        for (Runner.memory.summation.setItem(0,
                start.intValue()); Runner.memory.summation.getItem(0) < Runner.memory.summation
                        .getItem(1); Runner.memory.summation
                                .setItem(0,
                                        Runner.memory.summation.getItem(0) + increment)) {
            try {

                Runner.runCommands(code);

            } catch (Exception e) {
                Error.throwError(6);
            }
        }
        Runner.memory.summation.running = false;
        return;
    }

    public static void loop(String code, Long start, Long end) {
        loop(code, start, end.longValue(), 1d);
    }

    public static void loop(String code, Long start, Double end) {
        loop(code, start, end.longValue(), 1d);
    }

    public static void loop(String code, Double start, Double end) {
        loop(code, start.longValue(), end.longValue(), 1d);
    }

    public static void loop(String code, Double start, Long end) {
        loop(code, start.longValue(), end, 1d);
    }

    public static ArrayList<Object> funclist(String code, Long start, Long end) {
        Runner.memory.summation.clear();

        if (Runner.memory.summation.running) {
            Error.throwError(5);
        }
        Runner.memory.summation.running = true;

        Runner.memory.summation.setItem(1, end.intValue());
        ArrayList<Object> list = new ArrayList<Object>();
        for (Runner.memory.summation.setItem(0,
                start.intValue()); Runner.memory.summation.getItem(0) < Runner.memory.summation
                        .getItem(1); Runner.memory.summation
                                .setItem(0,
                                        Runner.memory.summation.getItem(0) + 1)) {
            try {

                list.add(Runner.runCommands(code));

            } catch (Exception e) {
                Error.throwError(6);
            }
        }
        Runner.memory.summation.running = false;
        return list;
    }

    public static ArrayList<Object> funclist(String code, Long start, Double end) {
        return funclist(code, start, end.longValue());
    }

    public static ArrayList<Object> funclist(String code, Double start, Double end) {
        return funclist(code, start.longValue(), end.longValue());
    }

    public static ArrayList<Object> funclist(String code, Double start, Long end) {
        return funclist(code, start.longValue(), end);
    }

    public static Double sumvar(Long item) {
        if (!Runner.memory.summation.running) {
            Error.throwError(6);
        }
        return (double) Runner.memory.summation.getItem(item.intValue());
    }

    public static Double sumvar(Double item) {
        if (!Runner.memory.summation.running) {
            Error.throwError(6);
        }
        return (double) Runner.memory.summation.getItem(item.intValue());
    }

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

    public static String glue(ArrayList<String> item) {
        return String.join("", item);
    }

    public static String glue(ArrayList<String> item, String delimiter) {
        return String.join(delimiter, item);
    }

    public static ArrayList<String> chararray(String item) {
        return split(item, "");
    }

    public static String empty() {
        return "";
    }

    public static String charat(String item, Long index) {
        return String.valueOf(item.charAt(index.intValue()));
    }

    public static String charat(String item, Double index) {
        return String.valueOf(item.charAt(index.intValue()));
    }

    public static Long length(String item) {
        return (long) item.length();
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

    public static Long length(ArrayList<?> item) {
        return (long) item.size();
    }

    public static double random() {
        return Math.random();
    }

    public static Object send(Object returned) {
        return returned;
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

    public static String edit(String str, Double id, String text) {
        return edit(str, id.longValue(), text);
    }

    public static String edit(String str, Double id, Long text) {
        return edit(str, id.longValue(), text.toString());
    }

    public static String edit(String str, Double id, Double text) {
        return edit(str, id.longValue(), text.toString());
    }

    public static Object edit(ArrayList<?> str, Long id, String text) {
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

    public static Object edit(ArrayList<?> str, Long id, Double text) {
        return edit(str, id.longValue(), text.toString());
    }

    public static Object edit(ArrayList<?> str, Double id, Double text) {
        return edit(str, id.longValue(), text.toString());
    }

    public static Object edit(ArrayList<?> str, Double id, Long text) {
        return edit(str, id.longValue(), text.toString());
    }

    public static Object edit(ArrayList<?> str, Long id, Long text) {
        return edit(str, id.longValue(), text.toString());
    }

    public static Object callfunc(Long id, Object arg1, Object arg2, Object arg3, Object arg4) {
        Runner.memory.function.pushA(arg1, arg2, arg3, arg4);
        Runner.memory.function.unshiftC(Runner.i);
        Object lastreturn = new Object();
        for (Runner.i = (int) Runner.memory.tape.get(id.intValue()); Runner.i < Runner.codeSp.length; Runner.i++) {
            lastreturn = Runner.runCommands(Runner.codeSp[Runner.i].trim());
            if (Runner.codeSp[Runner.i].split("\\(")[0].equals("send")) {
                break;
            }
        }
        Runner.i = Runner.memory.function.shiftC();
        Runner.memory.function.remArg();
        return lastreturn;

    }

    public static Object callfunc(Long id, Object arg1) {
        Object nn = new Object();
        return callfunc(id, arg1, nn, nn, nn);
    }

    public static Object callfunc(Long id, Object arg1, Object arg2) {
        Object nn = new Object();
        return callfunc(id, arg1, arg2, nn, nn);
    }

    public static Object callfunc(Long id, Object arg1, Object arg2, Object arg3) {
        return callfunc(id, arg1, arg2, arg3, new Object());
    }

    public static Object getarg(Long id) {
        return Runner.memory.function.getA(id.intValue());
    }

    public static void function(Long id) {
        if (Runner.memory.function.Clength() == 0) {
            Runner.memory.tape.set(id.intValue(), Runner.i);
            int skip = 0;
            for (int h = Runner.i + 1; h < Runner.codeSp.length; h++) {
                if (Runner.codeSp[h].split("\\(")[0].equals("function")) {
                    skip++;
                }
                if (Runner.codeSp[h].split("\\(")[0].equals("endfunc") && skip != 0) {
                    skip--;
                }
                if (Runner.codeSp[h].split("\\(")[0].equals("endfunc") && skip == 0) {
                    Runner.i = h;
                    break;
                }
            }
        }
    }

    public static String repeat(String str, Long rep) {
        return str.repeat(rep.intValue());
    }

    public static String repeat(String str, Double rep) {
        return str.repeat(rep.intValue());
    }

    public static String tochar(Long chr) {
        return String.valueOf((char) chr.intValue());
    }

    public static String charcode(String chr) {
        return String.valueOf(chr.codePointAt(0));
    }

    public static void endfunc() {
        // nothing;
    }
}
