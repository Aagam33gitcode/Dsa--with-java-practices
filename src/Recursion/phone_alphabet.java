package Recursion;

import java.util.ArrayList;
import java.util.List;

public class phone_alphabet {
 static    String[] code = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };
    public static void main(String[] args) {
        String ques="";
        List<String > ll=new ArrayList<>();
        print_Phone(ques,"",ll);

        System.out.println(ll);



    }
    public static void   print_Phone(String ques,String ans,List<String> ll){
        if(ques.length()==0){
            System.out.print(ans+" ");
            ll.add(ans);
            return;
        }
        char ch=ques.charAt(0);
        
        String press=code[ch-48];
        for (int i = 0; i < press.length(); i++) {
            print_Phone(ques.substring(1), ans+press.charAt(i),ll);
        }


    }
}
