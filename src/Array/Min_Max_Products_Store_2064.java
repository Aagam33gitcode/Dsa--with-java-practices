package Array;

public class Min_Max_Products_Store_2064 {
    public static void main(String[] args) {
        int[] arr={11,6};
        System.out.println(findMinStore(arr,6));

    }
    public static int findMinStore(int[] arr, int nos){
        int i=1;
        int j=-1;
        int ans=-1;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k]>j){
                j=arr[k];

            }

        }
        while (i<=j){
            int mid=i+(j-i)/2;
            if (isVisitedStore(arr, mid ,nos)){
                ans=mid;
                j=mid-1;
            }
            else {
                i=mid+1;
            }
        }
        return ans;
    }

    private static boolean isVisitedStore(int[] arr, int mid, int nos) {
    int visitedStore=0;
        for (int i = 0; i < arr.length; i++) {
            visitedStore+=arr[i]/mid;
            if (arr[i]%mid!=0){
                visitedStore+=1;
            }
        }
        if (visitedStore>nos){
            return false;
        }
        return true;
    }
}
