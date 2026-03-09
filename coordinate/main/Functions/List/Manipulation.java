package coordinate.main.Functions.List;

import java.util.ArrayList;

public class Manipulation {
    public static ArrayList<Double> toint(ArrayList<?> number1) {
        ArrayList<Double> g = new ArrayList<Double>();
        try {
            if (number1.get(0).getClass().getName().equals("java.lang.Double")) {
                ArrayList<Double> num = (ArrayList<Double>) number1;
                for (double j : num) {
                    g.add(Math.floor(j));
                }
            } else {
                // ArrayList<String> num = (ArrayList<String>) number1;
                for (Object j : number1) {
                    g.add(Math.floor(Double.valueOf(String.valueOf(j))));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return g;
    }

    public static String tostr(ArrayList<?> numbers) {
        return numbers.toString();
    }
}
