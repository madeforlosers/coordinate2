package coordinate.main.Functions.Number;

public class Comparison {
    
    public static boolean more(Double number1, Double number2) {
        // list func here
        return number1.compareTo(number2) == 1;
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
}
