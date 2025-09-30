package String;

import java.util.Stack;

public class findCeleb_277 {
    public static void main(String[] args) {

    }
    public static int celebrity(int[][] arr){
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.pop();


        }
        while ((st.size()>1)){
            int a=st.pop();
            int b=st.pop();
            if(arr[a][b]==1){
                st.push(b);
            }else {
                st.push(a);
            }
        }
    return -1;}
}
