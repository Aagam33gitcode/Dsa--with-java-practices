package Array;

import java.util.Scanner;

public class Rat_cheese {
    static boolean flag=false;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char[][] maze=new char[m][n];
        for (int i = 0; i < maze.length; i++) {
            String s=sc.next();
            for (int j = 0; j < s.length(); j++) {
                maze[i][j]=s.charAt(j);
            }
        }
        int[][] ans=new int[m][n];
        ratPath(maze,0,0,ans);
if(flag==false){
    System.out.println("Not Found");
}
    }
public  static void ratPath(char[][] maze,int cr,int cc,int[][] ans){
       if(cr==maze.length-1 && cc==maze[0].length-1 &&maze[cr][cc]!='0'){
           ans[cr][cc]=1;
           flag=true;
           display(ans);
       return;
       }


        if(cr<0||cc<0||cr>=maze.length||cc>=maze[0].length||maze[cr][cc]=='X'){
            return;
        }
        maze[cr][cc]='X';
        ans[cr][cc]=1;
        //left
        ratPath(maze,cr,cc+1,ans);
        //right
    ratPath(maze,cr,cc-1,ans);
    //top
    ratPath(maze,cr-1,cc,ans);
    //down
    ratPath(maze,cr+1,cc,ans);
        maze[cr][cc]='O';
        ans[cr][cc]=0;
}

    public static void display(int[][] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]);

            }
            System.out.println();
        }
    }
}

