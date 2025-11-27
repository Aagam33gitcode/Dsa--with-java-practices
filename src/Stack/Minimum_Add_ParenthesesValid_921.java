package Stack;

import java.util.Stack;

public class Minimum_Add_ParenthesesValid_921 {
    public static void main(String[] args) {
        System.out.println(addParentheses("()))(("));
        System.out.println(addParenthesesEn("()))(("));
    }

    public static int addParentheses(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.isEmpty() || st.peek() == ')') {
                    st.push(ch);
                } else {
                    st.pop();

                }
            }

        }
        return st.size();}
    public static int addParenthesesEn(String s) {
       int open=0;
       int close=0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                open++;
            } else {
                if (open<=0) {
                    close++;
                } else {
                    open--;

                }
            }

        }
        return open+close;
    }
}
