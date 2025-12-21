package LinkedList.Practics;

public class LinkList_Cycle_141 {
    class ListNode {
      int val;
           ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public class Solution {
        public boolean hasCycle(ListNode head) {
ListNode slow=head;
ListNode fast=head;
while (fast!=null&&fast!=null){
    fast=fast.next.next;
    slow=slow.next;
    if (fast==slow){
        return true;
    }
}
return false;
        }
    }
}
