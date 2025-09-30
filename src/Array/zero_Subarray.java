package Array;

public class zero_Subarray {
    public static void main(String[] args) {
        int[] arr={1,2,34,5,6,78,-2,-4,-1,-3,-2,3-4,2-1,3};
        System.out.println(subarray(arr));
    }
    public static int subarray(int[] arr){
        int cont=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum=arr[i]+arr[j];
                if(sum==0){
                    System.out.println(arr[i]+" "+arr[j]);
                    cont++;
                }
            }
        }return cont;
    }
}
