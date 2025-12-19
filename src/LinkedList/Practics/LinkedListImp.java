package LinkedList.Practics;

import javax.management.StandardEmitterMBean;

public class LinkedListImp {
    class Node<T>{
        T data;
        Node next;
        Node(){
            this.next=null;
        }
        Node(T data) {
            this.next = null;
            this.data = data;
        }

    }
    Node<Integer> head;
int size;
    LinkedListImp(){
        this.head=null;
    this.size=0;
    }
    public void addFirst(int data){
        Node<Integer> newNode=new Node<>(data);
        if (head == null) {
            head=newNode;
            size++;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;
    }
    public void addIndex(int pos,int data){
        if (pos <= 0 || pos > size + 1) {
            System.out.println("position doesn't exist: " + pos);
            return;
        }
        Node<Integer> newNode=new Node<>(data);
        if(pos==1){
            addFirst(data);
            return;
        }

        Node<Integer> temp=head;
        int count =1;

        while (count<pos-1&&temp!=null){
          temp=  temp.next;
          count++;
        }
        if (temp==null){
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }
    public void addLast(int data){
        Node<Integer> newNode=new Node<>(data);
        if (head==null){
            head=newNode;
            size++;
            return;
        }
        Node<Integer> temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        size++;

    }
    public int deleteFirst() throws Exception {
        if (head==null){
            throw new Exception("isEmpty");
        }
        Node<Integer> temp=head;
        head=head.next;
        int rv=temp.data;
        temp.next=null;
        size--;
return rv;
    }
    public int deleteLast() throws Exception {
        if(head == null) throw new Exception("List is empty");
        if(head.next == null) { // single node
            int rv = head.data;
            head = null;
            size--;
            return rv;
        }
        Node<Integer> temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        int rv = (int) temp.next.data;
        temp.next = null;
        size--;
        return rv;
    }
    public int deleteIndex(int pos) throws Exception {
        if (pos>size||pos<1){
            throw new Exception("Invalid Input"+ pos);
        }
        int rv=0;
        if (pos==1){
return deleteFirst();
        } else if (pos==size) {
         return   deleteLast();
        }
        else {
            Node<Integer> prev=null;
            Node<Integer> temp=head;
            int count =1;
            while (count<pos&&temp!=null){
                count++;
                prev=temp;
                temp=temp.next;
            }
            prev.next=temp.next;
            rv= (int) temp.data;
            temp.next=null;
            size--;

        }
        return rv;
    }
    public void updateValue(int pos, int updateValue){
        if (head==null){
            System.out.println("isEmpty");
            return;
        }Node<Integer>temp=head;
        int count =1;
        while (count<pos&&temp.next!=null){
            count++;
            temp=temp.next;
        }
        if (temp!=null&&count==pos) {
            temp.data = updateValue;
        }
    }


    public void display(){
        Node<Integer>temp=head;
        while (temp!=null){
            System.out.print(temp.data);
            if (temp.next!=null){
                System.out.print("-> ");
            }
            temp=temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) throws Exception {
        LinkedListImp list=new LinkedListImp();
//        list.addFirst(24);
//        list.addFirst(23);
//        list.addFirst(25);
//        list.addFirst(26);
//        list.addFirst(27);

        list.addLast(27);
        list.addLast(26);
        list.addLast(25);
        list.addFirst(26);
        list.addFirst(27);
        list.addLast( 24);
        list.addLast(23);
        list.display();
        list.addIndex(1,78);
        list.addIndex(list.size, 56);
        list.addIndex(2,45);
        list.display();
        System.out.println("List Size: "+list.size);
        System.out.println("Deleted First Node: "+list.deleteFirst()+"| Size "+list.size);
        System.out.println("Deleted First Node: "+list.deleteFirst()+"| Size "+list.size);
        System.out.println("List Size: "+list.size);
        list.display();
        System.out.println("Deleted Node At Last: "+list.deleteLast()+" |Size "+list.size);
        list.display();
        System.out.println("delete at 2 index: "+list.deleteIndex(2)+" |Size "+list.size);
        list.display();
        System.out.println("delete at 1 index: "+list.deleteIndex(1)+" |Size "+list.size);
        list.display();
        System.out.println("delete at 5 index: "+list.deleteIndex(5)+" |Size "+list.size);
        list.display();
        list.updateValue(2,45);
        list.display();
    }

}
