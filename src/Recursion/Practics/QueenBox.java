package Recursion.Practics;

public class QueenBox {
    public static void main(String[] args) {
        int[] arr=new int[4];
        permuation(arr,2,0,"");
    }
    public static void permuation(int[] arr, int tq,int qpsf, String ans){
        if (tq==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                arr[i]=1;
                permuation(arr,tq-1,qpsf,ans+"b"+i+"q"+(tq-1)+" ");
                arr[i]=0;
            }
        }
    }
}
