package coordinate.main;

import java.util.ArrayList;
import java.util.Optional;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

import org.nevec.rjm.*;
/* god: my child will modularize all of their code and
*  keep filesizes down to a minimum.
*  
*  satan:
*/

public class Functions {
    public static Object push(Object item) {
        Runner.memory.tape.push(item);
        return item;
    }

    public static String set(BigInteger index, String item) {
        try {
            Runner.memory.tape.set(index.intValueExact(), item);
        } catch (ArithmeticException e) {
            Error.throwError(0);
        }
        return item;
    }

    public static Object set(BigInteger index, BigDecimal item) {
        try {
            Runner.memory.tape.set(index.intValueExact(), item);
        } catch (ArithmeticException e) {
            Error.throwError(0);
        }
        return item;
    }

    public static BigInteger set(BigInteger index, BigInteger item) {
        try {
            Runner.memory.tape.set(index.intValueExact(), item);
        } catch (ArithmeticException e) {
            Error.throwError(0);
        }
        return item;
    }

    public static BigDecimal increment(BigInteger index) {
        try {
            Object value = Runner.memory.tape.get(index.intValueExact());
            if (value == null || !(value instanceof Number)) {
                Error.throwError(2);
            }
            BigDecimal current = new BigDecimal(value.toString());
            BigDecimal newValue = current.add(BigDecimal.ONE);
            Runner.memory.tape.set(index.intValueExact(), newValue);
            return current;
        } catch (ArithmeticException e) {
            Error.throwError(0);
        }
        return null;
    }

    public static BigDecimal decrement(BigInteger index) {
        try {
            Object value = Runner.memory.tape.get(index.intValueExact());
            if (value == null || !(value instanceof Number)) {
                Error.throwError(2);
            }
            BigDecimal current = new BigDecimal(value.toString());
            BigDecimal newValue = current.subtract(BigDecimal.ONE);
            Runner.memory.tape.set(index.intValueExact(), newValue);
            return current;
        } catch (ArithmeticException e) {
            Error.throwError(0);
        }
        return null;
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
        return number1.compareTo(new BigDecimal(number2)) >= 0;
    }

    public static boolean moreis(BigInteger number1, BigInteger number2) {
        // list func here
        return number1.compareTo(number2) >= 0;
    }

    public static boolean lessis(BigDecimal number1, BigDecimal number2) {
        // list func here
        return number1.compareTo(number2) < 1;
    }

    public static boolean lessis(BigInteger number1, BigDecimal number2) {
        // list func here
        return new BigDecimal(number1).compareTo(number2) < 1;
    }

    public static boolean lessis(BigDecimal number1, BigInteger number2) {
        // list func here
        return number1.compareTo(new BigDecimal(number2)) < 1;
    }

    public static boolean lessis(BigInteger number1, BigInteger number2) {
        // list func here
        return number1.compareTo(number2) < 1;
    }

    // hasnumber

    public static boolean is(BigDecimal number1, BigDecimal number2) {
        return number1.compareTo(number2) == 0;
    }

    public static boolean is(BigDecimal number1, BigInteger number2) {
        return number1.compareTo(new BigDecimal(number2)) == 0;
    }

    public static boolean is(BigInteger number1, BigDecimal number2) {
        return new BigDecimal(number1).compareTo(number2) == 0;
    }

    public static boolean is(BigInteger number1, BigInteger number2) {
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

    public static BigDecimal subtract(BigDecimal number1, BigDecimal number2) {
        // list func here
        return number1.subtract(number2);
    }

    public static BigDecimal subtract(BigDecimal number1, BigInteger number2) {
        // list func here
        return number1.subtract(new BigDecimal(number2));
    }

    public static BigDecimal subtract(BigInteger number1, BigDecimal number2) {
        // list func here
        return new BigDecimal(number1).subtract(number2);
    }

    public static BigInteger subtract(BigInteger number1, BigInteger number2) {
        // list func here
        return number1.subtract(number2);
    }

    public static BigDecimal add(BigDecimal number1, BigDecimal number2) {
        // list func here
        return number1.add(number2);
    }

    public static BigInteger add(BigInteger number1, BigInteger number2) {
        // list func here
        return number1.add(number2);
    }

    public static BigDecimal add(BigDecimal number1, BigInteger number2) {
        // list func here
        return number1.add(new BigDecimal(number2));
    }

    public static BigDecimal add(BigInteger number1, BigDecimal number2) {
        // list func here
        return new BigDecimal(number1).add(number2);
    }

    public static BigDecimal multiply(BigDecimal number1, BigDecimal number2) {
        // list func here
        return number1.multiply(number2);
    }

    public static BigDecimal multiply(BigInteger number1, BigDecimal number2) {
        // list func here
        return new BigDecimal(number1).multiply(number2);
    }

    public static BigDecimal multiply(BigDecimal number1, BigInteger number2) {
        // list func here
        return number1.multiply(new BigDecimal(number2));
    }

    public static BigInteger multiply(BigInteger number1, BigInteger number2) {
        // list func here
        return number1.multiply(number2);
    }

    public static BigDecimal divide(BigDecimal number1, BigDecimal number2) {
        // list func here
        if (number2.compareTo(BigDecimal.ZERO) == 0) {
            Error.throwError(3); // Division by zero
        }
        return number1.divide(number2, 100, RoundingMode.HALF_UP);
    }

    public static BigDecimal divide(BigDecimal number1, BigInteger number2) {
        // list func here
        return number1.divide(new BigDecimal(number2), 100, RoundingMode.HALF_UP);
    }

    public static BigDecimal divide(BigInteger number1, BigDecimal number2) {
        // list func here
        return new BigDecimal(number1).divide(number2, 100, RoundingMode.HALF_UP);
    }

    public static BigDecimal divide(BigInteger number1, BigInteger number2) {
        // list func here
        return new BigDecimal(number1).divide(new BigDecimal(number2), 100, RoundingMode.HALF_UP);
    }

    public static BigInteger and(BigInteger number1, BigInteger number2) {
        // list func here
        return number1.and(number2);
    }

    public static BigInteger or(BigInteger number1, BigInteger number2) {
        // list func here
        return number1.or(number2);
    }

    public static BigInteger xor(BigInteger number1, BigInteger number2) {
        // list func here
        return number1.xor(number2);
    }

    public static boolean not(boolean bool) {
        // list func here
        return !bool;
    }

    public static boolean not(BigInteger bool) {
        // list func here
        return !(bool.compareTo(BigInteger.ZERO) != 0);
    }

    public static boolean not(BigDecimal bool) {
        // list func here
        return !(bool.compareTo(BigDecimal.ZERO) != 0);
    }

    public static BigDecimal modulo(BigDecimal number1, BigDecimal number2) {
        // list func here
        return number1.remainder(number2);
    }

    public static BigDecimal modulo(BigInteger number1, BigDecimal number2) {
        // list func here
        return new BigDecimal(number1).remainder(number2);
    }

    public static BigDecimal modulo(BigDecimal number1, BigInteger number2) {
        // list func here
        return number1.remainder(new BigDecimal(number2));
    }

    public static BigInteger modulo(BigInteger number1, BigInteger number2) {
        // list func here
        if (number2.compareTo(BigInteger.ZERO) == 0) {
            Error.throwError(5); // Division by zero
        }
        return number1.remainder(number2);
    }

    public static BigDecimal exp(BigDecimal number1, BigDecimal number2) {
        // list func here
        return BigDecimalMath.pow(number1, number2);
    }

    public static BigDecimal exp(BigInteger number1, BigDecimal number2) {
        // list func here
        return BigDecimalMath.pow(new BigDecimal(number1), number2);
    }

    public static BigDecimal exp(BigDecimal number1, BigInteger number2) {
        // list func here
        return BigDecimalMath.pow(number1, new BigDecimal(number2));
    }

    public static BigDecimal exp(BigInteger number1, BigInteger number2) {
        // list func here
        return BigDecimalMath.pow(new BigDecimal(number1), new BigDecimal(number2));
    }

    public static BigDecimal root(BigDecimal number1, BigDecimal number2) {
        // list func here
        return BigDecimalMath.pow(number1, BigDecimal.ONE.divide(number2, 100, RoundingMode.HALF_UP));
    }

    public static BigDecimal root(BigInteger number1, BigDecimal number2) {
        // list func here
        return BigDecimalMath.pow(new BigDecimal(number1), BigDecimal.ONE.divide(number2, 100, RoundingMode.HALF_UP));
    }

    public static BigDecimal root(BigDecimal number1, BigInteger number2) {
        // list func here
        return BigDecimalMath.pow(number1, BigDecimal.ONE.divide(new BigDecimal(number2), 100, RoundingMode.HALF_UP));
    }

    public static BigDecimal root(BigInteger number1, BigInteger number2) {
        // list func here
        return BigDecimalMath.pow(new BigDecimal(number1),
                BigDecimal.ONE.divide(new BigDecimal(number2), 100, RoundingMode.HALF_UP));
    }

    public static Object get(BigInteger index) {
        try {
            return Runner.memory.tape.get(index.intValueExact());
        } catch (ArithmeticException e) {
            Error.throwError(0);
        }
        return null;
    }

    public static Object get(BigDecimal index) {
        try {
            return Runner.memory.tape.get(index.intValueExact());
        } catch (ArithmeticException e) {
            Error.throwError(0);
        }
        return null;
    }

    public static BigInteger toint(String number) {
        return new BigInteger(number);
    }

    public static BigInteger toint(BigDecimal number) {
        return number.toBigInteger();
    }

    public static BigInteger toint(BigInteger number) {
        return number;
    }

    public static BigDecimal log(BigDecimal number, BigDecimal base) {
        return BigDecimalMath.log(base).divide(BigDecimalMath.log(number), 100, RoundingMode.HALF_UP);
    }

    public static BigDecimal log(BigInteger number, BigDecimal base) {
        return BigDecimalMath.log(base).divide(BigDecimalMath.log(new BigDecimal(number)));
    }

    public static BigDecimal log(BigDecimal number, BigInteger base) {
        return BigDecimalMath.log(new BigDecimal(base)).divide(BigDecimalMath.log(number));
    }

    public static BigDecimal log(BigInteger number, BigInteger base) {
        return BigDecimalMath.log(new BigDecimal(base)).divide(BigDecimalMath.log(new BigDecimal(number)));
    }

    public static BigDecimal abs(BigDecimal number) {
        return number.abs();
    }

    public static BigInteger abs(BigInteger number) {
        return number.abs();
    }

    public static BigDecimal todec(BigInteger number) {
        return new BigDecimal(number);
    }

    public static BigDecimal todec(String number) {
        return new BigDecimal(number);
    }

    public static BigDecimal todec(BigDecimal number) {
        return number;
    }

    public static BigDecimal round(BigDecimal number) {
        return number.round(MathContext.UNLIMITED);
    }

    public static BigInteger round(BigInteger number) {
        return number;
    }

    public static BigDecimal fix(BigDecimal number, BigInteger digits) {
        return number.setScale(digits.intValue(), RoundingMode.DOWN);
    }

    public static BigInteger ceil(BigDecimal number) {
        return number.setScale(0, RoundingMode.CEILING).toBigIntegerExact();
    }

    public static BigInteger ceil(BigInteger number) {
        return number;
    }

    public static BigDecimal fpart(BigDecimal number) {
        return number.subtract(number.setScale(0, RoundingMode.FLOOR));
    }

    public static BigDecimal fpart(BigInteger number) {
        return BigDecimal.ZERO;
    }

    public static Number min(ArrayList<?> arguments) {
        if (arguments == null || arguments.isEmpty()) {
            Error.throwError(3); // Assuming error code for invalid input
        }
        Object first = arguments.get(0);
        if (first instanceof BigInteger) {
            try {
                Optional<BigInteger> f = arguments.stream()
                    .map(obj -> (BigInteger) obj)
                    .min(BigInteger::compareTo);
                return f.orElse(null);
            } catch (ClassCastException e) {
                Error.throwError(4); // Type mismatch
            }
        } else if (first instanceof BigDecimal) {
            try {
                Optional<BigDecimal> f = arguments.stream()
                    .map(obj -> (BigDecimal) obj)
                    .min(BigDecimal::compareTo);
                return f.orElse(null);
            } catch (ClassCastException e) {
                Error.throwError(4);
            }
        }
        return null;
    }

    public static Number max(ArrayList<?> arguments) {
        if (arguments == null || arguments.isEmpty()) {
            Error.throwError(3); // Assuming error code for invalid input
        }
        Object first = arguments.get(0);
        if (first instanceof BigInteger) {
            try {
                Optional<BigInteger> f = arguments.stream()
                    .map(obj -> (BigInteger) obj)
                    .max(BigInteger::compareTo);
                return f.orElse(null);
            } catch (ClassCastException e) {
                Error.throwError(4); // Type mismatch
            }
        } else if (first instanceof BigDecimal) {
            try {
                Optional<BigDecimal> f = arguments.stream()
                    .map(obj -> (BigDecimal) obj)
                    .max(BigDecimal::compareTo);
                return f.orElse(null);
            } catch (ClassCastException e) {
                Error.throwError(4);
            }
        }
        return null;
    }

    public static Object single(ArrayList<?> list, BigInteger index) {
        try {
            return list.get(index.intValueExact());
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            Error.throwError(0);
        }
        return null;
    }

    public static Object single(ArrayList<?> list, BigDecimal index) {
        try {
            return list.get(index.intValueExact());
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            Error.throwError(0);
        }
        return null;
    }

    public static ArrayList<Object> piece(BigInteger start, BigInteger end) {
        try {
            int s = start.intValueExact();
            int e = end.intValueExact();
            if (s < 0 || e < s || e >= Runner.memory.tape.size()) {
                Error.throwError(0);
            }
            return new ArrayList<>(Runner.memory.tape.subList(s, e + 1));
        } catch (ArithmeticException e) {
            Error.throwError(0);
        }
        return null;
    }

    public static ArrayList<Object> aslist(Object[] arguments) {
        ArrayList<Object> doubleList = new ArrayList<>();

        for (Object value : arguments) {
            doubleList.add(value);
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

    public static void puts(String item) {
        System.out.println(item);
    }

    public static void puts(Boolean item) {
        System.out.println(item);
    }

    public static void puts(BigInteger item) {
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
