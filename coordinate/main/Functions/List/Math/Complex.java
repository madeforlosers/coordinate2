package coordinate.main.Functions.List.Math;

import java.util.ArrayList;

public class Complex {
    public static ArrayList<Double> exp(ArrayList<Double> number1, Double number2) {
        ArrayList<Double> g = new ArrayList<Double>();
        for (double j : number1) {
            g.add(Math.pow(j, number2.doubleValue()));
        }
        return g;
    }
}
