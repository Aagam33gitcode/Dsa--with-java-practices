package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackImpUsing_2Queue<T> {
    Queue<T> q1=new LinkedList<>();
    Queue<T> q2=new LinkedList<>();
    public void push(T val){
        while (!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        q1.offer(val);
        while (!q2.isEmpty()){
            q1.offer(q2.poll());
        }
    }
    public T pop() throws Exception {
        if (q1.isEmpty()){
            throw new Exception("Stack Is empty!..");
        }
        return q1.poll();
    }
    public T peek() throws Exception {
        if (q1.isEmpty()){
            throw new Exception("Stack Is empty!..");
        }
        return q1.peek();
    }
    public void display(){
        System.out.println(q1);
    }
    public static void main(String[] args) throws Exception {
        StackImpUsing_2Queue<Integer> st=new StackImpUsing_2Queue();
        StackImpUsing_2Queue<Character> st1=new StackImpUsing_2Queue();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
st.display();
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        st.display();
        st.push(2);
        st.push(23);
        st.display();

    st1.push('2');
        st1.push('3');
        st1.push('4');
        st1.push('5');
st1.display();
        System.out.println(st1.peek());
        System.out.println(st1.pop());
        System.out.println(st1.peek());
        st1.display();
        st1.push('2');
        st1.push('A');
        st1.display();
    }

}
