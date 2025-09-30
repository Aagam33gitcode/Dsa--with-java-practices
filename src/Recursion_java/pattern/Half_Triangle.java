package Recursion_java.pattern;

public class Half_Triangle {
    public static void main(String[] args) {
top(4);
        System.out.println();
left(4);
right(4,0);
    }
    public  static void top(int n){
        if(n<=0){
            return;
        }
        for (int i=0;i<n;i++){
            System.out.print("*"+" ");

        }
        System.out.println();
top(n-1);
    } public  static void left(int n){
        if(n<=0){
            return;
        }
        left(n-1);
        for (int i=0;i<n;i++){
            System.out.print("*"+" ");

        }
        System.out.println();
    } public  static void right(int n,int rr){
        if(n<=0){
            return;
        }
        for (int i=rr;i<n;i--){
            System.out.print("*"+" ");

        }
        System.out.println();
        right(n,rr-1);
    }
}
