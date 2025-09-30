package Stack;

import java.util.Stack;

public class Next_Gerater_ELE {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
//        int[] arr={55,11,9,7,13,3,66,60};
        int[] arr={1,2,1};
        nGE(st,arr);

    }
    public static int[] nGE(Stack<Integer> st,int[] arr){
        int[] ans=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {


            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                ans[st.pop()] = arr[i];


            }

            st.push(i);

        }
    while (!st.isEmpty()){
        ans[st.pop()]=-1;
    }
//        for (int j = 0; j < ans.length; j++) {
//            System.out.print(ans[j]+" ");
//        }

        return ans;
    }

}
