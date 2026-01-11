package coordinate.main;

public class Functions {
    public static void push(Object item) {
        Runner.memory.push(item);
        System.out.println("yay");
    }

    public static void set(int index, Object item) {
        Runner.memory.set((int) index, item);

    }

    public static int increment(int index) {
        Runner.memory.set((int) index, 1 + (int) Runner.memory.get((int) index));
        return (int) Runner.memory.get((int) index) - 1;
    }

    public static int decrement(int index) {
        Runner.memory.set((int) index, (int) Runner.memory.get((int) index) - 1);
        return (int) Runner.memory.get((int) index) - 1;
    }

    public static boolean more(int number1, int number2) {
        // list func here
        return (int) number1 > (int) number2;
    }

    public static boolean less(int number1, int number2) {
        // list func here
        return (int) number1 < (int) number2;
    }

    public static boolean moreis(int number1, int number2) {
        // list func here
        return (int) number1 >= (int) number2;
    }

    public static boolean lessis(int number1, int number2) {
        // list func here
        return (int) number1 >= (int) number2;
    }

    // hasnumber
    public static boolean is(Object number1, Object number2) {
        // list func here
        return (int) number1 == (int) number2;
    }

    public static void puts(Object item) {
        System.out.println(item);
    }
}