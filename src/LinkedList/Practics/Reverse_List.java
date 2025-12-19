package LinkedList.Practics;

import java.util.LinkedList;

public class Reverse_List {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val,ListNode next) {
            this.val = val;
            this.next = next; }
    }
    public static ListNode reverseList1(ListNode head){
        ListNode dummy=head;
        ListNode prev=null;
        ListNode nextNode=null;
        while (dummy!=null){
            nextNode=dummy.next;
            dummy.next=prev;
            prev=dummy;
            dummy=nextNode;
        }return dummy;
    }
    public static ListNode reverseList2(ListNode head){
        if (head==null||head.next==null){
            return head;
        }
        ListNode last=reverseList2(head.next);
        head.next.next=head;
        head.next=null;
        return last;
    }


}
