package coordinate.main.Functions.Program.Flow;

import coordinate.main.Runner;

public class Function {

    public static Object send(Object returned) {
        return returned;
    }

    public static Object callfunc(Long id, Object arg1, Object arg2, Object arg3, Object arg4) {
        Runner.memory.function.pushA(arg1, arg2, arg3, arg4);
        Runner.memory.function.unshiftC(Runner.i);
        Object lastreturn = new Object();
        for (Runner.i = (int) Runner.memory.tape.get(id.intValue()); Runner.i < Runner.codeSp.length; Runner.i++) {
            lastreturn = Runner.runCommands(Runner.codeSp[Runner.i].trim());
            if (Runner.codeSp[Runner.i].split("\\(")[0].equals("send")) {
                break;
            }
        }
        Runner.i = Runner.memory.function.shiftC();
        Runner.memory.function.remArg();
        return lastreturn;

    }

    public static void function(Long id) {
        if (Runner.memory.function.Clength() == 0) {
            Runner.memory.tape.set(id.intValue(), Runner.i);
            int skip = 0;
            for (int h = Runner.i + 1; h < Runner.codeSp.length; h++) {
                if (Runner.codeSp[h].split("\\(")[0].equals("function")) {
                    skip++;
                }
                if (Runner.codeSp[h].split("\\(")[0].equals("endfunc") && skip != 0) {
                    skip--;
                }
                if (Runner.codeSp[h].split("\\(")[0].equals("endfunc") && skip == 0) {
                    Runner.i = h;
                    break;
                }
            }
        }
    }
}
