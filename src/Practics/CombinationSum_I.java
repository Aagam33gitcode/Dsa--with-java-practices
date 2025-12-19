package Practics;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_I {
    public static void main(String[] args) {
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> ans2=new ArrayList<>();
        int[] arr= {10,1,2,7,6,1,5};
      combination1(arr,8,ans,ans2,0);
        System.out.println(ans);
        System.out.println(ans2);

    }
    public static void combination1(int[] arr ,int tagret,List<Integer> ans,List<List<Integer>> ww,int idx){
        if (tagret==0){
ww.add(new ArrayList<>(ans));
return;
        }

        for (int i = idx; i < arr.length; i++) {
            if (tagret >= arr[i]) {
                ans.add(arr[i]);
                combination1(arr, tagret - arr[i], ans,ww,i+1);
                ans.remove(ans.size()-1);

            }
        }
    }
}
