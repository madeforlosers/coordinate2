package coordinate.main.Functions.Boolean;

public class Operations {

    public static boolean not(Boolean bool) {
        // list func here
        return !bool;
    }

    public static boolean not(Long bool) {
        // list func here
        return bool.compareTo(0L) == 0;
    }

    public static boolean not(Double bool) {
        // list func here
        return bool.compareTo(0d) == 0;
    }

}
