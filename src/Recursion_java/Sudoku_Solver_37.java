package Recursion_java;


public class Sudoku_Solver_37 {
    public static void main(String[] args) {
         char[][] grid={
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
        System.out.println(  sudoku(grid,0,0));


    }
        public static boolean sudoku(char[][] board, int row, int col) {
            if (col == 9) { // move to next row
                row++;
                col = 0;
            }
            if (row == 9) {
                return true;
            }

            if (board[row][col] != '.') {
                return sudoku(board, row, col + 1);
            } else {
                for (char num = '1'; num <= '9'; num++) {
                    if (isPossible(board, row, col, num)) {
                        board[row][col] = num;

                        if (sudoku(board, row, col + 1)) {
                            return true;
                        }

                        board[row][col] = '.';
                    }
                }
            }
            return false;
        }

        public static boolean isPossible(char[][] board, int row, int col, char num) {
            // check row
            for (int j = 0; j < 9; j++) {
                if (board[row][j] == num) return false;
            }

            // check column
            for (int i = 0; i < 9; i++) {
                if (board[i][col] == num) return false;
            }

            // check 3x3 subgrid
            int r = row - row % 3;
            int c = col - col % 3;

            for (int i = r; i < r + 3; i++) {
                for (int j = c; j < c + 3; j++) {
                    if (board[i][j] == num) return false;
                }
            }

            return true;
        }
    }
//    public static boolean sudoku(char[][] grid,int cr,int cc){
//        if(cc==grid[0].length){
//            cr++;
//            cc=0;
//        }
//        if(cr==grid.length){
//            display(grid);
//            return;
//        }
//        if(grid[cr][cc]!='.'){
//            sudoku(grid,cr,cc+1);
//
//        }
//        else {
//            for (char i = '1'; i <='9' ; i++) {
//                if(isPossible(grid,cr,cc,i)==true){
//                    grid[cr][cc]=i;
//                    sudoku(grid,cr,cc+1);
//                    grid[cr][cc]='.';
//                }
//            }
//        }
//    }
//
//    public static boolean isPossible(char[][] grid, int cr, int cc, char i) {
//        //left
//        for (int j = 0; j <grid.length; j++) {
//            if(grid[cr][j]==i){
//                return false;
//            }}
////col
//            for (int k = 0; k < grid.length; k++) {
//     if(grid[k][cc]==i){
//         return false;
//     }}
//     //In matrix nxn
//                int r=cr-cr%3;
//     int c=cc-cc%3;
//
//                for (int l = r; l <r+3 ; l++) {
//                    for (int m = c; m <c+3 ; m++) {
//                        if(grid[l][m]==i){
//                            return false;
//                        }
//                    }
//                }
//
//
//        return true;
//    }
//
//    private static void display(char[][] grid) {
//
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                System.out.print(grid[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }

