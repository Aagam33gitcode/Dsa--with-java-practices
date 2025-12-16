package Recursion.Practics;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        String s="ABCCED";
//        String s="ABCB";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                boolean ans=wordSearch(board,i,j,s,0);
                if (ans){
                    System.out.println(ans);
                    return;
                }


            }
        }
        System.out.println(false);
    }

    private static boolean wordSearch(char[][] board, int cr, int cc, String s, int idx) {
       if (s.length()==idx){
           return true;
       }
        int[] r={-1,1,0,0};
        int[] c={0,0,-1,1};
        if (cr<0||cc<0||cr>=board.length||cc>= board[0].length||board[cr][cc]!=s.charAt(idx)){
            return false;
        }
        board[cr][cc]='*';
        for (int i = 0; i < 4; i++) {
            boolean ans=wordSearch(board,cr+r[i],cc+c[i],s,idx+1);
            if (ans) {
                return true;
            }
        }
        board[cr][cc]=s.charAt(idx);
        return false;

    }
}
