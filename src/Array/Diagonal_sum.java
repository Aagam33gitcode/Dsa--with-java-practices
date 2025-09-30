package Array;

public class Diagonal_sum {
    public static void main(String[] args) {
       int n=3;
       int m=3;

//        int[][] matrix=new int[n][m];
      int[][] matrix = new int[][]{
                {1, 2, 3,10,21},
                {4, 5, 6,11,22},
                {7, 8, 9,12,23},
              {17, 18, 19,12,25},
              {17, 18, 19,12,25}


      };
//        int[][]  matrix = new int[][]{
//                {5}


//        };
      int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
if(i==j||i+j==matrix.length-1){
                System.out.print(matrix[i][j]+ " ");
                sum+=matrix[i][j];
            }}

            System.out.println();

        }
        System.out.println(sum);








    }
}
