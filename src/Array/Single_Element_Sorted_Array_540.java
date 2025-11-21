package Array;

public class Single_Element_Sorted_Array_540 {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,4,5,5,6};
        System.out.println(findEle(arr));

    }
    public static int findEle(int[] arr){
        int start=0;
        int end=arr.length-2;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==arr[mid^1]){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return arr[start];
    }
}
