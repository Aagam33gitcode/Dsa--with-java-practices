package String;

public class subSequence_String {
    public static void main(String[] args) {

        String s="abcd";
        printSubsequence(s,"");

    }
    public static void printSubsequence(String s, String ans){
       if (s.length()==0){
           System.out.println(ans+", ");
           return;
       }
        char ch=s.charAt(0);
       printSubsequence(s.substring(1),ans);
       printSubsequence(s.substring(1),ans+ch);

    }
}
