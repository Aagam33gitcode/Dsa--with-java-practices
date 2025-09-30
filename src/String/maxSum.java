package String;

public class maxSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        System.out.println(maxSumRe(arr,0));
    }
    public static int maxSumRe(int[] arr, int idx){

        if(idx== arr.length){
            return -1;
        }


        return Math.max(arr[idx],maxSumRe(arr,idx+1));


    }
}
