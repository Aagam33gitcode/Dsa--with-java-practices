package Recursion_java;

public class HCF_GCF {
    public static void main(String[] args) {
        System.out.println("HCF IS "+hcf(1,1));
    }
    public static int hcf(int a,int b){
        if(b%a==0){
            return a;
        }
        return hcf(b%a,a);
    }
}
