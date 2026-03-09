package coordinate.main.Functions.List;

import java.util.ArrayList;

public class Comparison {
    public static ArrayList<Boolean> more(ArrayList<Double> number1, Double number2) {
        ArrayList<Boolean> g = new ArrayList<Boolean>();
        for (double j : number1) {
            g.add(j > number2.doubleValue());
        }
        return g;
    }

    public static ArrayList<Boolean> less(ArrayList<Double> number1, Double number2) {
        ArrayList<Boolean> g = new ArrayList<Boolean>();
        for (double j : number1) {
            g.add(j < number2.doubleValue());
        }
        return g;
    }

    public static ArrayList<Boolean> moreis(ArrayList<Double> number1, Double number2) {
        ArrayList<Boolean> g = new ArrayList<Boolean>();
        for (double j : number1) {
            g.add(j >= number2.doubleValue());
        }
        return g;
    }

    public static ArrayList<Boolean> lessis(ArrayList<Double> number1, Double number2) {
        ArrayList<Boolean> g = new ArrayList<Boolean>();
        for (double j : number1) {
            g.add(j <= number2.doubleValue());
        }
        return g;
    }

    public static ArrayList<Boolean> is(ArrayList<?> number1, Double number2) {
        ArrayList<Boolean> g = new ArrayList<Boolean>();
        for (Object j : number1) {
            g.add(Double.valueOf(String.valueOf(j)) == number2.doubleValue());
        }
        return g;
    }
}
