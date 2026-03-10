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

    public static Long toint(Long number) {
        return number.longValue();
    }

    public static Double todec(Long number) {
        return number.doubleValue();
    }

    public static Double todec(Double number) {
        return number;
    }

    public static Double round(Double number) {
        return (double) Math.round(number);
    }

    public static Long round(Long number) {
        return number;
    }

    public static Double fix(Double number, Long digits) {
        double scale = Math.pow(10, digits);
        return (double) Math.floor(number * scale) / scale;
    }

    public static Double fpart(Double number) {
        return number - Math.floor(number);
    }

    public static Double fpart(Long number) {
        return 0d;
    }

    public static Boolean tobool(Double num) {
        return num != 0d;
    }

    public static Boolean tobool(Long num) {
        return num != 0;
    }

    public static String tochar(Long chr) {
        return String.valueOf((char) chr.intValue());
    }
}
