package Array;


public class Rotate_Image_48 {
    public static void main(String[] args) {
        int[][] ar={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("1.Normal Array");

        for(int[] arr:ar){
            for (int arr1:arr)
            System.out.print(arr1+",");
            System.out.println();
        }
        System.out.println("2.ClockWise");
        clockWise(ar);
        for(int[] arr:ar){
            for (int arr1:arr)
                System.out.print(arr1+",");
            System.out.println();
        }
        System.out.println("3.Anticlockwise");
        antiWise(ar);
        for(int[] arr:ar){
            for (int arr1:arr)
                System.out.print(arr1+",");
            System.out.println();
        }


    }
    public static void  clockWise(int[][] arr){
        int n=arr.length;
        //transpose
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                swap(arr,i,j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                swapCol(arr,i,j,n);
            }
        }
    }
    public static void  antiWise(int[][] arr){
        int n=arr.length;
        //transpose
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                swap(arr,i,j);
            }
        }//row swap
        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j < n; j++) {
                swapRow(arr,i,j,n);
            }
        }
    }

    private static void swapRow(int[][] arr, int i, int j, int n) {
    int temp=arr[i][j];
    arr[i][j]=arr[n-i-1][j];
    arr[n-i-1][j]=temp;
    }

    private static void swapCol(int[][] arr, int i, int j, int n) {
    int temp=arr[i][j];
    arr[i][j]=arr[i][n-j-1];
    arr[i][n-j-1]=temp;
    }

    private static void swap(int[][] arr, int i, int j) {
    int temp= arr[i][j];
    arr[i][j]=arr[j][i];
    arr[j][i]=temp;
    }
}
