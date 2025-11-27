package Array;

public class Medium_Row_Sorted_Matrix {
    public static void main(String[] args) {
int[][] arr={{1,3,5},{2,6,9},{3,6,9}};
        System.out.println(mediumEle(arr));
    }
    public static int mediumEle(int[][] arr){
        int n= arr.length;
        int m= arr[0].length;
        int N=n*m;
//        int mediumA=N/2;
        int mediumA=N/2;
        int i=1;
        int j=2000;
        while (i<=j){
            int mid=i+(j-i)/2;
            int k=findSmallele(arr, mid);
            if (k<=mediumA){
                i=mid+1;
            }
            else {
                j=mid-1;
            }
        }
        return i;
    }

    private static int findSmallele(int[][] arr, int mid) {
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
