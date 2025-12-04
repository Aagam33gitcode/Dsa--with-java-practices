package Recursion;

public class factorial_1 {
   static int fact(int n){
       if(n==0){
           return 1;
       }
        int fn=fact(n-1);
       System.out.println(fn+" ,");

        return n*fn;
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.print(fact(5));
        System.out.println();

    }
}
