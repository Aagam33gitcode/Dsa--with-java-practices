package Stack;

import java.util.Stack;

public class Next_Gerater_ELE {
    public static void main(String[] args) {
//        Stack<Integer> st=new Stack<>();
//        int[] arr={55,11,9,7,13,3,66,60};
        int[] arr = {1, 2, 1};
        int[] arr1 = {3, 8, 5, 2, 25};
        int[] arr2 = {1, 4, 2, 6, 5, 7};
        nGEII(arr1);

    }

    public static int[] nGE(Stack<Integer> st, int[] arr) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                ans[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            ans[st.pop()] = -1;
        }
//        for (int j = 0; j < ans.length; j++) {
//            System.out.print(ans[j]+" ");
//        }
        return ans;
    }

    public static int[] nGEII(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] newArr=new int[2*arr.length];
        int k= arr.length-1;
        for (int i = 0; i < arr.length ; i++) {

        }
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (!st.empty() && arr[st.peek()] < arr[i]) {
                ans[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while (!st.isEmpty() && st.size() != 1) {
            ans[st.pop() - 1] = -1;
        }
        if (arr[st.peek()]>arr[arr.length-1]) {
            ans[arr.length - 1] = arr[st.pop()];
        }else{
            ans[arr.length-1]=-1;
        }


        return ans;

    }}

