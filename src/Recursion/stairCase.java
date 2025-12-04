package Recursion;

public class stairCase {
    public static void   printStep(int n,String ans ) {
if(n==0){
    System.out.print(ans+" ");
    return;}
if (n<0){
    return;
}
        printStep(n-1,ans+"1");
        printStep(n-2,ans+"2");

    }
    public static void main(String[] args) {
        printStep(3 ,"");

    }
}
