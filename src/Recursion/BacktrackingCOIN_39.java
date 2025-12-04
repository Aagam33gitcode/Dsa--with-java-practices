package Recursion;

import java.util.ArrayList;
import java.util.List;

public class BacktrackingCOIN_39 {
    public static void main(String[] args) {
       int n=5;
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
       int[] arr={1,2,3,4,5,6,7};
       coin_tarck(arr,7,ll,ans,0);
        System.out.println(ans);

    }
//    public  static void coin_tarck(int[] arr, int amt,String ans,int idx){
//if(amt==0){
//    System.out.print(ans+" ");
//    return;
//}
//
//        for (int i = idx; i < arr.length; i++) {
//            if(arr[i]<=amt){
//                coin_tarck(arr,amt-arr[i],ans+arr[i],i);
//
//            }
//
//        }
//    }
public  static void coin_tarck(int[] arr, int amt,List<Integer> ll,List<List<Integer>> ans,int idx){
    if(amt==0){
//        System.out.print(ans+" ");
        ans.add(new ArrayList<Integer>(ll));
        return;
    }

    for (int i = idx; i < arr.length; i++) {
        if(arr[i]<=amt){
            ll.add(arr[i]);
            coin_tarck(arr,amt-arr[i],ll, ans,i);
            ll.remove(ll.size()-1);

        }

    }
}
}
