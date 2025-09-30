package Array;

import java.util.Arrays;

public class aggesive_Cow {
    public static void main(String[] args) {
        int[]  arr1={1,2,4,8,9};
        int[]  arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(cowStall(arr,2));

    }
    public static int cowStall(int[] stall,int noc){

        int low=stall[0];
        int high=stall[stall.length-1];

        int ans=0;
       while (low<=high){
        int mid=(low+high)/2;
        if(isItPossible(stall,noc,mid)==true){
            ans=mid;
            low=mid+1;

        }
        else high=mid-1;
    }return ans;
    }

    public static boolean isItPossible(int[] stall, int noc, int mid) {
        int positionCow=stall[0];
        int count_cow=1;
        for (int i = 1; i <stall.length ; i++) {
            if (stall[i]-positionCow>=mid){
                positionCow=stall[i];
                count_cow++;
            }

        }
        if (count_cow==noc){
            return true;
        }return false;
    }
}
