package coordinate.main.Functions.Number.Math;

import coordinate.main.Error;

public class Arithmetic {
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

    public static Double modulo(Double number1, Double number2) {
        // list func here
        if (number2 == 0) {
            Error.throwError(3); // Division by zero
        }
        return number1 % number2;
    }
}
