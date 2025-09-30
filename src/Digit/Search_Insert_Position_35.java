package Digit;

public class Search_Insert_Position_35 {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};

        System.out.println(binarySearch(arr,7));

    }
    public static int binarySearch(int[] arr ,int target){
        int low=0;
        int high= arr.length;
        int mid=0;
        while(low<high){
             mid=(low+high)/2;
             if(arr[mid]==target){
                 System.out.println(mid);
                 return mid;
             }
              else if (arr[mid]>target) {

                  high=mid;

            }
              else {

                  low=mid+1;
             }

        }
   return high;
    }
}
