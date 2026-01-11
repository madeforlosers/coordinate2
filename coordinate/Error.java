package coordinate;

public class Error{
    public static void throwError(int errornum){
        String[] errors = {
            "Out-of-bounds tape access", // 0
        "Too little arguments given", // 1
        "Argument type is invalid", // 2
        "Divide by 0", // 3
        "Item turned NaN", // 4
        "Nested summation", // 5
        "Ambiguous error :(", // 6
        "Item is undefined, maybe invalid char in string?", // 7
        "Unknown command", // 8
        };
        System.out.println("ERROR: "+errornum+":"+errors[errornum]);
        System.exit(0);
        return;
    }
}