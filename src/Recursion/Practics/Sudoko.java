package Recursion.Practics;



public class Sudoko {
    public static void main(String[] args) {
        int[][] board = {
                {5,3,0,0,7,0,0,0,0},
                {6,0,0,1,9,5,0,0,0},
                {0,9,8,0,0,0,0,6,0},

                {8,0,0,0,6,0,0,0,3},
                {4,0,0,8,0,3,0,0,1},
                {7,0,0,0,2,0,0,0,6},

                {0,6,0,0,0,0,2,8,0},
                {0,0,0,4,1,9,0,0,5},
                {0,0,0,0,8,0,0,7,9}
        };
        char[][] board36 = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},

                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},

                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

      sudoKo(board,0,0);

    }
    public static void sudoKo(int[][] maze, int cr, int cc){
       if (cc==9){
           cc=0;
           cr++;
       }
       if (cr==9){
           Display(maze);
           return ;
       }
        if (maze[cr][cc]!=0){
            sudoKo(maze,cr,cc+1);
        }else{
            for (int i = 1; i <=9; i++) {
                if (isPossible(maze,cr,cc,i)){
                maze[cr][cc]=i;
                sudoKo(maze,cr,cc+1);
                maze[cr][cc]=0;
            }}
        }

    }

    private static void Display(int[][] maze) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static boolean isPossible(int[][] maze, int cr, int cc, int val) {
        //for row
        for (int i = 0; i < maze.length; i++) {
            if (maze[cr][i]==val){
                return false;
            }
        }
        //for col
        for (int i = 0; i < maze.length; i++) {
            if (maze[i][cc]==val){
                return false;
            }
        }
        //3x3 matrix
        int row=cr-cr%3;
        int col=cc-cc%3;
        for (int i = row; i <row+3 ; i++) {
            for (int j = col; j <col+3 ; j++) {
                if (maze[i][j]==val){
                    return false;
                }
            }
        }
            return true;
    }
}
