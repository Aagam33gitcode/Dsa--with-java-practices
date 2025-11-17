package Array;

public class Koko_Eating_Bananas_875_1283 {
    public static void main(String[] args) {
        int[] arr={1,2,5,9};
        int[] arr1={30,11,23,4,20};
        System.out.println(findhr(arr,6));
        System.out.println(findhr(arr1,5));
    }
    public static int  findhr(int[] arr,int hr){
        int start=1;
        int end=-1;
        int ans=-1;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i]>end){
               end=arr[i];
           }


        }
        while (start<=end){
            int mid=start+(end-start)/2;
            if (isEatingBanana(arr, mid, hr)){
                ans=mid;
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return ans;
    }

    private static boolean isEatingBanana(int[] arr, int mid, int hr) {
        int hrSpent=0;
        for (int i = 0; i < arr.length; i++) {
            hrSpent+=arr[i]/mid;
            if (arr[i]%mid!=0){
                hrSpent=hrSpent+1;
            }
            if (hrSpent>hr){
                return false;
            }
        }
        return true;
    }
}
