package Array;

public class two_Sum {
    public static void main(String[] args) {
        int[]  arr={1,2,3,43,2,3,4};
        int target=7;
        for (int i = 0; i < arr.length; i++) {
            for (int j=arr.length-1;j>i;j--){
                if(arr[i]+arr[j]==target) {
                    System.out.println(i + "," + j);
                    return;
                }}

        }
    }
}
