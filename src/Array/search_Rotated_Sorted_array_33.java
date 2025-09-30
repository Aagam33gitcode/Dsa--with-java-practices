package Array;

public class search_Rotated_Sorted_array_33 {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(rotated_sort(arr,0));

    }
    public static int rotated_sort(int[] arr,int target){
        int i=0;
        int j=arr.length-1;
        while (i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[i]<=arr[mid]){
                //left sort
                if(arr[i]<=target&&target<=arr[mid]){
                    j=mid-1;
                }else {
                    i=mid+1;
                }
            }else {
                //right sorted
                    if(arr[mid]<=target&target<=arr[j]){
                        i=mid+1;
                }else {
                        j=mid-1;
                    }

            }

        }return -1;
    }
}
