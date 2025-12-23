package LinkedList;

public class SplitCircular_List {
    class ListNode{
       ListNode next;
        int val;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val,ListNode next) {
            this.val = val;
            this.next = next;
        }


}
public ListNode[] spitTwoCircularList(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        ListNode head1=head;
        while (fast.next!=head1&&fast.next.next!=head){
            slow=slow.next;
            fast=fast.next.next;
            }
        ListNode head2=slow.next;
        if (fast.next==head){
            fast.next=head2;
        }
        if (fast.next.next==head){
            slow.next=head;
        }
    return new ListNode[]{head1, head2};
}
}
