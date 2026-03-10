package coordinate.main.Functions.Program;

public class Timing {
    
    public static void wait(Long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
