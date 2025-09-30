package Array;

public class Aarray_189 {

    public static void main(String[] args){
             int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("original: ");
             for(int i=0; i<arr1.length; i++){
                 System.out.print(arr1[i]+" ");
             }
        System.out.println();
             Rotate(arr1,3);
        System.out.println("After rotate to k");
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        reverse_k(arr1,4);
        for(int arr:arr1){
            System.out.print(arr+" ");
        }
        System.out.println();
         }

  public   static void reverse(int[] arr ,int i ,int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void Rotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }


    public static void roat(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        for (int j = 1; j <=k ; j++) {
            int temp = arr[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                arr[i + 1] = arr[i];

            }
            arr[0] = temp;

        }

    }




public static void reverse_k(int[] arr,int k){
        int n= arr.length;
reverse(arr,0,n-k-1);
reverse(arr,n-k,n-1);
reverse(arr,0,n-1);

    }
}