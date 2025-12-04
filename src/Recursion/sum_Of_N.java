package Recursion;

public class sum_Of_N {
    public static void main(String[] args) {
        System.out.println(printSum(6));
    }
    public static int printSum(int n){
        if(n==1){
            return 1;
        }
        int fn=printSum(n-1);
        return n+fn;
    }
}
