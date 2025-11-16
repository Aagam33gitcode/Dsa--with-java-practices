package Array;

public class Search_Rotated_Sorted_ArrayII_81 {
    public static void main(String[] args) {
     int[] arr={2,5,6,0,0,1,2} ;
        System.out.println(findEle(arr,0));
    }
    public static boolean findEle(int[] arr ,int target){
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                return true;
            }
            if (arr[mid]==arr[start]&&arr[end]==arr[mid]){
                start++;
                end--;
            } else if (arr[start]<=arr[mid]) {
                if (target>=arr[start]&&target<arr[mid]){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }else{
                if (arr[mid]<target&&target<=arr[end]){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }

        }
        return false;
    }
}