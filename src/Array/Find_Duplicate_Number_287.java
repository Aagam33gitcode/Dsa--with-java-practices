package Array;

import java.util.List;

public class Find_Duplicate_Number_287 {
    public static void main(String[] args) {
int[] arr={1,2,3,4,2,2,2};
        System.out.println(findDNo(arr));
        System.out.println(findDuplicate(arr));

    }
    public static int findDNo(int[] arr){
        int n= arr.length;
        int idx=0;
        while (idx<n){
            int ele=arr[idx];
            int correle=ele-1;
            if (arr[idx]!=arr[correle]){
                swap(arr,idx,correle);
            }
            else{
                idx++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=i+1){
                return arr[i];
            }
        }
        return -1;
    }

    private static void swap(int[] arr, int idx, int idx1) {
        int temp=arr[idx];
        arr[idx]=arr[idx1];
        arr[idx1]=temp;
    }


    //Enhanced code
    public  static int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int ele=Math.abs(nums[i]);
            int actIdx=ele-1;
            if(nums[actIdx]<0){
                return ele;
            }
            nums[actIdx]=-1*nums[actIdx];
        }
        return -1;
    }
}
