package Recursion_java;

import java.util.ArrayList;
import java.util.List;

public class subSequence_String {
    public static void main(String[] args) {
        List<Integer> ll=new ArrayList<>();
        String sr="abc";
        printSeries(sr,"");

        int[] arr={1,2,3};
        System.out.println();
        printSeries1(0,arr,"");







    }
    public static void printSeries(String ques, String ans){
        if(ques.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char ch=ques.charAt(0);
        printSeries(ques.substring(1),ans);
        printSeries(ques.substring(1),ans+ch);
    }
    public static void printSeries1(int i,int[] arr,String ans){
        if(i==arr.length) {
            System.out.print(ans+" ");
            return;
        }
        int ss=arr[i];
        printSeries1(i+1,arr,ans);
        printSeries1(i+1,arr,ans+ss);






    }
}
