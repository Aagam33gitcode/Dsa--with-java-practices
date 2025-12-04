package Recursion;

public class decreasing {
static  void print_dec(int n){
    if(n>0){
        System.out.print(n+" ");
        print_dec(n-1);
        return;

    }


}
    public static void main(String[] args) {
        int n=10;
        print_dec(n);
    }
}
