package String;

public class max_val {


    public static int max1(int[] arr){
        int max=0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                max=arr[i];

            }
            else{
                max=arr[i+1];
            }

        }
        return max;    }
    public static void main(String[] args) {
        int[] arr={1,2,3,45,6,54,3};
        System.out.println(max1(arr));




    }
}
