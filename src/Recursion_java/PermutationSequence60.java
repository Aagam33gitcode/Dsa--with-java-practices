package Recursion_java;

public class PermutationSequence60 {
    public static void main(String[] args) {
        System.out.println(printper(3,3,"",""));
    }

    public static String printper(int n,int k,String ques,String ans){

        for (int j = 1; j <= n; j++) {
            ques+=j;

                if(ques.length()==0){
            return ans;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String s2 = ques.substring(i + 1);
            String s1 = ques.substring(0, i);
            printper(n, k, s1 + s2, ans + ch);


        }}
        return "";}

}
