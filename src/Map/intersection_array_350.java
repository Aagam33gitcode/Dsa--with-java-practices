package Map;

import java.util.ArrayList;
import java.util.HashMap;

public class intersection_array_350 {
    public static void main(String[] args) {
int[] arr1={2,3,21,3,4,54,3,6,7,87,4,32,3};
int[] arr2={2,3,21,3,43};
int[] ans=insersetion(arr1,arr2);
        for (int i = 0; i <ans.length ; i++) {
            System.out.print(ans[i]+" ");
        }

    }
public  static int[] insersetion(int[] arr1,int[] arr2){
        HashMap<Integer, Integer> map=new HashMap<>();
    for (int i = 0; i < arr1.length; i++) {
        if (map.containsKey(arr1[i])){
            map.put(arr1[i], map.get(arr1[i])+1);
        }
        else {
            map.put(arr1[i],1);
        }
    }

    System.out.println(map);
    ArrayList<Integer> list=new ArrayList<>();
    for (int i = 0; i < arr2.length; i++) {
        if (map.containsKey(arr2[i]) && map.get(arr2[i])>0){
            list.add(arr2[i]);
            map.put(arr2[i], map.get(arr2[i])-1);
        }
    }
    int[] ans=new int[list.size()];
    for (int i = 0; i < ans.length; i++) {
        ans[i]=list.get(i);

    }
    return ans;
}
}