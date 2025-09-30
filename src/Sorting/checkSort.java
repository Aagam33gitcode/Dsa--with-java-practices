package Sorting;

public class checkSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,9,43,2,12};
        System.out.println(sortedOrNot(arr));

    }
    public static boolean sortedOrNot(int[] arr){
        boolean flag=false;
       int i=0;
        while (i< arr.length-1){
            int temp=arr[i];
            if (arr[i+1]>temp){
               flag=true;

           }
           else {
               flag=false;
               return flag;
           }
           i++;
       }
        return flag;
    }
}
