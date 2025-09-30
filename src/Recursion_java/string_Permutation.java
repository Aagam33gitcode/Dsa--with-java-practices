package Recursion_java;

import java.util.ArrayList;
import java.util.List;

public class string_Permutation {
    public static void main(String[] args) {
        List<String> st=new ArrayList<>();
        permutataion_series("abca" + "","",st);
        System.out.println(st);
        printPerutation("abc","");


    }
    public static void printPerutation(String ques,String ans){
        if(ques.length()==0){
            System.out.print(ans+" ");
            return;
        }
for(int i=0;i<ques.length();i++) {
    char ch=ques.charAt(i);
    String s1=ques.substring(0,i);
    String s2=ques.substring(i+1);
    printPerutation(s1+s2,ans+ch);
}}
    public static void  permutataion_series(String str,String ans ,List<String> tt){

        if(str.length()==0){
         tt.add(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            boolean flg=false;
            for(int j=i+1;j<str.length();j++) {
                if (str.charAt(j) == ch) {
                    flg = true;
                    break;
                }
            }
            if(flg==false){
            String s1=str.substring(0,i);
            String s2=str.substring(i+1);
        permutataion_series(s1+s2,ans+ch,tt);
        }}




    }


}
