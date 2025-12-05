package Recursion;

public class factorialH_T {
  public static int factHead(int n){
       if(n==0){
           return 1;
       }
       int fn= factHead(n-1);
       return n*fn;
    }
    public static  int factTail(int n, int ans){
      if (n==1){
          return ans;
      }
      return factTail(n-1,ans*n);
    }

    public static void main(String[] args) {
        System.out.println(factHead(5));//Head Recursion
        System.out.println(factTail(5,1));//Tail Recursion
    }
}
