package Array;

public class Array_27 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        int count =0;
        int val=3;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=val){
                arr[count]=arr[i];
                count++;
            }
        }
        System.out.println(count);
    }}