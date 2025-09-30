package Stack;

import Array.Kth_root;

public class Stack_Implementation {
    private int[] arr;
    private  int top=-1;
    public Stack_Implementation(){
        arr=new int[5];
    }
    public  Stack_Implementation(int n){
        arr=new int[n];

    }
    //isEmpty
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==arr.length-1;
    }
    //Push
    public void push(int item) throws Exception {
        if(isFull()){
            throw  new Exception("Stack Out of Bound...");
        }
        top++;
        arr[top]=item;
    }
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is Empty1..");
        }
        int rv=arr[top];
        top--;
        return rv;
    }
    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is Empty...");
        }
        int rv=arr[top];
        return rv;
    }
    public void display(){
        for (int i = 0; i < top+1; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
