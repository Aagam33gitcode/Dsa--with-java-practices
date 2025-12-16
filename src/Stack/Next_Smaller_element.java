package Stack;

import java.util.Stack;

public class Next_Smaller_element {
    public static void main(String[] args) {
        int[] arr={3,8,5,2,25};
        nSE(arr);


    }
    public static void nSE(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            while (!st.isEmpty()&& arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if (st.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=arr[st.peek()];
            }
            st.push(i);
        }
      Display(ans);
    }

    public static void Display(int[] ans) {
    for(int arr:ans){
        System.out.print(arr+" ");
    }
    }
}
