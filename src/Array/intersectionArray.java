package Array;

import java.util.ArrayList;

public class intersectionArray {

    public static void main(String[] args) {
        int[] arr1={2,3,4,5,6,78,9};
        int[] arr2={3,4,5,6,7,8};
        System.out.println("Intersection of two array : "+intersection(arr1,arr2));

    }
    public static ArrayList<Integer> intersection(int[] arr1, int[] arr2){
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        int j=0;
        while (i< arr1.length&&j<arr2.length){
            if(arr1[i]>arr2[j]){
                j++;
            } else if (arr1[i]<arr2[j]) {
                i++;

            }
            else {
                ans.add(arr1[i] );
                i++;
                j++;
            }
        }return ans;
    }
}
