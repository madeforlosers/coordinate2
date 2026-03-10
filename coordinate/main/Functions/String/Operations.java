package coordinate.main.Functions.String;

public class Operations {

    public static String charat(String item, Long index) {
        return String.valueOf(item.charAt(index.intValue()));
    }

    public static String charat(String item, Double index) {
        return String.valueOf(item.charAt(index.intValue()));
    }

    public static Long length(String item) {
        return (long) item.length();
    }
}
