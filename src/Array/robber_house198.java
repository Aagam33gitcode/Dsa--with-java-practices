package Array;

public class robber_house198 {
    public static void main(String[] args) {
        int[] arr={3,1,1,9};
        System.out.println(rober_sum(arr,0));
    }
    public static int rober_sum(int[] arr,int idx){
        if (idx>= arr.length){
            return 0;
        }

        return Math.max(arr[idx]+rober_sum(arr, idx+2),0+rober_sum(arr, idx+1) );
    }
}
