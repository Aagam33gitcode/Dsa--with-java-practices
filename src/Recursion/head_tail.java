package Recursion;

public class head_tail {
    public static void main(String[] args) {
        int n=3;
        coinFlip(n,"");
    }
    public static void coinFlip(int coin, String ans){
        if (coin==0){
            System.out.println(ans+ " ");
            return;
        }
        //No Two consecutive head
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H'){
            coinFlip(coin-1,ans+"H");
        }

//        coinFlip(coin-1,ans+"H");
        coinFlip(coin-1,ans+"T");
    }
}
