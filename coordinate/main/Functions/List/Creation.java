package coordinate.main.Functions.List;

import java.util.ArrayList;
import coordinate.main.Runner;
import coordinate.main.Error;

public class Creation {

    public static ArrayList<Object> aslist(Object[] arguments) {
        ArrayList<Object> doubleList = new ArrayList<>();

        for (Object value : arguments) {
            doubleList.add(value);
        }
        return doubleList;
    }

    public static ArrayList<Object> funclist(String code, Long start, Long end) {
        Runner.memory.summation.clear();

        if (Runner.memory.summation.running) {
            Error.throwError(5);
        }
        
        Runner.memory.summation.running = true;

        Runner.memory.summation.setItem(1, end.intValue());
        ArrayList<Object> list = new ArrayList<Object>();
        for (Runner.memory.summation.setItem(0,
                start.intValue()); Runner.memory.summation.getItem(0) < Runner.memory.summation
                        .getItem(1); Runner.memory.summation
                                .setItem(0,
                                        Runner.memory.summation.getItem(0) + 1)) {
            try {

                list.add(Runner.runCommands(code));

            } catch (Exception e) {
                Error.throwError(6);
            }
        }
        Runner.memory.summation.running = false;
        return list;
    }
}
