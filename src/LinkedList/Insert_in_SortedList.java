package LinkedList;

import LinkedList.Practics.IntersectionPoint;

public class Insert_in_SortedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next; }
    }
    public  ListNode insertINList(ListNode headA, int val){
        ListNode prev=null;
        ListNode temp=headA;
        ListNode newNode=new ListNode(val);
        while (temp!=null){
          if (temp.val>=val){
              break;
          }
          prev=temp;
          temp=temp.next;
        }
        if (prev==null){
            newNode.next=headA;
            headA=newNode;
        }else{
            newNode.next=prev.next;
            prev.next=newNode;
        }
        return headA;}
}
