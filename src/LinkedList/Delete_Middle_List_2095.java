package LinkedList;


import com.sun.source.tree.BreakTree;

public class Delete_Middle_List_2095 {
     public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val,  ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        public ListNode deleteMiddle(ListNode head) {
            if (head == null || head.next == null) {
                return null;
            }

ListNode fast=head;
            ListNode slow=head;
            ListNode prev=null;
            while(fast!=null&&fast.next!=null){
                prev=slow.next;
                fast=fast.next.next;
                slow=slow.next;
            }
            prev.next=slow.next;
            slow.next=null;
            return head;
        }
    }

}
