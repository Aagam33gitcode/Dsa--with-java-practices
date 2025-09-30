package Array;

public class arrayImage_swap_48 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{2,4,6,8},{1,3,5,7}};

        for(int[] ww:arr){
    for(int temp:ww){
        System.out.print(temp+" ");
    }
            System.out.println();
        }
        System.out.println();
        swapReverse(arr);
    }
    public static void swapReverse(int[][] arr){
        int m=arr.length;
        for (int col = 0; col < m; col++) {
            int i=0;int j=m-1;
            while(i<=j){
                int temp=arr[i][col];
                arr[i][col]=arr[j][col];
                arr[j][col]=temp;
                i++;
                j--;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = i+1; j <m ; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }

        }
        for (int[] ww:arr){
        for(int temp:ww){
            System.out.print(temp+" ");
        }
        System.out.println();
    }
    }
}
