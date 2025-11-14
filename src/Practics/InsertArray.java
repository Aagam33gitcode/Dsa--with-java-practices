package Practics;

import static Practics.Delete_Array.print;

public class InsertArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
print(arr);
insert1(arr,0,7);
print(arr);
    }
    public static void insert1(int[] arr, int pos, int ele){
        if (pos<0||pos> arr.length-1){
            return;
        }
        for (int i =arr.length-2 ; i >=pos; i--) {
            arr[i+1]=arr[i];

        }
        arr[pos]=ele;
    }

}
