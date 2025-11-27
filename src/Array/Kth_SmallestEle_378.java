package Array;

public class Kth_SmallestEle_378 {
    public static void main(String[] args) {
int[][] arr={{1,4,9},{11,12,15},{17,18,20}};
        System.out.println(kthEle(arr,8));
    }
    public static int kthEle(int[][] arr,int k){
        int n= arr.length;
        int m= arr[0].length;
        int N=n*m;

        int i=arr[0][0];
        int j=arr[n-1][m-1];
        while (i<=j){
            int mid=i+(j-i)/2;
            int k1=findKthSmallele(arr, mid);
            if (k1<=k-1){
                i=mid+1;
            }
            else {
                j=mid-1;
            }
        }
        return i;
    }

    private static int findKthSmallele(int[][] arr, int mid) {
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            int start=0;
            int end=arr[i].length-1;
            while (start<=end){
                int midA=start+(end-start)/2;
                if (arr[i][midA]<=mid){
                    start=midA+1;
                }
                else {
                    end=midA-1;
                }
            }
            k+=start;
        }
        return k;
    }
}
