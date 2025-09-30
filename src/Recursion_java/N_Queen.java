package Recursion_java;

public class N_Queen {
    public static void main(String[] args) {
        int n=1;
        boolean[][] maze=new boolean[n][n];
        quuen(maze,0,n);
        System.out.println(count);

    }
    static int count=0;
    public static void quuen(boolean[][] maze, int row, int tq) {
        if(tq==0){
            count++;
            return;
        }
        for (int i = 0; i < maze.length; i++) {
            if (isPossible(maze, row, i)) {
                maze[row][i] = true;
                quuen(maze, row + 1, tq - 1);
                maze[row][i] = false;
            }
        }
    }

    private static boolean isPossible(boolean[][] maze, int row, int i) {
        int r = row;
        while (r >= 0) {
            if (maze[r][i] == true) {
                return false;
            }
            r--;
        }
        r=row;
        int c=i;
        while (r >= 0 && c >= 0) {
            if (maze[r][c] == true) {
                return false;

            }
            r--;
            c--;
        }
        r=row;
        c=i;
        while (r >= 0 && c < maze.length) {
            if (maze[r][c] == true) {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
}