package Array;

public class FindPostion {
    public static void main(String[] args) {
//        int[] arr={2,10,3,5,32,6,8};
        int[] arr={5,7,2,3,8,1,4};
        find(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static  void find(int[] arr){
        int item=arr[arr.length-1];
        int idx=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<=item){
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
                idx++;
            }
        }
    }
}
