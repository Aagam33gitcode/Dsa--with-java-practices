package Recursion.Practics;

public class SubSequenceString {
    public static void main(String[] args) {
        System.out.print(subSequence("abc",""));
        System.out.println();
      subString("abc","");

    }
    public static int subSequence(String ques,String ans){
        if (ques.length()==0){
            System.out.print(ans+", ");
            return 1;
        }
            char ch=ques.charAt(0);
        int b=subSequence(ques.substring(1),ans);
        int a=subSequence(ques.substring(1),ans+ch);
return a+b;
    }
    public static void subString(String ques,String ans){
        if (ans.length()>0){
            System.out.println(ans+" ");
//            return ;
        }
        if (ques.length()==0){
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
         subString(ques.substring(0,i)+ques.substring(i+1), ans + ch);
        }
    }
}
