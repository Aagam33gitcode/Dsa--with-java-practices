package CodeVita;
import java.util.*;

public class Question3 {
    static int m, n;
    static char[][] grid;
    static int[] dr = { -1, 0, 1, 0 };
    static int[] dc = { 0, 1, 0, -1 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        grid = new char[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }

        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 4; k++) {
                    max = Math.max(max, simulate(i, j, k));
                }
            }
        }
        System.out.println(max);
    }

    public static int simulate(int x, int y, int dir) {
        boolean[][][] visit = new boolean[m][n][4];
        int count = 0;

        while (true) {
            if (x < 0 || y < 0 || x >= m || y >= n) {
                return 0;
            }

            if (visit[x][y][dir]) {
                return count;
            }

            visit[x][y][dir] = true;
            count++;

            char cell = grid[x][y];

            if (cell == '/' || cell == '1') {
                if (dir == 0) dir = 1;
                else if (dir == 1) dir = 0;
                else if (dir == 2) dir = 3;
                else dir = 2;
            } else if (cell == '\\' || cell == '0') {
                if (dir == 0) dir = 3;
                else if (dir == 3) dir = 0;
                else if (dir == 1) dir = 2;
                else dir = 1;
            }

            x = x + dr[dir];
            y = y + dc[dir];
        }
    }
}
