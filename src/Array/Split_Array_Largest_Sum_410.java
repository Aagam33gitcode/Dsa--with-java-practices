package Array;

public class Split_Array_Largest_Sum_410 {
    public static void main(String[] args) {
        int[] arr={3,2,2,4,1,4};
        System.out.println(finSplitArray(arr,3));

    }
    public static int finSplitArray(int[] arr, int student){
        int i=0;
        int j=0;
        int ans=-1;
        if (student>arr.length){
            return -1;
        }
        for (int k = 0; k < arr.length; k++) {
            j=arr[k]+j;
            if (arr[k]>i){
                i=arr[k];
            }
        }
        while (i<=j){
            int mid=i+(j-i)/2;
            if (isPossible(arr,mid,student)){
                ans=mid;
                j=mid-1;
            }
            else {
                i=mid+1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, int mid, int student) {
        int currStudent=1;
        int readPages=0;
        for (int i = 0; i < arr.length; i++) {
            readPages=arr[i]+readPages;
            if (readPages>mid){
                currStudent++;
                readPages=arr[i];
            }
            if (currStudent>student){
                return false;
            }
        }
        return true;
    }
}
