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

    public static Double log(Double number, Double base) {
        return Math.log(base) / Math.log(number);
    }

    public static Double abs(Double number) {
        return Math.abs(number);
    }

    public static Double floor(Double number) {
        return Math.floor(number);
    }

    public static Long abs(Long number) {
        return Math.abs(number);
    }

    public static Double ceil(Double number) {
        return Math.ceil(number);
    }

    public static Long ceil(Long number) {
        return number;
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

}
