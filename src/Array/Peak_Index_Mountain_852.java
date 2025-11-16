package Array;

public class Peak_Index_Mountain_852 {

    public static void main(String[] args) {

int[] arr={1,2,3,4,54,3,2};
int[] arr1={0,2,1,0};
        System.out.println(finsPeak(arr1));
    }
    public static int finsPeak(int[] arr){
        int i=0;
        int j= arr.length-1;
        int ans=-1;
        while (i<=j){
            int mid=i+(j-i)/2;
            if (mid!=0&&mid!=arr.length-1&&arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
     return mid;
            } else if (mid!= arr.length -1&&arr[mid]<arr[mid+1]) {
                i=mid+1;

            }
            else {
                j=mid-1;
            }
        }
        return ans;
    }
}
