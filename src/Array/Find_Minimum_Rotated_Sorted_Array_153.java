package Array;

public class Find_Minimum_Rotated_Sorted_Array_153 {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,1,2,3};
        System.out.println(findMin(arr));

    }
    public static int findMin(int[] arr){
        int i=0;
        int j= arr.length-1;
        int minE=Integer.MAX_VALUE;
        while(i<=j){
            int mid=i+(j-i)/2;
            if (arr[i]<=arr[mid]){
                minE=Math.min(minE,arr[i]);
                i=mid+1;
            }
            else {
                minE=Math.min(minE,arr[mid]);
                j=mid-1;
            }

            }
        return minE;

    }
}
