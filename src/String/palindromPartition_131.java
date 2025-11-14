package String;

import java.util.ArrayList;
import java.util.List;

public class palindromPartition_131 { public static void main(String[] args) {
String s="hekkk";
        List<String> ll=new ArrayList<>();
        List<List<String >> ww=new ArrayList<>();
        partition(s,ll,ww);
        System.out.println(ww);
    }

        public static void  partition(String ques,List<String> ll,List<List<String>> ww){
    if (ques.length()==0){
        ww.add(new ArrayList<String>(ll));
        return;
    }

    for (int i = 1; i <ques.length() ; i++) {
                String jj=ques.substring(0,i);
                if (isPalindrome(jj)){
                    ll.add(jj);
                    partition(ques.substring(1),ll,ww);
                    ll.remove(ll.size()-1);
                }
            }
        }

        private static boolean isPalindrome(String jj) {
            int i=0;
            int j=jj.length()-1;
            while (i<j){
                if(jj.charAt(i)!=jj.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }

            return  true;}
    }

