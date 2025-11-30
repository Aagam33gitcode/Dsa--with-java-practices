package Stack;

import java.util.Stack;

public class Next_Greater_Element {
    public static void main(String[] args) {
        int[] arr={2,1,7,11,12,3,6,9};
        int[] ans=new int[arr.length];
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        nGE(arr,ans);
        for(int ele:ans){
            System.out.print(ele+" ");
        }

    }
    public static int[] nGE(int[] arr,int[] ans){
    Stack<Integer> st=new Stack<>();

        for (int i = arr.length-1; i >=0 ; i--) {
            while (!st.isEmpty()&& arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if (st.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=arr[st.peek()];
            }
            st.push(i);
        }
        return ans;
}}
