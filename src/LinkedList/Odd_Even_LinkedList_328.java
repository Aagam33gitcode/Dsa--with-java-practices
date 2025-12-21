package LinkedList;

import LinkedList.Practics.LinkList_Cycle_141;

import java.util.List;

public class Odd_Even_LinkedList_328 {
    class ListNode {
        int val;
    ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }}
        public ListNode oddEvenList(ListNode head) {

if (head==null||head.next==null){
    return head;
}
ListNode odd=head;
ListNode even=head.next;
            ListNode evenH=head.next;
while(odd.next!=null&&even.next!=null){
    odd.next=even.next;
    odd=odd.next;
    even.next=odd.next;
    even=even.next;
}
odd.next=evenH;
return head;
        }
}
