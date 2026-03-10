package coordinate.main;

import java.util.Collections;

/*  
 *  COORDINATE LANGUAGE
 *  by madeforlosers 2026
 *  
 *  Error.java
 *      Error handler
 * 
 *  TODO:
 *      comment code more
*/

public class Error {

    public static void throwError(int errornum) {

        String[] errors = {
                "Out-of-bounds tape access", // 0
                "Too little arguments given", // 1
                "Argument type is invalid", // 2
                "Divide by 0", // 3
                "Item turned NaN", // 4
                "Nested summation", // 5
                "Ambiguous error :(", // 6
                "Invalid char in string OR bad syntax", // 7
                "Unknown command", // 8
                "Invalid number", // 9
        };

        System.out.println("ERROR: " + errornum + ":" + errors[errornum]);
        Collections.reverse(Runner.stackTrace);
        System.out.println("COMMAND TRACE: " + String.join(" -> ", Runner.stackTrace));
        Runner.memory.input.close();
        System.exit(0);

        return;

    }
}