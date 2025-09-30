package Digit;

public class power  {
   static int pow(int x,int n){
    if(n==0){
        return 1;

    }
    int pp=pow(x,n-1);


        return pp*x;
    }
    public static void main(String[] args) {

       System.out.println(pow(2,1
       ));
    }
}
