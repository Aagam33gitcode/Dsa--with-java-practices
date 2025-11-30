package Array;

import java.util.Stack;

public class Maximum_Rectangle_85 {
    public static void main(String[] args) {
        char[][] arr={    {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}};
        System.out.println(maxRec(arr));

    }
    public static int maxRec(char[][] arr){
        int[] height=new int[arr[0].length];
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]-'0'==0){
                    height[j]=0;
                }
                else{
                    height[j]+=arr[i][j]-'0';
                }
            }

            int his=maxHistrogram2(height);
//            System.out.println(his);
            if (max<his) {
                max=his;

            }
        }return max;
    }
    public static int maxHistrogram2(int[] arr){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <= n; i++) {
            int currEle;
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
            if(i<n) {
                st.push(i);
            }
        }
        return (max==Integer.MIN_VALUE)?0:max;
    }
}
