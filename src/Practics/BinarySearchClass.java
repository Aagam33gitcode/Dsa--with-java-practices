package Practics;

public class BinarySearchClass {
    public static int binaryS(int[] arr ,int target,boolean isfirst){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
          int   mid=(start+end)/2;
            if(arr[mid]==target){
                ans=mid;
                if (isfirst==true){
                    end=mid-1;
                }
                else {start=mid+1;}
                break;

            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }return ans;
    }
    public static int binarySearchFirst(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]==target){
                high=mid-1;
                ans=mid;
            } else if (arr[mid]>target) {
                high=mid-1;

            }
            else{
                low=mid+1;
            }

        }
        return ans+1;
        }
        public static int bianrySearchLast(int[] arr,int target){
             int low=0;
             int high=arr.length-1;
             int ans=-1;
             while (low<=high){
                 int mid=low+(high-low)/2;
                 if (arr[mid]==target){
                     low=mid+1;
                     ans=mid;
                 } else if (arr[mid]>target) {
                     high=mid-1;

                 }
                 else{
                     low=mid+1;
                 }

             }
             return ans+1;
         }
         //find no. of target element int array
    public static int countTarget(int[] arr ,int target){
        int start=binarySearchFirst(arr,target);
        int end=bianrySearchLast(arr, target);
        if (start==0||end==0){
            return 0;
        }
        return end-start+1;

    }
    public static int floorBinarySearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
int ans=-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]==target){
               return arr[mid];
            } else if (arr[mid]>target) {
                high=mid-1;
            }
            else{
                low=mid+1;
                ans=arr[mid];
            }

        }
        return ans;
    }
    public static char Smallest_Greater_Target_744(char[] arr,char target){
        int low=0;
        int high=arr.length-1;
char ans= '\0';
        while (low<=high){
            int mid=low+(high-low)/2;

           if (arr[mid]>target) {
                high=mid-1;
                ans= arr[mid];
//           return arr[mid];
           }
            else{
                low=mid+1;
            }

        }
        if (ans=='\0'){
            return arr[0];
        }
        else {
            return ans;
        }

    }
public static int ceilBinarysearch(int[] arr,int target){

        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]==target){
                return arr[mid];
            } else if (arr[mid]>target) {
                high=mid-1;
                ans=arr[mid];
            }
            else{
                low=mid+1;
            }

        }
        return ans;
    }
}

