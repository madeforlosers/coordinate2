package coordinate.main;

import java.math.BigInteger;

public class Nums {

    public static int parseInt(int item) {

        return parseInt(String.valueOf(item));
    }

    public static BigInteger parseInt(BigInteger item) {
        return item;
    }

    public static int parseInt(String item) {
        if (Double.isNaN(Integer.parseInt(item))) {
            coordinate.Error.throwError(4);
        }
        return Integer.parseInt(item);
    }
    public static int parseInt(Object item){
        return (int) item;
    }
}