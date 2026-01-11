package coordinate.main;

class Help {
    public static String stripInlineComments(String code) {
        String result = "";
        boolean inString = false;
        char[] chars = code.toCharArray();
        char stringChar = 0;
        for (int i = 0; i < chars.length; i++) {
            char chr = chars[i];
            if (chr == '"') {
                if (!inString) {
                    inString = true;
                    stringChar = chr;
                } else if (chr == stringChar) {
                    inString = false;
                    stringChar = 0;
                }
                result += chr;
                continue;
            }
            if (chr == ';' && !inString) {
                while (i < chars.length && chars[i] != '\n') {
                    i++;
                }
                if (i < chars.length)
                    result += "\n";
                continue;
            }
            result += chr;
        }
        return result;
    }
    public static String[] splitCom(String s,char item){
        char[] result = s.toCharArray();
        int a = 0;
        for(int i = 0; i < s.length(); i++){
            a+=("{[()]}".indexOf(result[i]) + 4) % 7 - 3;
           result[i] = result[i] == item && a == 0 ? '\n' : result[i];
        }
       // System.out.println(result);
        return new String(result).split("\n");
    }
}