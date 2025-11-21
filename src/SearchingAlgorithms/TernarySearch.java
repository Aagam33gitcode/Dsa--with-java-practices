package SearchingAlgorithms;

public class TernarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(ternarySearch(arr,3));
    }
    public static int ternarySearch(int[] arr,int target){
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid1=start+(end-start)/3;
            int mid2=end-(end-start)/3;
            if (arr[mid1]<=target){
                if (target==arr[mid1]){
                    return mid1;
                }
                else {
                    start=mid1+1;
                }

            } else if (arr[mid2]>=target) {
                if (arr[mid2]==target){
                    return mid2;
                }
                else {
                    end=mid2-1;
                }


            }
            else {
                start=mid1+1;
                end=mid2-1;
            }

        }
    return -1;
    }

}
