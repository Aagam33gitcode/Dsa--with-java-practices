package Recursion.Practics;


import java.util.ArrayList;
import java.util.List;

public class PalindromFind {
    public static void main(String[] args) {
        List<String> ll=new ArrayList<>();
        List<List<String>> ans=new ArrayList<>();
        findPalindrom("aman",ll,ans);
        System.out.println(ans);
    }
    public static void findPalindrom(String ques,List<String> ll,List<List<String>> ans){
        if (ques.length()==0){
            ans.add(new ArrayList<>(ll));
            return ;
        }
        for (int i = 0; i < ques.length(); i++) {
            if (isPalindrom(ques.substring(0,i+1))){
                ll.add(ques.substring(0,i+1));
            findPalindrom(ques.substring(i+1),ll,ans);
            ll.remove(ll.size()-1);
//            findPalindrom(ques.substring(i+1),ans+ques.substring(0,i+1),ll);
        }}
    }
    private static boolean isPalindrom(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
