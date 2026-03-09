package coordinate.main.Functions.Tape;

import java.util.ArrayList;

import coordinate.main.Runner;
import coordinate.main.Error;

public class Setting {

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

    public static Boolean set(Long index, Boolean item) {
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
}
