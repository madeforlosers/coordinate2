package coordinate.main.Functions.Number;

public class Operations {

    public static Long toint(Object number) {
        return toint(String.valueOf(number));
    }

    public static String tostr(Double number) {
        return number.toString().toString().replaceAll("\\.0(?![0-9])", "");
    }

    public static String tostr(Long number) {
        return number.toString();
    }

    public static Long toint(Double number) {
        return number.longValue();
    }

    public static Double floor(Double number) {
        return Math.floor(number);
    }

    public static Long toint(Long number) {
        return number.longValue();

    }

}
