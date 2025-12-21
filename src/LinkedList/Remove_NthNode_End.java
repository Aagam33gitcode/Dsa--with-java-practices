package LinkedList;

import LinkedList.Practics.LinkList_Cycle_141;

import java.util.List;

public class Remove_NthNode_End {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first=head;
        ListNode second=head;
        while (n>0&&first!=null){
            n--;
            first=first.next;
        }
        if (n!=0){
            return head;
        }
        if (first==null){
            ListNode temp=head;
            head=head.next;
            temp.next=null;
            return head;
        }
        ListNode prev=null;
        while (first!=null){
            first=first.next;
            prev=second;
            second=second.next;
        }
        prev.next=second.next;
        second.next=null;
        return head;
    }
}
