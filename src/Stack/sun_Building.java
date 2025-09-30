package Stack;

import java.util.Stack;

public class sun_Building {

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int[] arr={
               3,1,6,4,18,7,5,11,19
        };
        sB(st,arr);

    }
    public static void  sB(Stack<Integer> st,int[] arr){
        int[] ans=new  int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty()&&arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i]=i+1;

            }else {
                ans[i]=i-st.peek();

            }
            st.push(i);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
