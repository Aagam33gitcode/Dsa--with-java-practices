package Array;

import java.util.Arrays;

public class TwoSum_167 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 3, 2, 5, 6};
        int target = 9;
        System.out.println(twoSum11(arr,target));
    }
    public static int[] twoSum11(int[] arr,int target){

        Arrays.sort(arr);
        int i=0;
        int j= arr.length-1;

        while(i<=j){
            int sum=arr[i]+arr[j];
            if(sum==target){
                return new int[]{i+1,j+1};

            } else if (sum>target) {
                j--;

            }
            else{
                i++;
            }

        }

        return new int[]{-1,-1};

    }


}
