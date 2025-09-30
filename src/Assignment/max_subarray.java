package Assignment;

public class max_subarray {
    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,-1,-2,-3,1,3,4,3,-2,-3,45,5};
        int[] arr={-2,-3,-4,-3,-1};
        int max=Integer.MIN_VALUE;

        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum+=arr[i];
            if(sum>max){
                max=sum;

            }
            if (arr[i]<0){
                sum=0;
                System.out.print(arr[i]+" ");






            }


        }
        System.out.println();
        System.out.println(max);
    }
}
