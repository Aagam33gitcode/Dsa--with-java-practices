package Array;

public class sum_array {
    public static void main(String[] args) {
        int[] arr={1,2,1,2,3,4,5,6,7,6};
        System.out.println(first_occurrence(arr,0,8));

    }
    public static int first_occurrence(int[] arr, int idx,int x){
       if(idx==arr.length){
           return -1;
       }
        if(arr[idx]==x){
            return idx;

        }else {
            return first_occurrence(arr,idx+1,x);
        }
    }
}
