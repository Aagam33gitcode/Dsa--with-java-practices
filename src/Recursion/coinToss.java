package Recursion;

public class coinToss {
    public static void main(String[] args) {
        printflipCoin(3,"");
        System.out.println();
        not2concecutiveHH(3,"");

    }
    public static void printflipCoin(int n, String ans){
        if(n==0){
            System.out.print(ans+" ");
            return ;
        }
        printflipCoin(n-1,ans+"T");
        printflipCoin(n-1,ans+"H");
    }
    public static void not2concecutiveHH(int n, String ans){
        if(n==0){
            System.out.print(ans+ " ");
            return;
        }
        if(ans.length()==0|| ans.charAt(ans.length()-1)!='H'){
        not2concecutiveHH(n-1,ans+"H");}
        not2concecutiveHH(n-1,ans+"T");
    }
}
