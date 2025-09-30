package Array;

public class sort_Sequence_Square {
    public static void main(String[] args) {
        int[] arr={-6,-3,-2,-1,5,6,7};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        seuenceSquare(arr);

    }
    public static void seuenceSquare(int[] arr){
        int[] ww=new int[arr.length];
        int i=0;
        int j=arr.length-1;
        int k=0;
        while (i<=j){
            if(Math.abs(arr[i])>=Math.abs(arr[j])){
                ww[k]=arr[i]*arr[i];
              i++;k++;
            }else {
                ww[k]=arr[j]*arr[j];
                j--;
                k++;

            }
        }
        for (int l = 0; l < ww.length; l++) {
            System.out.print(ww[l]+" ");
        }
        System.out.println();
    }
}
