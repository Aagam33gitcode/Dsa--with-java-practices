package Array;

public class array_2D_matrix {
    public static void main(String[] args) {
        int[][]     matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25},{26,27,28,29,30}};
matrix(matrix);

    }


    public static  void matrix(int[][] arr){


        //for colume
        for(int i=0;i<= arr[0].length-1;i++){
            if(i%2!=0){
                for(int j= arr.length-1;j>=0;j--){
                    int ele=arr[j][i];
                    System.out.print(ele+ " ");
                }

            }


            else {
                for(int k=0;k<= arr.length-1;k++){
                    System.out.print(arr[k][i]+" ");
                }

            }
        }
    }
}
