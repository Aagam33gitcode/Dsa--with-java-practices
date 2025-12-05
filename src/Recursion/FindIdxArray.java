package Recursion;

public class FindIdxArray {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,32,1,2,3,45,45};
        System.out.println(findIdx(arr,0,45));
        System.out.println(findIdxLast(arr,0,45));
    }
    public static int findIdx(int[] arr, int idx,int item){
        if (idx>= arr.length){
            return -1;
        }
        if (arr[idx]==item){
            System.out.print("Index: ");
            return idx;
        }
        return findIdx(arr,idx+1,item);
    }
    public static int findIdxLast(int[] arr, int idx,int item){
        if (idx>= arr.length){
            return -1;
        }
        int ans=findIdxLast(arr,idx+1,item);
        if (ans!=-1){
              return ans
        ;}
        if (arr[idx]==item){
            return idx;

        }return -1;

    }
}
