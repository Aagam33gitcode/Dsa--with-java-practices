package Assignment;

public class prefix_sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};


        System.out.println(print_range(arr,0,2));
        for (int ww : arr) {
            System.out.print(ww+" ");
        }

    }
        public static int print_range(int[] arr,int start,int end){
            for (int i = start; i <=end ; i++) {
                System.out.print(arr[i]+" ");
                System.out.println();
            }

            for (int i = 1; i < arr.length ; i++) {
                arr[i]=arr[i-1]+arr[i];
            }

            if(start==0){
                System.out.println("sum is: ");
                return arr[end];
            }
            int sum=arr[end]-arr[start-1];

        return sum;}



}
