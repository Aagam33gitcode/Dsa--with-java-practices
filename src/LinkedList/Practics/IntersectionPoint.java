package LinkedList.Practics;

import LinkedList.GetIntersection_Node_160;

public class IntersectionPoint {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val,ListNode next) {
            this.val = val;
            this.next = next; }
    }
    public ListNode findIntersaction(ListNode A,ListNode B){
     ListNode headA=A;
     ListNode headB=B;
        while (headA!=headB){
            if (headA==null){
                headA=B;
            }else {
                headA=headA.next;
            }
            if (headB==null){
                headB=A;
            }else{
                headB=headB.next;
            }
        }
        return headA;
    }

}
