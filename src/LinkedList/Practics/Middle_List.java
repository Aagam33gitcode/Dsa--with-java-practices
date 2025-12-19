package LinkedList.Practics;

public class Middle_List {

  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public static ListNode mideleNode(ListNode head){
      ListNode slow=head;
      ListNode fast=head;
      while (fast!=null&&fast.next!=null){
          slow=head.next;
          fast=head.next.next;
      }
      return slow;
      }
  }
}
