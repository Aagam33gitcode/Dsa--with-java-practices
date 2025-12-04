package Recursion;

public class power {
   static int pow(int x,int n){
    if(n==0){
        return 1;
    }
    int pp=pow(x,n-1);


        return pp*x;
    }public static double pow1(double x,int n){
    if(n==0){
        return 1.0;
    }
    if(n<0){
        return 1/pow1(x,-n);
    }
    else {
        return x * pow1(x, n - 1);
    }
   }
    public static void main(String[] args) {

       System.out.println(pow(2,1));
       double result=pow1(2.0000,-2);
        System.out.println(result);
//        System.out.println(pow1(2.0000,-10));
    }
}
