package Array;

public class reverse_array {
    static  void Reverse(int[]  arr){
        int i=0;
        int  j= arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void print_array(int[] arr){
        for(int arr1:arr){
            System.out.println(arr1);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,21,23,23,2};

        Reverse(arr);
        print_array(arr);
//        for(int ww:arr){
//            System.out.println(ww);
//        }
//        int i=0;
//        int j=arr.length-1;
//        while(i<=j){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//        i++;
//        j--;
//
//
//        }
//        for(int arr1:arr){
//            System.out.print(+arr1+" ");
//        }

    }
}
