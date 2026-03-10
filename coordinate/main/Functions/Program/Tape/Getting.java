package coordinate.main.Functions.Program.Tape;

import coordinate.main.Runner;
import java.util.ArrayList;
import coordinate.main.Error;

public class Getting {

    public static Object get(Long index) {
        try {
            return Runner.memory.tape.get(index.intValue());
        } catch (ArithmeticException e) {
            Error.throwError(2);
        }
        return null;
    }

    public static Object get(Double index) {
        try {
            if(index % 1 != 0){
                Error.throwError(9);
            }
            return Runner.memory.tape.get(index.intValue());
        } catch (ArithmeticException e) {
            Error.throwError(2);
        }
        return null;
    }

    public static ArrayList<Object> piece(Long start, Long end) {
        try {
            int s = start.intValue();
            int e = end.intValue();
            if (s < 0 || e < s || e >= Runner.memory.tape.size()) {
                System.out.println(e);
                // System.out.println(Runner.memory.tape.size());
                Error.throwError(0);
            }
            return new ArrayList<>(Runner.memory.tape.subList(s, e + 1));
        } catch (ArithmeticException e) {
            e.printStackTrace();
            Error.throwError(0);
        }
        return null;
    }
}
