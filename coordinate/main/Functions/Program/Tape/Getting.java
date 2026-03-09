package coordinate.main.Functions.Program.Tape;

import coordinate.main.Runner;
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
            return Runner.memory.tape.get(index.intValue());
        } catch (ArithmeticException e) {
            Error.throwError(2);
        }
        return null;
    }
}
