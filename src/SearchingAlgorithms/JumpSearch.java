package SearchingAlgorithms;

public class JumpSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=1;
        System.out.println(target+" At Index "+jumpEle(arr,target));
    }
    public static int jumpEle(int[] arr, int target){
        int n= arr.length;
        int blockSize= (int) Math.sqrt(n);
        int start=0;
        int end=blockSize;
        while (end<n&&arr[end]<=target){
            start=end;
            end+=blockSize;
            if (end>n){
                end=n;
            }
        }
        for (int i = start; i <end ; i++) {
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
