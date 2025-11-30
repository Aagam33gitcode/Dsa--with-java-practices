package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class Online_Stock_Span_901 {
    public int next(int price){
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(price);
        while (!st.isEmpty()&&list.get(st.peek())<=price){
            st.pop();
        }
        int prevGIdx=Integer.MIN_VALUE;
        int ans=0;
        if (st.empty()){
            prevGIdx=-1;
        }else {
         prevGIdx= st.peek();
        }
        st.push(list.size()-1);
        ans=(list.size()-1)-prevGIdx;
        return ans;
    }

}
