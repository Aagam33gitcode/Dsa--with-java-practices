package Recursion;

public class WordSearch_79 {
    public static void main(String[] args) {
        char[][] maze={{},{}};
        String word="hhdjfkjj";
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if(word.charAt(0)==maze[i][j]){
                    boolean ans=search(maze,i,j,word,0);
                }
            }
        }
    }
    public  static  boolean search(char[][] maze,int cr,int cc, String word, int idx){
        if(idx==word.length()){
            return true;
        }
        if(cr<0||cc<0||cr>=maze.length||cc>= maze[0].length||word.charAt(idx)!=maze[cr][cc]){
            return false;
        }
        maze[cr][cc]='*';
int[] r={-1,1,0,0};
int[] c={0,0,-1,1};

        for (int i = 0; i < r.length; i++) {
        boolean ans=search(maze,cr+r[i],cc+c[i],word,idx+1);
        if(ans) {
            return true;
        }
        }
        maze[cr][cc]=word.charAt(idx);

    return false;}
}
