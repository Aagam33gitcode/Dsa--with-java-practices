package String;

import java.util.ArrayList;

public class largest_SubstringB_TwoC_162 {
    public static void main(String[] args) {
        String s="babcja";
        System.out.println(s.length());
        System.out.print(largestBtwo(s)+" ");

    }
    public static int largestBtwo(String s){
        int[] arr=new int[26];
        int maxLen=-1;
        for (int i = 0; i < s.length(); i++) {
            int idx=s.charAt(i)-'a';
            if (arr[idx]>0){
                maxLen=Math.max(maxLen,i-arr[idx]);
            }
            else
                arr[idx]=i+1;
        }return maxLen;
}}
