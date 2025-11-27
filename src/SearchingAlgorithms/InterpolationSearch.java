package SearchingAlgorithms;

public class InterpolationSearch {
    public static void main(String[] args) {
        int[] arr={2,4,6,8};
        System.out.println(interpolationSearch(arr,12));
    }
    public static int interpolationSearch(int[] arr, int target){
        int i=0;
        int j=arr.length-1;
        while (i<=j && target>=arr[i] && target<=arr[j]){
            if (arr[i]==arr[j]){
                return i;
            }
            int pos=i+(target-arr[i])*(j-i)/(arr[j]-arr[i]);
            if (arr[pos]==target){
                return pos;
            } else if (target<arr[pos]) {
                j=pos-1;
            }
            else {
                i=pos+1;
            }
        }
        return -1;
    }
}
