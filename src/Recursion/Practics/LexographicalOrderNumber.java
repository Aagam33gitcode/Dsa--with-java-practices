package Recursion.Practics;

public class LexographicalOrderNumber {
    public static void main(String[] args) {
        pritnOrder(0,1000);
    }
    public static void pritnOrder(int curr,int n){
        if(curr>n){
            return;
        }
        System.out.println(curr);
        int i=0;
        if (curr==0){
            i=1;
        }
        for (; i <=9 ; i++) {
            pritnOrder(curr*10+i,n);
        }
    }
}
