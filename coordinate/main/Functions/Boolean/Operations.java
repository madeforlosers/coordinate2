package coordinate.main.Functions.Boolean;

public class Operations {

    public static boolean not(Boolean bool) {
        return !bool;
    }

    public static boolean not(Long bool) {
        return bool.compareTo(0L) == 0;
    }

    public static boolean not(Double bool) {
        return bool.compareTo(0d) == 0;
    }

}
