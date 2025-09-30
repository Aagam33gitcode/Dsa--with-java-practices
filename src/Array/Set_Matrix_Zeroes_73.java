package Array;

public class Set_Matrix_Zeroes_73 {
    public static void main(String[] args) {
//[[1,1,1],[1,0,1],[1,1,1]]
//        [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
        int[][] arr89={{1,2,0,4},{3,0,1,4},{0,3,2,3},{2,4,5,3}};// n
        int[][] ar8={{1,2,0,4},{3,0,1,4},{0,3,2,3},{2,4,5,3},{3,0,5,22},{2,3,4,5}};
        int[][] arr2={{1,1,1},{1,0,1},{1,1,1}};// n
        int[][] arr3={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] arr={{0,1}};
        for(int[] ar:arr){
            for (int ww:ar){
                System.out.print(ww+" ");
            }
            System.out.println();
        }
        System.out.println();
        set_Zeroes(arr);
    }

    public static void set_Zeroes(int[][] arr){
        int r=arr.length;
        int c=arr[0].length;
        //BRUTE FORCE APPORACH TC=O(mn), SC=(MN)
        boolean flag=false;
        for(int i=0;i<r;i++){
            for (int j = 0; j < c; j++) {
                if(arr[i][j]==0){
                    arr[i][0]=0;

                if(j==0){
                    flag=true;
                }else {
                    arr[0][j] = 0;
                }
            }
        }
    }
        for (int i = 1; i < r; i++) {
            for (int j = 1; j <c ; j++) {
                if(arr[i][0]==0 || arr[0][j]==0){
                    arr[i][j]=0;
                }
            }
        }
        if(arr[0][0]==0){
            for (int j = 0; j < c; j++) {
                arr[0][j]=0;
            }
        }
        if (flag == true) {
            for (int i = 0; i < r; i++) {
                arr[i][0]=0;
            }

        }










//        boolean[] row=new boolean[r];
//        boolean[] col=new boolean[c];
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                if(arr[i][j]==0){
//                    row[i]=true;
//                    col[j]=true;
//                }
//            }
//
//            }
//        for (int i = 0; i < r; i++) {
//            if(row[i]==true){
//                for (int j = 0; j < c; j++) {
//                    arr[i][j]=0;
//                }
//            }
//        } for (int i = 0; i < c; i++) {
//            if(row[i]==true){
//                for (int j = 0; j < r; j++) {
//                    arr[j][i]= 0;
//                }
//            }


        for(int[] ar:arr){
            for (int ww:ar){
                System.out.print(ww+" ");
            }
            System.out.println();
        }

}}
