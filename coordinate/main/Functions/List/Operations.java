package coordinate.main.Functions.List;

import java.util.ArrayList;
import java.util.Optional;
import coordinate.main.Error;

public class Operations {

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

    public static Long length(ArrayList<?> item) {
        return (long) item.size();
    }
}
