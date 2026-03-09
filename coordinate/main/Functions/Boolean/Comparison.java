package coordinate.main.Functions.Boolean;

public class Comparison {
    public static Boolean and(Boolean number1, Boolean number2) {
        // list func here
        return number1 && number2;
    }

    public static Boolean or(Boolean number1, Boolean number2) {
        // list func here
        return number1 || number2;
    }

    public static Boolean xor(Boolean number1, Boolean number2) {
        // list func here
        return (number1 || number2) && !(number1 && number2);
    }
}
