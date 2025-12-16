package Recursion.Practics;

import static Recursion.NQueen.Display;

public class NQueen {
    public static void main(String[] args) {
        boolean[][] maze=new boolean[4][4];
        nQueen(maze,0,4);
    }
    public static void nQueen(boolean[][] maze,int row, int tq){
       if (tq==0){
           Display(maze);
           return;
       }
        for (int i = 0; i < maze.length; i++) {
            if (isSafe1(maze,row,i)){
                maze[row][i]=true;
                nQueen(maze,row+1, tq-1);
                maze[row][i]=false;
            }
        }
    }

    private static boolean isSafe(boolean[][] maze, int row, int col) {
        while (row>=0){
            if (maze[row][col]==true){
                return false;
            }
            row--;
        }
        while (row>=0 && col>=0){
            if (maze[row][col]){
                return false;
            }
            row--;
            col--;
        }
        while (row>=0&&col<maze.length){
            if (maze[row][col]){
                return false;
            }
            row--;
            col++;
        }
        return true;
    }
    private static boolean isSafe1(boolean[][] maze, int row, int col) {
    int[] r={-1,-1,-1};
    int[] c={0,-1,1};
        for (int i = 0; i < 3; i++) {
           int rr= row+r[i];
           int cc= col+c[i];
           while (rr>=0&&cc>=0&&cc< maze.length) {
               if (maze[rr][cc] == true) {
                   return false;
               }
               rr+=r[i];
               cc+=c[i];
           }
        }
        return true;
    }

}
