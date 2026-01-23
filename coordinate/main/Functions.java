package coordinate.main;

import java.util.ArrayList;
import java.util.Optional;

import coordinate.org.nevec.rjm.*;

import java.math.Double;
import java.math.Integer;
import java.math.MathContext;
import java.math.RoundingMode;

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
    public static Object push(Integer item) {
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

    public static String set(Integer index, String item) {
        try {
            Runner.memory.tape.set(index.intValue(), item);
        } catch (ArithmeticException e) {
            Error.throwError(2);
        }
        return item;
    }

    public static Object set(Integer index, Double item) {
        try {
            Runner.memory.tape.set(index.intValue(), item);
        } catch (ArithmeticException e) {
            Error.throwError(2);
        }
        return item;
    }

    public static Integer set(Integer index, Integer item) {
        try {
            Runner.memory.tape.set(index.intValue(), item);
        } catch (ArithmeticException e) {
            Error.throwError(2);
        }
        return item;
    }

    public static Double increment(Integer index) {
        try {
            Object value = Runner.memory.tape.get(index.intValue());
            if (value == null || !(value instanceof Number)) {
                Error.throwError(2);
            }
            Double current = new Double(value.toString());
            Double newValue = current + 1;
            Runner.memory.tape.set(index.intValue(), newValue);
            return current;
        } catch (ArithmeticException e) {
            Error.throwError(2);
        }
        return null;
    }

    public static Double decrement(Integer index) {
        try {
            Object value = Runner.memory.tape.get(index.intValue());
            if (value == null || !(value instanceof Number)) {
                Error.throwError(2);
            }
            Double current = new Double(value.toString());
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

    public static boolean more(Integer number1, Double number2) {
        // list func here
        return new Double(number1).compareTo(number2) == 1;
    }

    public static boolean more(Double number1, Integer number2) {
        // list func here
        return number1.compareTo(new Double(number2)) == 1;
    }

    public static boolean more(Integer number1, Integer number2) {
        // list func here
        return number1.compareTo(number2) == 1;
    }

    public static boolean less(Double number1, Double number2) {
        // list func here
        return number1.compareTo(number2) == -1;
    }

    public static boolean less(Integer number1, Double number2) {
        // list func here
        return new Double(number1).compareTo(number2) == -1;
    }

    public static boolean less(Double number1, Integer number2) {
        // list func here
        return number1.compareTo(new Double(number2)) == -1;
    }

    public static boolean less(Integer number1, Integer number2) {
        // list func here
        return number1.compareTo(number2) == -1;
    }

    public static boolean moreis(Double number1, Double number2) {
        // list func here
        return number1.compareTo(number2) >= 0;
    }

    public static boolean moreis(Integer number1, Double number2) {
        // list func here
        return new Double(number1).compareTo(number2) >= 0;
    }

    public static boolean moreis(Double number1, Integer number2) {
        // list func here
        return number1.compareTo(new Double(number2)) >= 0;
    }

    public static boolean moreis(Integer number1, Integer number2) {
        // list func here
        return number1.compareTo(number2) >= 0;
    }

    public static boolean lessis(Double number1, Double number2) {
        // list func here
        return number1.compareTo(number2) < 1;
    }

    public static boolean lessis(Integer number1, Double number2) {
        // list func here
        return new Double(number1).compareTo(number2) < 1;
    }

    public static boolean lessis(Double number1, Integer number2) {
        // list func here
        return number1.compareTo(new Double(number2)) < 1;
    }

    public static boolean lessis(Integer number1, Integer number2) {
        // list func here
        return number1.compareTo(number2) < 1;
    }

    // hasnumber

    public static boolean is(Double number1, Double number2) {
        return number1.compareTo(number2) == 0;
    }

    public static boolean is(Double number1, Integer number2) {
        return number1.compareTo(new Double(number2)) == 0;
    }

    public static boolean is(Integer number1, Double number2) {
        return new Double(number1).compareTo(number2) == 0;
    }

    public static boolean is(Integer number1, Integer number2) {
        return number1.compareTo(number2) == 0;
    }

    public static boolean is(String number1, String number2) {
        return number1.equals(number2);
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

    public static Double subtract(Double number1, Integer number2) {
        // list func here
        return number1 - number2;
    }

    public static Double subtract(Integer number1, Double number2) {
        // list func here
        return number1 - number2;
    }

    public static Integer subtract(Integer number1, Integer number2) {
        // list func here
        return number1 - number2;
    }

    public static Double add(Double number1, Double number2) {
        // list func here
        return number1 + number2;
    }

    public static Integer add(Integer number1, Integer number2) {
        // list func here
        return number1 + number2;
    }

    public static Double add(Double number1, Integer number2) {
        // list func here
        return number1 + number2;
    }

    public static Double add(Integer number1, Double number2) {
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

    public static Double multiply(Integer number1, Double number2) {
        // list func here
        return number1 * number2;
    }

    public static Double multiply(Double number1, Integer number2) {
        // list func here
        return number1 * number2;
    }

    public static Integer multiply(Integer number1, Integer number2) {
        // list func here
        return number1 * number2;
    }

    public static Double divide(Double number1, Double number2) {
        // list func here
       return number1 / number2;
    }

    public static Double divide(Double number1, Integer number2) {
        // list func here
        return number1 / number2;
    }

    public static Double divide(Integer number1, Double number2) {
        // list func here
       return number1 / number2;
    }

    public static Double divide(Integer number1, Integer number2) {
        // list func here
        return new Double(number1) / new Double(number2);
    }

    public static Integer and(Integer number1, Integer number2) {
        // list func here
        return number1.and(number2);
    }

    public static Integer or(Integer number1, Integer number2) {
        // list func here
        return number1.or(number2);
    }

    public static Integer xor(Integer number1, Integer number2) {
        // list func here
        return number1.xor(number2);
    }

    public static boolean not(Boolean bool) {
        // list func here
        return !bool;
    }

    public static boolean not(Integer bool) {
        // list func here
        return !(bool.compareTo(Integer.ZERO) != 0);
    }

    public static boolean not(Double bool) {
        // list func here
        return !(bool.compareTo(Double.ZERO) != 0);
    }

    public static Double modulo(Double number1, Double number2) {
        // list func here
        if (number2.compareTo(Double.ZERO) == 0) {
            Error.throwError(3); // Division by zero
        }
        return number1.remainder(number2);
    }

    public static Double modulo(Integer number1, Double number2) {
        // list func here
        if (number2.compareTo(Double.ZERO) == 0) {
            Error.throwError(3); // Division by zero
        }
        return new Double(number1).remainder(number2);
    }

    public static Double modulo(Double number1, Integer number2) {
        // list func here
        if (number2.compareTo(Integer.ZERO) == 0) {
            Error.throwError(3); // Division by zero
        }
        return number1.remainder(new Double(number2));
    }

    public static Integer modulo(Integer number1, Integer number2) {
        // list func here
        if (number2.compareTo(Integer.ZERO) == 0) {
            Error.throwError(3); // Division by zero
        }
        return number1.remainder(number2);
    }

    public static Double exp(Double number1, Double number2) {
        // list func here
        return DoubleMath.pow(number1.setScale(100), number2.setScale(100)).stripTrailingZeros();
    }

    public static Double exp(Integer number1, Double number2) {
        // list func here
        return DoubleMath.pow(new Double(number1).setScale(100), number2.setScale(100)).stripTrailingZeros();
    }

    public static Double exp(Double number1, Integer number2) {
        // list func here
        return DoubleMath.pow(number1.setScale(100), new Double(number2).setScale(100)).stripTrailingZeros();
    }

    public static Double exp(Integer number1, Integer number2) {
        // list func here
        try{
        return DoubleMath.pow(new Double(number1).setScale(100), new Double(number2).setScale(100)).stripTrailingZeros();
        }catch(Exception e){
            e.printStackTrace();
            return new Double(5);
        }
    }

    public static Double root(Double number1, Double number2) {
        if (number2.compareTo(Double.ZERO) == 0) {
            Error.throwError(3); // Division by zero
        }
        // list func here
        return DoubleMath.pow(number1.setScale(100), Double.ONE.setScale(100).divide(number2, 100, RoundingMode.HALF_UP))
                .stripTrailingZeros();
    }

    public static Double root(Integer number1, Double number2) {
        // list func here
        if (number2.compareTo(Double.ZERO) == 0) {
            Error.throwError(3); // Division by zero
        }
        return DoubleMath.pow(new Double(number1).setScale(100), Double.ONE.setScale(100).divide(number2.setScale(100), 100, RoundingMode.HALF_UP))
                .stripTrailingZeros();
    }

    public static Double root(Double number1, Integer number2) {
        // list func here
        if (number2.compareTo(Integer.ZERO) == 0) {
            Error.throwError(3); // Division by zero
        }
        return DoubleMath.pow(number1.setScale(100), Double.ONE.setScale(100).divide(new Double(number2).setScale(100), 100, RoundingMode.HALF_UP))
                .stripTrailingZeros();
    }

    public static Double root(Integer number1, Integer number2) {
        // list func here
        if (number2.compareTo(Integer.ZERO) == 0) {
            Error.throwError(3); // Division by zero
        }
        return DoubleMath.pow(new Double(number1).setScale(100),
                Double.ONE.setScale(100).divide(new Double(number2).setScale(100), 100, RoundingMode.HALF_UP)).stripTrailingZeros();
    }

    public static Object get(Integer index) {
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

    public static Integer toint(Boolean number) {
        try {
            return Integer.valueOf(number ? 1L : 0L);
        } catch (NumberFormatException e) {
            Error.throwError(2);
            return new Integer("67");
        }
    }

    public static Integer toint(String number) {
        try {
            return new Integer(number);
        } catch (NumberFormatException e) {
            Error.throwError(2);
            return new Integer("67");
        }
    }
    

    public static String tostr(Double number) {
        return number.toString();
    }

    public static String tostr(Integer number) {
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

    public static Integer toint(Double number) {
        return number.toInteger();
    }
    public static Double floor(Double number) {
        return number.setScale(0,RoundingMode.FLOOR);
    }

    public static Integer toint(Integer number) {
        return number;
    }

    public static Double log(Double number, Double base) {
        return DoubleMath.log(base).divide(DoubleMath.log(number), 100, RoundingMode.HALF_UP)
                .stripTrailingZeros();
    }

    public static Double log(Integer number, Double base) {
        return DoubleMath.log(base).divide(DoubleMath.log(new Double(number)), 100, RoundingMode.HALF_UP)
                .stripTrailingZeros();
    }

    public static Double log(Double number, Integer base) {
        return DoubleMath.log(new Double(base)).divide(DoubleMath.log(number), 100, RoundingMode.HALF_UP)
                .stripTrailingZeros();
    }

    public static Double log(Integer number, Integer base) {
        return DoubleMath.log(new Double(base))
                .divide(DoubleMath.log(new Double(number)), 100, RoundingMode.HALF_UP).stripTrailingZeros();
    }

    public static Double abs(Double number) {
        return number.abs();
    }

    public static Integer abs(Integer number) {
        return number.abs();
    }

    public static Double todec(Integer number) {
        return new Double(number);
    }

    public static Double todec(String number) {
        try {
            return new Double(number);
        } catch (NumberFormatException e) {
            Error.throwError(2);
            return new Double("67");
        }
    }

    public static Double todec(boolean number) {
        try {
            return new Double(number ? 1 : 0);
        } catch (NumberFormatException e) {
            Error.throwError(2);
            return new Double("67");
        }
    }

    public static Double todec(Double number) {
        return number;
    }

    public static Double round(Double number) {
        return number.round(MathContext.UNLIMITED);
    }

    public static Integer round(Integer number) {
        return number;
    }

    public static Double fix(Double number, Integer digits) {
        return number.setScale(digits.intValue(), RoundingMode.DOWN);
    }

    public static Integer ceil(Double number) {
        return number.setScale(0, RoundingMode.CEILING).toIntegerExact();
    }

    public static Integer ceil(Integer number) {
        return number;
    }

    public static Double fpart(Double number) {
        return number.subtract(number.setScale(0, RoundingMode.FLOOR));
    }

    public static Double fpart(Integer number) {
        return Double.ZERO;
    }

    public static Double sum(ArrayList<Double> list){
        return list.stream().reduce(Double.ZERO, Double::add);
    }
    public static Number min(ArrayList<?> arguments) {
        if (arguments == null || arguments.isEmpty()) {
            Error.throwError(2); // assuming error code for invalid input
        }
        Object first = arguments.get(0);
        if (first instanceof Integer) {
            try {
                Optional<Integer> f = arguments.stream()
                        .map(obj -> (Integer) obj)
                        .min(Integer::compareTo);
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
        if (first instanceof Integer) {
            try {
                Optional<Integer> f = arguments.stream()
                        .map(obj -> (Integer) obj)
                        .max(Integer::compareTo);
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

    public static Object single(ArrayList<?> list, Integer index) {
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

    public static ArrayList<Object> piece(Integer start, Integer end) {
        try {
            int s = start.intValue();
            int e = end.intValue();
            if (s < 0 || e < s || e >= Runner.memory.tape.size()) {
                Error.throwError(0);
            }
            return new ArrayList<>(Runner.memory.tape.subList(s, e + 1));
        } catch (ArithmeticException e) {
            Error.throwError(0);
        }
        return null;
    }
    public static ArrayList<Object> piece(Double start, Integer end){
        return piece(start.toIntegerExact(),end);
    }
    public static ArrayList<Object> piece(Double start, Double end){
        return piece(start.toIntegerExact(),end.toIntegerExact());
    }
     public static ArrayList<Object> piece(Integer start, Double end){
        return piece(start,end.toIntegerExact());
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

    public static void loopwhile(Boolean condition) { // fix
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

    public static void endloop() {

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

    public static void otherwise() {
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

    public static void endch() {
        // nothing
    }

    public static Boolean tobool(Double num) {
        return num.compareTo(Double.ONE) == 0;
    }

    public static Boolean tobool(Integer num) {
        return num.compareTo(Integer.ONE) == 0;
    }

    public static Double summation(String code, Integer start, Integer end) {
        Runner.memory.summation.clear();

        if (Runner.memory.summation.running) {
            Error.throwError(5);
        }
        Runner.memory.summation.running = true;

        Runner.memory.summation.setItem(1, end);
        Double accumulator = Double.ZERO;
        for (Runner.memory.summation.setItem(0,
                start); Runner.memory.summation.getItem(0)
                        .compareTo(Runner.memory.summation.getItem(1)) == -1; Runner.memory.summation.setItem(0,
                                Runner.memory.summation.getItem(0).add(Integer.ONE))) {
            try {
                accumulator = accumulator.add(new Double(String.valueOf(Runner.runCommands(code))));

            } catch (Exception e) {
                Error.throwError(6);
            }
        }
        Runner.memory.summation.running = false;
        return accumulator;
    }
    public static Double summation(String code, Integer start, Double end) {
        return summation(code,start,end.toInteger());
    }
    public static Double summation(String code, Double start, Double end) {
        return summation(code,start.toInteger(),end.toInteger());
    }
    public static Double summation(String code, Double start, Integer end) {
        return summation(code,start.toInteger(),end);
    }

    public static void loop(String code, Integer start, Integer end) {
        Runner.memory.summation.clear();

        if (Runner.memory.summation.running) {
            Error.throwError(5);
        }
        Runner.memory.summation.running = true;

        Runner.memory.summation.setItem(1, end);
        
        for (Runner.memory.summation.setItem(0,
                start); Runner.memory.summation.getItem(0)
                        .compareTo(Runner.memory.summation.getItem(1)) == -1; Runner.memory.summation.setItem(0,
                                Runner.memory.summation.getItem(0).add(Integer.ONE))) {
            try {

                Runner.runCommands(code);

            } catch (Exception e) {
                Error.throwError(6);
            }
        }
        Runner.memory.summation.running = false;
        return;
    }
    public static void loop(String code, Integer start, Double end) {
        loop(code,start,end.toInteger());
    }
    public static void loop(String code, Double start, Double end) {
        loop(code,start.toInteger(),end.toInteger());
    }
    public static void loop(String code, Double start, Integer end) {
        loop(code,start.toInteger(),end);
    }

    public static ArrayList<Double> funclist(String code, Integer start, Integer end) {
        Runner.memory.summation.clear();

        if (Runner.memory.summation.running) {
            Error.throwError(5);
        }
        Runner.memory.summation.running = true;

        Runner.memory.summation.setItem(1, end);
        ArrayList<Double> list = new ArrayList<Double>();
        for (Runner.memory.summation.setItem(0,
                start); Runner.memory.summation.getItem(0)
                        .compareTo(Runner.memory.summation.getItem(1)) == -1; Runner.memory.summation.setItem(0,
                                Runner.memory.summation.getItem(0).add(Integer.ONE))) {
            try {

                list.add(new Double(String.valueOf(Runner.runCommands(code))));

            } catch (Exception e) {
                Error.throwError(6);
            }
        }
        Runner.memory.summation.running = false;
        return list;
    }
    public static ArrayList<Double> funclist(String code, Integer start, Double end) {
        return funclist(code,start,end.toInteger());
    }
    public static ArrayList<Double> funclist(String code, Double start, Double end) {
        return funclist(code,start.toInteger(),end.toInteger());
    }
    public static ArrayList<Double> funclist(String code, Double start, Integer end) {
        return funclist(code,start.toInteger(),end);
    }

    public static Integer sumvar(Integer item) {
        if (!Runner.memory.summation.running) {
            Error.throwError(6);
        }
        return Runner.memory.summation.getItem(item.intValue());
    }

    public static void puts(String item) {
        System.out.println(item);
    }

    public static void puts(Boolean item) {
        System.out.println(item);
    }

    public static void puts(Integer item) {
        System.out.println(item);
    }

    public static void puts(Double item) {
        if(0 ==item.compareTo(item.setScale(0,RoundingMode.FLOOR))){
            System.out.println(item.toInteger());
        }else{
            System.out.println(item);
        }
        
    }

    public static void putsin(String item) {
        System.out.print(item);
    }

    public static void putsin(Boolean item) {
        System.out.print(item);
    }

    public static void putsin(Integer item) {
        System.out.print(item);
    }

    public static void putsin(Double item) {
        System.out.print(item);
    }

    public static void puts(ArrayList<?> item) {
        System.out.println(item.toString());
    }
}
