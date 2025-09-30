package Assignment;

public class rain_trapping {
    public static void main(String[] args) {
        int[] arr={2,3,1,8,2,4,5};
        System.out.println(    rain_trap(arr));


    }//2,3,1,8,2,4,5
    public static int rain_trap(int[] arr) {
//        int sum=0;
//        int rightmax=Integer.MIN_VALUE;
//        int leftmax=Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            //for left max
//            for(int j=i;j>=0;j--){
//                 rightmax=Math.max(arr[i],arr[j]);
////                System.out.println(rightmax);
//            }
//            for (int k=i;k< arr.length;k++){
//
//                leftmax=Math.max(arr[i],arr[k]);
//
//            }
//            sum+=Math.min(rightmax,leftmax)-arr[i];
//        }
//        System.out.println(sum);


        int[] left=new int[arr.length];
        left[0]=arr[0];
        for(int i=1;i< arr.length;i++){
            left[i]=Math.max(arr[i],left[i-1] );

        }
        int[] right=new int[arr.length];
        right[arr.length-1]=arr[left.length-1];
        for(int j= arr.length-2;j<=0;j++){
            right[j]=Math.max(arr[j],right[j+1] );

        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=Math.min(left[i],right[i] )-arr[i];
        }



        return sum;
    }
}
