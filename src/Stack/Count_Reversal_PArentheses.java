package Stack;

import java.util.Stack;

public class Count_Reversal_PArentheses {
    public static void main(String[] args) {
        String s="}{}{{}";
        System.out.println(countR(s));
        System.out.println(countParenValid("}{{}}{"));
        System.out.println(countParenValid("}}}{{{"));
        System.out.println(countR("}}}{{{"));
        System.out.println(countParenValid("{}"));
        System.out.println(countParenValid("}{}{}{"));
        System.out.println(countR("}{}{}{"));

    }
    public static int countR(String s){
        if (s.length()%2!=0){
            return -1;
        }
        Stack<Character> st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (ch=='{'){
                st.push(ch);
            }
            else{
                if (st.isEmpty()||st.peek()=='}'){
                    st.push(ch);
                }else{
                    st.pop();
                }
            }
        }
        int ans=0;
        int open=0;
        int close=0;
        while (!st.isEmpty()){
            char top=st.pop();
            if (top == '{') {
                open++;
            }else{
                close++;
            }
        }
        return (int) (Math.ceil(open/2.0)+Math.ceil(close/2.0));
    }


    public static int countParenValid(String s){
        if (s.length()%2!=0)
    return -1;

    int open=0;
    int close=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (ch=='{'){
                open++;
            }else {
                if (open>0){
                    open--;
                }else {
                    close++;

                }
            }
        }

//        System.out.println(open);
//        System.out.println(close);


        return (int) (Math.ceil(open/2.0)+Math.ceil(close/2.0));
}}
