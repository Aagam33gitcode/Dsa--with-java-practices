package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_partitioning_131 {
    public static void main(String[] args) {
        List<String> ll=new ArrayList<>();
        List<List<String >> ww=new ArrayList<>();

        partition("nitin" ,ll,ww);
        System.out.print(ww+" ");
    }
    public static void  partition(String ques,List<String> ll,List<List<String>> ww){
        if (ques.length()==0){
            ww.add(new ArrayList<String>(ll));
            return;
        }
        for (int i = 1; i <= ques.length(); i++) {
            String jj=ques.substring(0,i);
            if(isPalindrome(jj)==true){
            ll.add(jj);
            partition(ques.substring(i),ll,ww);
        ll.remove(ll.size()-1);
            }
        }
    }

    private static boolean isPalindrome(String jj) {
    int i=0;int j=jj.length()-1;
    while (i<j){
        if(jj.charAt(i)!=jj.charAt(j)){
            return false;
        }
        i++;
        j--;
    }

    return  true;}
}
