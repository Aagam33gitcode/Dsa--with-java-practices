package Array;

public class Array_matrix_240 {
    public static void main(String[] args) {
   int[][]     matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};

        System.out.println(search(matrix,5));

    }

    public  static  boolean search(int[][] arr,int target){
        int row=0;
        int col=arr[0].length-1;
        while(row< arr.length && col>=0){
            if(arr[row][col]==target){
                System.out.print("["+row+"," +col+ "]"+":"+ arr[row][col]+ ": ");
                return true;
            } else if (arr[row][col]>target) {
                col--;


            }
            else {
                row++;
            }
        }
        return false;

    }
}
