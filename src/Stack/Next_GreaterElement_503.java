package Stack;

import java.util.Stack;

public class Next_GreaterElement_503 {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        NGEII(arr);
        System.out.println();
        NGEII2(arr);

    }
    public static int[] NGEII(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[n];
        for (int i = 2*n-1; i >=0 ; i--) {
            while (!st.isEmpty()&&arr[st.peek()]<=arr[i%n]){
                st.pop();
            }
            if (i<n){
                if (st.isEmpty()){
                    ans[i]=-1;
                }else{
                    ans[i]=arr[st.peek()];
                }
            }
            st.push(i%n);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        return ans;
    }
    public static int[] NGEII2(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[n];
        for (int i = 0; i<2*n ; i++) {
            while (!st.isEmpty()&&arr[st.peek()]<arr[i%n]){
                ans[st.pop()]=arr[i%n];
            }
            if(i<n){
            st.push(i);
        }}
        while (!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        return ans;
    }
}
