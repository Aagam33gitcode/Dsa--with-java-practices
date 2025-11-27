package Array;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Numbers_Disappeared_Array_448 {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        List<Integer> ans=new ArrayList<>();
        findNo(arr,ans);
        System.out.println(ans);

    }
    public static List<Integer> findNo(int[] arr,List<Integer> ans){
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
                ans.add(i+1);
            }
        }
        return ans;
    }

    private static void swap(int[] arr, int idx, int idx1) {
    int temp=arr[idx];
    arr[idx]=arr[idx1];
    arr[idx1]=temp;
    }
}
