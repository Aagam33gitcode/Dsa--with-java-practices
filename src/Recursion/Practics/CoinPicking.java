package Recursion.Practics;

public class CoinPicking {
    public static void main(String[] args) {
        int[] arr={1,3, 2,5};
        System.out.println("Permutation of Coins");
        permutationCoin(arr,4,"");
        System.out.println("Combination of Coins");
        combinationCoin(arr,4,"",0);
    }
    public static void permutationCoin(int[] arr, int amount, String ans){
        if (amount==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (amount>=0){
//                amount-=arr[i];
//                permutationCoin(arr, amount,ans+arr[i]);
//            amount+=arr[i];
                permutationCoin(arr, amount-arr[i],ans+arr[i]);
            }
        }
    }public static void combinationCoin(int[] arr, int amount, String ans, int idx){
        if (amount==0){
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            if (amount>=0){
                amount-=arr[i];
                combinationCoin(arr, amount,ans+arr[i],i);
            amount+=arr[i];

            }
        }
    }
}
