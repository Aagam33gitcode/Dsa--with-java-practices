package Array;

public class array_238 {
    public static void main(String[] args) {
        int[] arr={12,43,2,54,25,6};

        System.out.println(product(arr));
    }

    public static int[] product(int[] arr){
        int n=arr.length;
        int[] left=new int[n];
        left[0]=1;
        for (int i = 1; i < n; i++) {

        left[i]=left[i-1]*arr[i-1];

        }
        int[] right=new int[n];
        right[n-1]=1;
        for (int i = n-2; i >= 0; i--) {

            right[i]=right[i+1]*arr[i+1];

        }
        for (int i = 0; i < n; i++) {
            left[i]=left[i]*right[i];

        }

return left;
    }

}
