package Array;

public class SearchMatrix_74 {
    public static void main(String[] args) {
     int[][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}} ;
        System.out.println(serch(arr,3));
    }
    public static boolean serch(int[][] arr,int target){
        int i=arr.length-1;
        int j=0;
        while (i>=0&&j<arr.length){
            if (arr[i][j]==target){
                return true;

            }
            else if (arr[i][j]>target){
                i--;
            }
            else j++;
        }
        return  false;
    }
}
