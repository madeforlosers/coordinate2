package coordinate.main.Functions.Number.Math;

import coordinate.main.Utils;
import coordinate.main.Error;

public class Complex {
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
}
