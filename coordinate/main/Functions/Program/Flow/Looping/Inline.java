package coordinate.main.Functions.Program.Flow.Looping;

import coordinate.main.Runner;
import coordinate.main.Error;

public class Inline {

    public static void loop(String code, Long start, Long end, Double increment) {
        Runner.memory.summation.clear();

        if (Runner.memory.summation.running) {
            Error.throwError(5);
        }
        Runner.memory.summation.running = true;

        Runner.memory.summation.setItem(1, end.intValue());

        for (Runner.memory.summation.setItem(0,
                start.intValue()); Runner.memory.summation.getItem(0) < Runner.memory.summation
                        .getItem(1); Runner.memory.summation
                                .setItem(0,
                                        Runner.memory.summation.getItem(0) + increment)) {
            try {

                Runner.runCommands(code);

            } catch (Exception e) {
                Error.throwError(6);
            }
        }
        Runner.memory.summation.running = false;
        return;
    }
}
