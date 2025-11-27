package Array;

public class Missing_Number_268 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(misNo(arr));
    }
    public static int misNo(int[] arr){
        int n= arr.length;
        int expectedSum=n*(n+1)/2;
        int actualSum=0;
        for (int i = 0; i < n; i++) {
            actualSum+=arr[i];
        }
        return expectedSum-actualSum;
    }
}
