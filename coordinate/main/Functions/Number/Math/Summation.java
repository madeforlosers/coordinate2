package coordinate.main.Functions.Number.Math;

import coordinate.main.Runner;
import coordinate.main.Error;

public class Summation {

    public static Double summation(String code, Long start, Long end, Double increment) {

        if (Runner.memory.summation.running) {
            Error.throwError(5);
        }
        Runner.memory.summation.clear();
        Runner.memory.summation.running = true;

        Runner.memory.summation.setItem(1, end.intValue());
        Double accumulator = 0d;
        for (Runner.memory.summation.setItem(0,
                start.intValue()); Runner.memory.summation.getItem(0) < Runner.memory.summation
                        .getItem(1); Runner.memory.summation
                                .setItem(0,
                                        Runner.memory.summation.getItem(0) + 1)) {
            try {
                accumulator = accumulator += Double.valueOf(String.valueOf(Runner.runCommands(code)));

            } catch (Exception e) {
                Error.throwError(6);
            }
        }
        Runner.memory.summation.running = false;
        return accumulator;
    }

    public static Double sumvar(Long item) {
        if (!Runner.memory.summation.running) {
            Error.throwError(6);
        }
        return (double) Runner.memory.summation.getItem(item.intValue());
    }

    public static Double sumvar(Double item) {
        if (!Runner.memory.summation.running) {
            Error.throwError(6);
        }
        return (double) Runner.memory.summation.getItem(item.intValue());
    }
}
