package LinkedList;

import java.util.List;

public class MergeSort_LinkedList_148 {

//    @Override
//    public void run() {
//        MergeSort_LinkedList_148 obj = new MergeSort_LinkedList_148();
//        ListNode head = new ListNode(3);
//        head.next = new ListNode(5);
//        head.next.next = new ListNode(6);
//        head.next.next.next = new ListNode(2);
//        head.next.next.next.next = new ListNode(1);
//
//        Display(head);
//        head = obj.mergeSort(head);
//        Display(head);
//    }

   static class ListNode {
        ListNode next;
        int val;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }}

    public static void main(String[] args){

        ListNode head = new ListNode(8);
        head.next = new ListNode(3);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(6);

        Display(head);
        head = mergeSort(head);
        Display(head);
}
private static ListNode mergeSort(ListNode head){
       if (head==null||head.next==null){
           return head;
       }
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while (fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
//    ListNode headA=mergeSort(head);
//    ListNode headB=mergeSort(slow);
//    ListNode ans=merge2(headA,headB);
return merge2(mergeSort(head),mergeSort(slow));
    }

    private static ListNode merge2(ListNode headA, ListNode headB) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;

        while (headA!=null&&headB!=null){
            if (headA.val>=headB.val) {
                temp.next=headB;
                headB=headB.next;
            }else {
                temp.next=headA;
                headA=headA.next;
            }
            temp=temp.next;
        }
        if (headB!=null){
            temp.next=headB;

        }else{
            temp.next=headA;
        }
        return dummy.next;

    }

    private  ListNode merge(ListNode headA, ListNode headB) {
        ListNode ansH=new ListNode(-1);
        ListNode ansT=ansH;

        while (headA!=null&&headB!=null){
            if (headA.val>=headB.val) {
                ansT.next=new ListNode(headB.val);
                headB=headB.next;
            }else {
                ansT.next=new ListNode(headA.val);
                headA=headA.next;
            }
            ansT=ansT.next;
        }
        if (headA==null&&headB!=null){
            ansT.next=headB;

        }else{
            ansT.next=headA;
        }
        return ansH.next;

    }


    private static   void Display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
