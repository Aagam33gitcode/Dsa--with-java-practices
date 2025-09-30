package Recursion_java;

import java.util.ArrayList;
import java.util.List;

public class binaryString {
    public static void main(String[] args) {
List<String> ss=new ArrayList<>();
        printSTring(1,"",ss);
        System.out.println(ss);


    }
    public static void printSTring(int n,String ans,List<String> ll){
    if(n==0){
//        System.out.print (ans+" ");

        ll.add(ans);
        return;
    }
        printSTring(n-1,ans+"0",ll);
        if(ans.isEmpty() ||ans.charAt(ans.length()-1)=='0'){
    printSTring(n-1,ans+"1",ll);
        }
    }
}
