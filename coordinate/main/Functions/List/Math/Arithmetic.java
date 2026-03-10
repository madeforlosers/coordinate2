package coordinate.main.Functions.List.Math;

import java.util.ArrayList;

public class Arithmetic {
    
    public static ArrayList<Double> subtract(ArrayList<?> number1, Double number2) {
        ArrayList<Double> ne = new ArrayList<Double>();
        for (int i = 0; i < number1.size(); i++) {
            ne.add(i, Double.valueOf(String.valueOf(number1.get(i))) - number2);
        }
        return ne;
    }

    public static ArrayList<Double> subtract(ArrayList<?> number1, Long number2) {
        ArrayList<Double> ne = new ArrayList<Double>();
        for (int i = 0; i < number1.size(); i++) {
            ne.add(i, Double.valueOf(String.valueOf(number1.get(i))) - number2);
        }
        return ne;
    }

    public static ArrayList<Double> add(ArrayList<?> number1, Long number2) {
        ArrayList<Double> ne = new ArrayList<Double>();
        for (int i = 0; i < number1.size(); i++) {
            ne.add(i, Double.valueOf(String.valueOf(number1.get(i))) + number2);
        }
        return ne;
    }

    public static ArrayList<Double> add(ArrayList<?> number1, Double number2) {
        ArrayList<Double> ne = new ArrayList<Double>();
        for (int i = 0; i < number1.size(); i++) {
            ne.add(i, Double.valueOf(String.valueOf(number1.get(i))) + number2);
        }
        return ne;
    }
}
