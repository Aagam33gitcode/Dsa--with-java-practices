package Recursion_java.pattern;

public class Box {
    public static void main(String[] args) {
        print(4,4);
    }
    public static  void print(int n, int row){
        if(n<=0){
            return;
        }
        for (int i=1; i<=row; i++) {
            System.out.print("*"+" ");
        }
        System.out.println();
        print(n-1,row);


        }

}
