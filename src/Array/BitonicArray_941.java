package Array;

public class BitonicArray_941 {
    public static void main(String[] args) {
        int[] arr={1,2,5,6,4,3,2,1};
        System.out.println(findMountedArr(arr));


    }
    public static boolean findMountedArr(int[] arr){
        int idx=0;
        int n= arr.length;
        while (idx<n-1){
            if (arr[idx]<arr[idx+1]){
                idx++;
            }
            else {
                break;
            }
        }
        if (idx==0||idx==n-1){
            return false;
        }
        while (idx<n-1){
            if (arr[idx]>arr[idx+1]){
                idx++;
            }
            else {
                break;
            }
        }
        return (idx==n-1);
    }
}
