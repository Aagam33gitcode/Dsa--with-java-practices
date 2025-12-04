package Recursion;

public class mazePath {
    public static void main(String[] args) {
        printmaze(1,1,3,2,"");
        System.out.println();
        System.out.println("No. of path in maze: "+countMAzePAth(1,1,3,2));
        printmaze2(3,2,"");

    }
    public  static void printmaze(int row,int col,int m,int n,String ans){
        if(row==m&&col==n){
            System.out.print(ans+" ");
            return;
        }
        if (col<n) {
            printmaze(row, col + 1, m, n, ans + "R");
        }if(row<m) {
            printmaze(row + 1, col, m, n, ans + "D");
        }}
    public static void printmaze2(int row,int col,String ans){
        if(row==1&&col==1){
            System.out.print(ans+" ");
            return;
        }
if (col>0) {
    printmaze2(row, col - 1, ans + "R");
}if(row>0){printmaze2(row-1,col,ans+"D");
    }}
public static int countMAzePAth(int row,int col,int m,int n){
        if(row==m||col==n){
            return 1;
        }
        int right=countMAzePAth(row,col+1,m,n);
        int down=countMAzePAth(row+1,col,m,n);
        return right+down;

}
}

