package Array;

public class Search_2D_Matrix_74 {
    public static void main(String[] args) {
int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
int[][] arr1={{1,4},{2,5}};
        System.out.println(findele(arr,10));
        System.out.println(findele(arr1,2));

    }
    public static boolean findele(int[][] arr, int target){
     if (arr.length==0){
         return false;
     }
        int start=0;
        int end=(arr.length * arr[0].length)-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid/ arr[0].length][mid% arr[0].length]==target){
                return true;
            } else if (arr[mid/arr[0].length][mid%arr[0].length]<target) {
                start=mid+1;
            }
            else {end=mid-1;

            }
        }
    return false;}

}
