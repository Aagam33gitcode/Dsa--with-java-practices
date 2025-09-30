package Array;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int n= arr.length;
       reverse(arr,0,n-1);
        for(int arr1:arr){
            System.out.print(arr1+" ");
        }
        System.out.println();
    }
    public static void reverse(int[] arr, int i, int j){
         i=0;
         j= arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
