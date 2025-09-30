package Array;

public class Array_713 {
    public static void main(String[] args) {
        int[] arr={1,2,3,45,4,3,4};
        System.out.println(maxSubArray(arr,10));

    }
    public static int maxSubArray(int[] arr, int k){
        int si=0;
        int ei=0;
        int p=1;
        int ans=0;
        while(ei<arr.length) {
            p *= arr[ei];


            while (p >= k && si <= ei) {
                p /= arr[si];
                si++;


            }
            ans += ei - si + 1;


ei++;


        }
        return ans;
    }
}
