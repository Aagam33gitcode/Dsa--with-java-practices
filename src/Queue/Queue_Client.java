package Queue;

public class Queue_Client {
    public static void main(String[] args) {
        Queue_Implmentation qq=new Queue_Implmentation();
        qq.enqueue(23);
        qq.enqueue(24);
        qq.enqueue(27);
        qq.enqueue(25);
        qq.display();
    }
}
