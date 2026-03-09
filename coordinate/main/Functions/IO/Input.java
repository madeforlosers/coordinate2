package coordinate.main.Functions.IO;

import coordinate.main.Runner;

public class Input {
    public static String ask(String question) {
        System.out.print(question);
        String answer = Runner.memory.input.nextLine();
        return answer;
    }
}
