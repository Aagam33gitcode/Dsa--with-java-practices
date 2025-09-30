package String;

public class String_1 {
    public static void main(String[] args) {
        String str="1234";
printSubString(str);
    }
    public static void printSubString(String s) {
        for (int len = 1; len <= s.length(); len++) {
            for (int j = len; j <= s.length(); j++) {
                int i = j - len;
                System.out.print(s.substring(i, j)+" ");
            }
        }
    }
}
