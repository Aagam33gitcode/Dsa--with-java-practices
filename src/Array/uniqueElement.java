package Array;

import java.util.ArrayList;
import java.util.List;

public class uniqueElement {
    public static void main(String[] args) {
     int[] arr=   {1,2,3,4,5,12,3,4,5,3,21,1,2};
     List<Integer> ll=new ArrayList<>();
     uniqueNO(arr,ll);
        System.out.println(ll);
    }
    public static void uniqueNO(int[] arr,List<Integer> ll) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }

            }

        }

//        System.out.println();
            for (int j = 0; j < arr.length; j++) {
                    if (arr[j] >= 0) {
                        ll.add(arr[j]);
                    }
    }}
}
