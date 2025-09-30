package Array;

import java.util.ArrayList;

public class running_Sum_1480 {
    public static void main(String[] args) {
        int[] ans={1,2,3,4,5,6,7,8};
        runningSum(ans);
        for(int ww:ans){
            System.out.print(ww+" ");
        }




    }
//    public static ArrayList<Integer> runningSum(int[] arr){
//        ArrayList<Integer> ans=new ArrayList<>();
//        int i=0;
//        int sum=0;
//        while (i< arr.length){
//            sum+=arr[i];
//            ans.add(sum);
//
//                i++;
//        }
//        return ans;
//
//    }
public static int[] runningSum(int[] arr){
    int[] ans=new int[arr.length];
    int i=0;
    int sum=0;
    while (i< arr.length){
        sum+=arr[i];
        arr[i]=sum;
        i++;
    }
    return ans;


}
}
