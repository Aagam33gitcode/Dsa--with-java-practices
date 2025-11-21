package SearchingAlgorithms;

public class ExpontentinalSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,12};
        System.out.println("Index : "+expSearch(arr,0));
    }
    public static int expSearch(int[] arr,int target){
       if (arr[0]==target){
           return 0;
       }
        int i=1;
                int n= arr.length;
                while (i<n&&arr[i]<=target){
                i=i*2;

                }

                int start=i/2;
                if (i>n){
                    i=n-1;
                }
                int end=i;
//                int end=Math.min(i,n-1);
                while (start<=end){
                    int mid=start+(end-start)/2;
                    if (arr[mid]==target){
                        return mid;
                    } else if (arr[mid]>target) {
                        end=mid-1;

                    }
                    else {
                        start=mid+1;
                    }

                }
    return -1;}

}
