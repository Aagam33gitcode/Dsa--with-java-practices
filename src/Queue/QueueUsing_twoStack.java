package Queue;

import java.util.Stack;

public class QueueUsing_twoStack {
    Stack<Integer> st1=new Stack<>();
    Stack<Integer> st2=new Stack<>();
    public void enqueue(int val){
        st1.push(val);
    }
    public int dequeue() throws Exception {
        if (st1.isEmpty()){
            throw new Exception("Queue is Empty");
        }
        while (!st1.isEmpty()){
            st2.push(st1.pop());
        }
        int val=st2.pop();
        while (!st2.isEmpty()){
            st1.push(st2.pop());
        }return val;
    }
    public int peek() throws Exception {
        if (st1.isEmpty()){
            throw new Exception("Queue is Empty");
        }
        while (!st1.isEmpty()){
            st2.push(st1.pop());
        }
        int val=st2.peek();
        while (!st2.isEmpty()){
            st1.push(st2.pop());
        }return val;
    }
    public void display() throws Exception {
        if (st1.isEmpty()){
            throw new Exception("quue empty");
        }
        while (!st1.isEmpty()){
            st2.push(st1.pop());
        }
        System.out.println(st2);
        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }

    }
    public static void main(String[] args) throws Exception {
    QueueUsing_twoStack queue=new QueueUsing_twoStack();
queue.enqueue(3);
queue.enqueue(4);
queue.enqueue(5);
queue.enqueue(6);
queue.dequeue();
queue.dequeue();
System.out.println(queue.peek());
queue.display();
queue.enqueue(8);
queue.enqueue(6);
queue.enqueue(10);
queue.enqueue(16);
queue.enqueue(62);
queue.dequeue();
System.out.println(queue.peek());
queue.display();



    }
}
