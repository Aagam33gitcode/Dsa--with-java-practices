package Array;

public class array_42 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,43,2,3,4,55,6,43,4,5,65,3,556,4,3,5};
        int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println( water_trapping(arr));
    }

    public static int water_trapping(int[] arr){
        int[] leftMax=new int[arr.length];
        int[] rightMAx=new int[arr.length];


      //left max  array
leftMax[0] =arr[0];
        for (int i = 1; i < arr.length ; i++) {
            leftMax[i]=Math.max(leftMax[i-1],arr[i]);
        }
//RIght max array
        rightMAx[arr.length-1]=arr[arr.length-1];
        for (int i = arr.length-2; i >=0 ; i--) {
            rightMAx[i]=Math.max(rightMAx[i+1],arr[i]);
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+Math.min(leftMax[i],rightMAx[i])-arr[i];
        }
        return sum;
    }

}

