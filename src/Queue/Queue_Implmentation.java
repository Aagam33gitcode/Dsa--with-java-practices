package Queue;

public class Queue_Implmentation {
    private int[] arr;
    private int size=0;
    private  int front=0;
    public Queue_Implmentation(){
        arr=new int[5];

    }
    public Queue_Implmentation(int n){
        arr=new int[n];
    }
    //ISEmpty
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==arr.length;
    }
    public void enqueue(int item){
        int idx=(front+size)%arr.length;
        arr[idx]=item;size++;
    }
    public int dequeue(){
        int rv=arr[front];
        size--;
        return rv;
        
    }
    public int getFront(){
        int rv=arr[front];
        return rv;
    }
    public void display(){
        for (int i=0;i<size;i++){
            int idx=(front+i)%arr.length;
            System.out.print(arr[idx]+" ");
        }
    }
}
