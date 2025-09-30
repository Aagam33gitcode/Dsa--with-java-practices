package Array;

public class sudoko {
    public static void main(String[] args) {
        int sudoku[][] = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}



        };
        printSudoko(sudoku,0,0);
    }

    public static void printSudoko(int[][] grid, int cr, int cc) {
        if (cc == 9) {
            cc = 0;
            cr++;
        }
        boolean flag = false;
        if (cr == 9) {
            flag = true;
            System.out.println(flag);
            return;
        }

        if (grid[cr][cc]!= 0) {
            printSudoko(grid, cr, cc + 1);
        } else {
            for (int val = 1; val <= 9; val++) {
                if (isItsafe(grid, cr, cc, val) == 1) {
                    grid[cr][cc] = val;
                    printSudoko(grid, cr, cc + 1);
                    grid[cr][cc] = 0;


                }
            }

        }
        System.out.println(false);
        return;
    }
    public static int isItsafe(int[][] grid, int cr, int cc, int val) {

        for (int i=0;i<9;i++){
            if(grid[cr][i]==val){
//                return false;
                return 0;

            }
            else if (grid[i][cc]==val){
//                return false;
                return 0;
            }
        }
        int r=cr-cr%3;
        int c=cc-cc%3;
        for (int i = r; i <r+3 ; i++) {
            for (int j = c; j <c+3 ; j++) {
                if (grid[i][j]==val){
                    return 0;
                }

            }

        }

        return 1;
    }

}