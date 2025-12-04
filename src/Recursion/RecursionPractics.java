package Recursion;

import java.util.Stack;

public class RecursionPractics {
    public static void printNo(int n){
        if (n==0){
            return;
        }
        System.out.println(n);  //5,4,3,2,1
        printNo(n-1);
//        printNo(n-1);
        System.out.println(n); //1,2,3,4,5
    }
    public static void tailR(int  n){
        if (n==0){
            return;
        }
        System.out.println(n);  //5,4,3,2,1
        tailR(n-1);
    }
    public static void  headR(int n){
       if (n==0){
           return;
       }
        headR(n-1);
        System.out.println(n);

    }
    public static int  treeR(int n){
        if (n==1||n==2){
            return n-1;
        }
//        if (n==2){
//            return 1;
//        }
        int a=treeR(n-1);
        int b=treeR(n-2);
        return a+b;
    }
    static  int count;
    public static void dToB(int n){
        if (n==0){
            count=0;
            return;

        }
        dToB(n/2);
         count+=n%2;
    }
    public static int reverseNo(int n,int res){
        if (n==0) {
            return res;
        }
        res=res*10+(n%10);
return   reverseNo(n/10,res);
    }
    public static String reverseString(String ques,int idx){
        if (idx==ques.length()){
            return "";
        }
       return reverseString(ques,idx+1)+ques.charAt(idx);
    }
    public static String reverseString2(String ques,int idx,String ans){
        if (ans.length()==ques.length()){
            return ans;
        }
        ans=ques.charAt(idx)+ans;
       return reverseString2(ques,idx+1,ans);
//        System.out.println(ans);
    }
    public static int towerOfHanoi(int noD,String source,String helper,String destination){
        if (noD==0){
//            System.out.println("Move disk 1 from " + source + " to " + destination);
            return 0;
        }
      int a=towerOfHanoi(noD-1,source,destination,helper);
        System.out.println("Move disk " + noD + " from " + source + " to " + destination);
        int b=towerOfHanoi(noD-1,helper,source,destination);
    return a+b+1;
    }

    public static void main(String[] args) {
//        printNo(5);
//tailR(5);
//headR(5);
//        System.out.println(treeR(6));
//        int count =0;
//        dToB(11);
//        System.out.println(count);
//        dToB(128);
//        System.out.println(count);
        System.out.println(reverseNo(543210,0));
        String ques="543210";
        System.out.println(reverseString(ques,0));
        System.out.println(reverseString2("543210",0,""));
        System.out.println(towerOfHanoi(3,"Source","Helper","Desination"));


    }

}
