package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Aggressive_cow {
    public static void main(String[] args) {



    }public static int findPosition(int[] stall ,int noc){
        int i=1;
        int ans=-1;
        Arrays.sort(stall);
        int n=stall.length;
        int j=stall[n-1]-stall[0];
    while (i<=j){
        int mid=i+(j-i)/2;
        if (isPossible(stall, mid, noc)){
            ans=mid;
            i=mid+1;
        }
        else {
            j=mid-1;
        }

    }
    return ans;

    }
    private static boolean isPossible(int[] stall, int minDIstance, int noc){
        int cow=1;
        int visitedcow=stall[0];
        for (int i = 1; i <stall.length ; i++) {
            if (stall[i]-visitedcow>=minDIstance) {
                cow++;
                visitedcow = stall[i];
            }
        }
        if (cow>=noc){
            return true;
        }
        return false;
    }
}
