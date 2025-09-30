package Array;

import java.util.ArrayList;
import java.util.List;

public class leader_Array {
    public static void main(String[] args) {
        int[] arr={1,23,2,345,3,2,1,3,1,3,2,3,3,2,2,212,1,2,1,2,1,21,4,3,21,43212,3,21,3,2};
        List<Integer> ans=new ArrayList<>();
        int leader=Integer.MIN_VALUE;
        for (int i = arr.length-1; i >=0 ; i--) {
            if(leader<arr[i]){
                leader=arr[i];
                ans.add(0,leader);

            }

        }
        System.out.println(ans);
    }
}
