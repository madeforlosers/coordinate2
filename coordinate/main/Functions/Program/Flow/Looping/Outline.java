package coordinate.main.Functions.Program.Flow.Looping;

import coordinate.main.Runner;
import coordinate.main.Error;

public class Outline {

    public static void incloop(Long id, Double start, Double end, Double increment) {
        try {
            Runner.memory.incloop.get(id.intValue());
        } catch (Exception e) {
            Runner.memory.incloop.set(id.intValue(), start - increment);
        }
        Runner.memory.incloop.crement(id.intValue(), increment);
        if (Runner.memory.incloop.get(id.intValue()) > end) {
            Runner.memory.incloop.remove(id.intValue());
            int skip = 0;
            int h = Runner.i + 1;
            for (; h < Runner.codeSp.length; h++) {
                if (Runner.codeSp[h].split("\\(")[0].equals("incloop")) {
                    skip++;
                    continue;
                }
                if (Runner.codeSp[h].split("\\(")[0].equals("next") && skip != 0) {
                    skip--;
                    continue;
                }
                if (Runner.codeSp[h].split("\\(")[0].equals("next") && skip == 0) {
                    Runner.i = h;
                    break;
                }
            }
            if (Runner.i != h) {
                Error.throwError(6);
            }
        }
        return;
    }

    public static Double incvar(Long id) {
        return Runner.memory.incloop.get(id.intValue());
    }

    public static Double incset(Long id, Double thing) {
        Runner.memory.incloop.set(id.intValue(), thing);
        return incvar(id);
    }

    public static Double incset(Long id, Long thing) {
        Runner.memory.incloop.set(id.intValue(), thing.doubleValue());
        return incvar(id);
    }

    public static void next() {
        int skip = 0;
        int h = Runner.i - 1;
        for (; h >= 0; h--) {
            if (Runner.codeSp[h].split("\\(")[0].equals("next")) {
                skip++;
                continue;
            }
            if (Runner.codeSp[h].split("\\(")[0].equals("incloop") && skip != 0) {
                skip--;
                continue;
            }
            if (Runner.codeSp[h].split("\\(")[0].equals("incloop") && skip == 0) {
                Runner.i = h - 1;
                break;
            }

        }
        if (Runner.i != h - 1) {
            Error.throwError(6);
        }

    }

    public static void loopwhile(Boolean condition) { // fix
        if (!condition) {
            int skip = 0;
            int h = Runner.i + 1;
            for (; h < Runner.codeSp.length; h++) {
                if (Runner.codeSp[h].split("\\(")[0].equals("loopwhile")) {
                    skip++;
                    continue;
                }
                if (Runner.codeSp[h].split("\\(")[0].equals("endloop") && skip != 0) {
                    skip--;
                    continue;
                }
                if (Runner.codeSp[h].split("\\(")[0].equals("endloop") && skip == 0) {
                    Runner.i = h;
                    break;
                }
            }
            if (Runner.i != h) {
                Error.throwError(6);
            }
        }
    }

    public static void endloop() {

        int skip = 0;
        int h = Runner.i - 1;
        for (; h >= 0; h--) {
            if (Runner.codeSp[h].split("\\(")[0].equals("endloop")) {
                skip++;
                continue;
            }
            if (Runner.codeSp[h].split("\\(")[0].equals("loopwhile") && skip != 0) {
                skip--;
                continue;
            }
            if (Runner.codeSp[h].split("\\(")[0].equals("loopwhile") && skip == 0) {
                Runner.i = h - 1;
                break;
            }

        }
        if (Runner.i != h - 1) {
            Error.throwError(6);
        }
    }
}
