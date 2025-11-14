package Practics;

public class ArrayClass {
    public static void maxArray(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max element: "+max);
    }
    public static void minArray(int[] arr){
        int min=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Min element: "+min);
    }
//    public static void maxIn2D(int[][] arr){
//        for (int i = 0; i < arr.length; i++) {
//            maxArray(arr[i]);
//        }
//    }
    public static void findIn2d(int[][] arr ,int target){
        int size=0;
        for (int i = 0; i < arr.length; i++) {
            size=size+arr[i].length;
        }
        System.out.println(size);
        int[][] ans=new int [size][2];
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target){
                    System.out.println("Index: "+"row:"+i+" column:"+j);
ans[k][0] =i;
ans[k][1]=j;
k++;

                }
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(ans[i][0] + " " + ans[i][1]);
        }
        }

public static int  sumArray(int[] arr){
        int sum=0;

    for (int i=0; i < arr.length ; i++) {
            sum=sum+arr[i];
    }

    return sum;
}
public static void sumIn2D(int[][] arr){
        int max=Integer.MIN_VALUE;
        int sum=0;
    int i=0;
        for (; i < arr.length; i++) {
            sum=sumArray(arr[i]);
        max=Math.max(sum,max);


        }

    System.out.println(max);
}
}

    


