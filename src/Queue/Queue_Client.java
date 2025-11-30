package Queue;

public class Queue_Client {
    public static void main(String[] args) {
        Queue_Implmentation qq=new Queue_Implmentation();
        qq.enqueue(23);
        qq.enqueue(24);
        qq.enqueue(27);
        qq.enqueue(25);
        qq.enqueue(23);
        qq.enqueue(54);
        qq.enqueue(57);

        qq.display();
//        System.out.println();
//        qq.dequeue();
//        qq.dequeue();
//        qq.dequeue();
//        qq.dequeue();
//        qq.enqueue(3);
//        qq.enqueue(4);
//        qq.display();

    }
}
