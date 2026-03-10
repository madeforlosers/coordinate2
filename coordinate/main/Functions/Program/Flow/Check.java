package coordinate.main.Functions.Program.Flow;

import coordinate.main.Runner;
import coordinate.main.Error;

public class Check {
    
    public static void check(Boolean item) {
        if (!item) {
            int skip = 0;
            int h = Runner.i + 1;
            for (; h < Runner.codeSp.length; h++) {
                if (Runner.codeSp[h].split("\\(")[0].equals("check")) {
                    skip++;
                    continue;
                }
                if (Runner.codeSp[h].split("\\(")[0].equals("endch") && skip != 0) {
                    skip--;
                    continue;
                }
                if (Runner.codeSp[h].split("\\(")[0].equals("otherwise") && skip == 0) {
                    Runner.i = h;
                    break;
                }
                if (Runner.codeSp[h].split("\\(")[0].equals("endch") && skip == 0) {
                    Runner.i = h;
                    break;
                }
            }
            if (Runner.i != h) {
                Error.throwError(6);
            }
        }
    }

    public static void otherwise() {
        int skip = 0;
        int h = Runner.i + 1;
        for (; h < Runner.codeSp.length; h++) {
            if (Runner.codeSp[h].split("\\(")[0].equals("check")) {
                skip++;
                continue;
            }
            if (Runner.codeSp[h].split("\\(")[0].equals("endch") && skip != 0) {
                skip--;
                continue;
            }
            if (Runner.codeSp[h].split("\\(")[0].equals("endch") && skip == 0) {
                Runner.i = h;
                break;
            }
        }
        if (Runner.i != h) {
            Error.throwError(6);
        }
    }

    public static void endch() {
        // nothing
    }
}
