package Array;

public class House_Robber_198 {
    public  static void main(String[] args) {
        int[] arr={2,7,9,3,1};
        System.out.println(houserobber(arr,0));
    }
    public static int houserobber(int[] arr,int idx){
        if (idx>=arr.length){
            return 0;
        }

        int rob=arr[idx]+houserobber(arr,idx+2);
        int norob=houserobber(arr,idx+1);
        return Math.max(rob,norob);
    }
}
