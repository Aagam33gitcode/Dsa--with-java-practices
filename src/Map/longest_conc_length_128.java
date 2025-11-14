package Map;

import com.sun.source.tree.BreakTree;

import java.util.HashMap;

public class longest_conc_length_128 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(consecutive_sq(arr));
    }

        public static int consecutive_sq(int[] arr){
        HashMap<Integer, Boolean> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]-1)) {
                map.put(arr[i],false);
            }
            else {
                map.put(arr[i], true);
            }
            if (map.containsKey(arr[i]+1)){
                map.put(arr[i],false );
            }
        }
        int ans=0;
        for(int key: map.keySet()){
            if (map.get(key)){
                int count=0;
                while (map.containsKey(key)){count++;
                    key++;
                }ans=Math.max(ans,count);
            }

        }
        return ans;
    }

public static int longestConcecutive(int[] arr){
        HashMap<Integer,Boolean> map=new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
        if (map.containsKey(arr[i]-1)){
            map.put(arr[i],false );
        }
        else {
            map.put(arr[i],true);
        }
        if (map.containsKey(arr[i]+1)) {
            map.put(arr[i]+1,false );

        }


    }
    int ans=0;
    for (int key: map.keySet()) {
        if (map.get(key)) {
            int count = 0;
       while (map.containsKey(key)){
           count++;
           key++;
       }
       ans=Math.max(ans,count);
        }
    }
    return ans;
}
}

