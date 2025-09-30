package Recursion_java;

public class print_series {
    static void series(int n){
        if(n==0){
//            System.out.println("0");
            return;
        }
        System.out.print(n); //4,3,2,1
       series(n-1);

        System.out.print(n); //1,2,3,4

    }
    public static void main(String[] args) {
series(4);
    }
}
