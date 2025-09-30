package Recursion_java;

public class NQueen {
    public static void main(String[] args) {
        boolean[][] ans=new boolean[4][4];
        Display(ans);
        NqueenProblem(ans,0,4);

    }
    public static  void NqueenProblem(boolean[][] borad, int row, int tq){
        if(tq==0){
            Display(borad);
            return;
        }
for(int col=0;col<borad.length;col++){
        if(isitSafe(borad, row, col)) {
            borad[row][col] = true;
            NqueenProblem(borad, row + 1, tq - 1);
            borad[row][col] = false;
        }
        }

    }
    public static boolean isitSafe(boolean[][] board,int r,int c){

        //for upper
         int row=r;
         while(row>=0){
             if(board[row][c]){
                 return false;
             }
             row--;
         }
        //left diagonal
         row=r;
        int col=c;
         while (row>=0&&col>=0){
             if (board[row][col]){
                 return false;
             }
             row--;
             col--;

         }
         row=r;
         col=c;
         // right diagonal
        while (row>=0 && col<board.length){
            if (board[row][col]){
                return false;
            }
            row--;
            col--;
        }

        return true;
    }
    public static void  Display(boolean[][] ans){
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println();
    }
}
