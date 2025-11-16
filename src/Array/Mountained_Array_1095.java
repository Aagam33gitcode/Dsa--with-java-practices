package Array;

public class Mountained_Array_1095 {
    public static int findPeak(int[] arr,int target){
        int n=mountainArr.length();
        int start=0;
        int end= n-1;
        int mid=-1;
        while (start<=end){
            mid=start+(end-start)/2;
            int crr=mountainArr.get(mid);
            if (mid!=0&&mid!= n-1&&crr>mountainArr.get(mid+1)&&crr>mountainArr.get(mid-1)){
                if (crr==target){
                    return mid;
                }
                break;
            } else if (mid!= n-1&&crr<mountainArr.get(mid+1)) {
                start=mid+1;

            }
            else {
                end=mid-1;
            }
        }
        start=0;
        end=mid;
        while (start<=end){
            int m=start+(end-start)/2;
            int curr=mountainArr.get(m);
            if (curr==target){
                return m;
            } else if (target<curr) {
                end=m-1;
            }
            else {
                start=m+1;
            }
        }
        start=mid+1;
        end= n-1;
        while (start<= end){
            int m=start+(end-start)/2;
            int curr=mountainArr.get(m);
            if (curr==target){
                return m;
            } else if (target<curr) {
                start=+1;


            }else {
                end=m-1;
            }
        }
        return -1;
    }
}
