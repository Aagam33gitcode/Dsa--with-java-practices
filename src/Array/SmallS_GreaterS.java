package Array;

public class SmallS_GreaterS {
    public static void main(String[] args) {
    int[] arr={6,1,2,3,5,5,7,3,4};
    int si=0;
    int ei= arr.length-1;
    int item=arr[ei];
    int idx=si;
        for (int i = 0; i <= ei; i++) {
            if (arr[i]<=item){
                int temp=arr[i];
                arr[i] =arr[idx];
                arr[idx]=temp;
                idx++;
            }
        }
        System.out.println(idx);


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
