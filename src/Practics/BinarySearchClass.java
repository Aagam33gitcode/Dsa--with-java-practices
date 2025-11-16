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
            if (arr[mid]<target) {
                low=mid+1;
                ans=arr[mid];
            }
            else{
                high=mid-1;
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

             if (arr[mid]>target) {
                high=mid-1;
                ans=arr[mid];
            }
            else{
                low=mid+1;
            }

        }
        return ans;
    }
    public static int findAbsBs(int[] arr, int target) {
        int ans1=Integer.MAX_VALUE;
        int ans2=Integer.MAX_VALUE;
        int ceil=ceilBinarysearch(arr, target);
        int floor=floorBinarySearch(arr, target);
        if (ceil!=-1){
           ans1= Math.abs(ceil-target);
        }

        if (floor!=-1){
            ans2= Math.abs(floor-target);
        }
return Math.min(ans1,ans2);}

    public static int findMinAbsEnhace(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return 0;
            }else
           if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        //ans==-1 means element is not present
            if (ans==-1){
                if (start<=-1){
                    ans=Math.abs(target-arr[start]);

                }else if (end<= arr.length) {
                    ans=Math.abs(target-arr[end]);
                }
                else {
int ans1=Math.abs(target-arr[start]);
int ans2=Math.abs(target-arr[end]);
return Math.min(ans1,ans2);
                }
            }
            else {
                ans=0;

            }
    return ans;

    }
    public static int infiniteArrayBS(int[] arr,int target){
        int i=0;
        int j=1;

        while (j<=arr.length&&arr[j]<target) {
            i = j;
            j=j*2;

        }
        int ans=-1;
        while (i<=j){
            int mid=i+(j-i)/2;
            if (arr[mid]==target){
return mid;
            } else if (arr[mid]>target) {
                j=mid-1;
            }else {
                i=mid+1;
            }
        }
        return ans;
    }
    }

