package Recursion.Practics;

import java.util.Scanner;

public class Rat_in_Maze {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char[][] maze =new char[n][m];
        for (int i = 0; i < n ; i++) {
            String s=sc.next();
            for (int j = 0; j < m; j++) {
                maze[i][j]=s.charAt(j);
            }
        }
        int[][] ans=new int[n][m];
        findPath(maze,0,0,ans);

    }

    public static void findPath(char[][] maze,int cr,int cc,int[][] ans ){
if (cc==maze.length-1&&cr==maze.length-1&&maze[cc][cr]!='X'){
    ans[cr][cc]=1;
    display(ans);

    return;
}

        if (cc<0||cr<0||cr>maze.length-1||cc> maze.length-1||maze[cr][cc] != 'O'){
            return;
        }
        int[] r={0,0,-1,1};
        int[] c={-1,1,0,0};
        maze[cr][cc]='X';
        ans[cr][cc]=1;
        for (int i = 0; i <r.length ; i++) {
        findPath(maze,cr+r[i],cc+c[i],ans);
//        findPath(maze,cr,cc+1,ans);
//        findPath(maze,cr,cc-1,ans);
//        findPath(maze,cr+1,cc,ans);
//        findPath(maze,cr-1,cc,ans);

    }
        maze[cr][cc]='O';
        ans[cr][cc]=0;}

    private static void display(int[][] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
