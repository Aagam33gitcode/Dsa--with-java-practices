package Stack;

import java.util.Stack;

public class spanStock {
    public static void main(String[] args) {
        int[] arr={3,1,6,4,18,7,5,11};
        calSpan(arr);

    }
    public static  void calSpan(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        for (int i = 0; i < ans.length; i++) {
//            int count=1;
            while (!st.isEmpty()&&arr[i]>=arr[st.peek()]){
                st.pop();
//                count++;
            }
            if(st.isEmpty()){
                ans[i]=i+1;

            }
            else {
                ans[i]=i- st.peek();
            }
            st.push(i);

        }
        for(int ee:ans){
            System.out.print(ee+" ");
        }
        System.out.println();
    }
}
