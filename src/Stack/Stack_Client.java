package Stack;

public class Stack_Client {
    public static void main(String[] args) throws Exception {
        Stack_Implementation st=new Stack_Implementation();
//        System.out.println(st.peek());
//        st.peek();
        st.push(10);
        st.push(50);
        st.push(40);
        st.push(30);
        st.push(20);
        st.push(88);
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        st.pop();
        st.display();
    }
}
