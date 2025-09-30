package Array;

public class antiClock_Wise_48 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{2,4,6,8},{1,3,5,7}};

        for(int[] ww:arr){
            for(int temp:ww){
                System.out.print(temp+" ");
            }
            System.out.println();
        }
        System.out.println();
        antiClock(arr);

    }
    public static void antiClock(int[][] arr ){
        int m= arr.length;
        for (int row = 0; row < m; row++) {
            int i = 0;
            int j = m - 1;

            while (i <= j) {
                int temp = arr[row][i];
                arr[row][i] = arr[row][j];
                arr[row][j] = temp;
                j--;
                i++;
            }
        }


        for (int i = 0; i < m; i++) {
            for (int j = i+1; j <m ; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }

        }
        for(int[] ww:arr){
            for(int temp:ww){
                System.out.print(temp+" ");
            }
            System.out.println();
        }
    }
}
