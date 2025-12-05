package Recursion.Practics;

public class CoinToss {
    public static void main(String[] args) {
        System.out.println("All Combination: ");
        coin(3,"");
        System.out.println("No Repeat: ");
        System.out.println(coinNoRepeat(3,"")+" Combination");

//        coinNoRepeat(3,"");
        System.out.println("No Contiguous Head: ");
        coinNoRepeatHEAD(3,"");
    }
    public static void coin(int n, String ans){
        if (n==0){
            System.out.println(ans+" ");
            return;
        }

        coin(n-1,ans+"H");
        coin(n-1,ans+"T");
    }
    public static int coinNoRepeat(int n, String ans){
        int a=0;
        int b=0;
        if (n==0){
            System.out.println(ans+" ");
            return 1;
        }
        if(ans.isEmpty() ||ans.charAt(ans.length()-1)!='T'){
        a= coinNoRepeat(n-1,ans+"H");}
        b =coinNoRepeat(n-1,ans+"T");
    return a+b;
    }
    public static void coinNoRepeatHEAD(int n, String ans){
        if (n==0){
            System.out.println(ans+" ");
            return;
        }
        if(ans.isEmpty() ||ans.charAt(ans.length()-1)!='H'){
        coinNoRepeatHEAD(n-1,ans+"H");}
        coinNoRepeatHEAD(n-1,ans+"T");
    }
}
