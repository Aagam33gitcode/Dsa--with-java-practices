package BackTracking;

public class Coin {
    public static void main(String[] args) {
        int[] coin={1,2,3,5};
        coinPermutation(coin,6,"");


    }
    public static void  coinPermutation(int[] coin, int amount,String ans){
        if(amount==0){
            System.out.print(ans+" ");
            return;
        }

        for (int i = 0; i < coin.length; i++) {
            if(amount>=coin[i]){
                coinPermutation(coin,amount-coin[i],ans+coin[i]);
            }

        }
    }
}
