package Assignment;

public class target_ele {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,2,1,2,5};
        System.out.println(target_element(arr,5));
    }
    public static int target_element(int[] arr,int target){
        int i=0;
        int j= arr.length-1;
        int mid=0;
        while(i<j){
            mid=i+j/2;
            if(arr[mid]==target){
                return mid;

            } else if (arr[mid]>target) {
                j=mid-1;


            }
            else{ i=mid+1;
        }}


     return mid;


    }
}
