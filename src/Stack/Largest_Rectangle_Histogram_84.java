package Stack;

import java.util.Stack;

public class Largest_Rectangle_Histogram_84 {
    public static void main(String[] args) {
        int[] arr={2,1,5,6,2,3};
        System.out.println(maxHistrogram(arr));
        System.out.println(maxHistrogram2(arr));


    }
    public static int maxHistrogram(int[] arr){
        int[] nSE=findNextSmallEle(arr);
        int[] pSE=findPrevSmallEle(arr);
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int weight = nSE[i] - pSE[i] - 1;
            max = Math.max(max, height * weight);

        }return max;

    }

    private static int[] findNextSmallEle(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty()&& arr[i] < arr[st.peek()]){
                ans[st.pop()]=i;
            }
            st.push(i);
        }while (!st.isEmpty()){
            ans[st.pop()]= arr.length;
        }
        return ans;
    }

    private static int[] findPrevSmallEle(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty()&& arr[i] <= arr[st.peek()]){
               st.pop();
            }
          if (st.isEmpty()){
              ans[i]=-1;
          }else{
              ans[i]=st.peek();
          }
        st.push(i);
        }
        return ans;
    }

    public static int maxHistrogram2(int[] arr){
    Stack<Integer> st=new Stack<>();
    int n=arr.length;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length; i++) {
            int currEle=0;
            if (i==n){
                currEle=0;
            }
            else{
                currEle=arr[i];
            }
            while(!st.isEmpty()&&arr[st.peek()]>currEle){
                int h=arr[st.pop()];
                int ps=(st.isEmpty())?-1:st.peek();
                int w=i-ps-1;
                max=Math.max(max,h*w);
            }
            st.push(i);
        }return max;

    }
}
