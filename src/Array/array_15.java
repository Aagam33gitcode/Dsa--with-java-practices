package Array;

import java.util.ArrayList;
import java.util.List;

public class array_15 {
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,4};
        List<Integer> ans=new ArrayList<>();
        arrayTriplates(arr,ans);
        System.out.println(ans);
    }
    public static void arrayTriplates(int[]  arr, List<Integer> ans){

        int sum=0;
        for (int j = 0; j < arr.length ; j++) {
         sum+=arr[j];
        //-1 0 1 2 -1 4
            if(sum+arr[j+1]!=0){
                ans.add(sum);

            }
            j++;

        }

    }
}
