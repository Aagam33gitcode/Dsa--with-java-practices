package Stack;

import java.util.Stack;

public class Longest_Valid_Parentheses_32 {
    public static void main(String[] args) {
        String s=")()()))()(())()(()(";
        System.out.println(validP(s));
        System.out.println(validP2(s));
    }
    public static int validP(String s){
        Stack<Integer> st=new Stack<>();
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (ch=='('){
                st.push(i);
            }else{
                if (st.isEmpty()|| s.charAt(st.peek())==')'){
                    st.push(i);
                }else{
                    st.pop();
                }
            }
        }
//        System.out.println(st);
//        int max = 0;
        int a = s.length();
        int b = 0;
        while (!st.isEmpty()) {
            b = st.pop();
            max = Math.max(max, a - b - 1);
            a = b;
        }

        max = Math.max(max, a);


        return max;
    }
    public static int validP2(String s){
        Stack<Integer> st=new Stack<>();
        int max=0;
        st.push(-1);
        for (int i = 0; i <s.length() ; i++) {

            char ch=s.charAt(i);
            if (ch=='('){
            st.push(i);
        }else {
                st.pop();
                if (st.isEmpty()){
                    st.push(i);
                }else {
                    max=Math.max(max,i-st.peek());
                }
            }
        }return max;
    }
}
