package LinkedList;

public class reverse_Linkedlist_206 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next; }
    }
    class Solution {
        public ListNode reverseList(ListNode head) {
ListNode curr=head;
ListNode prev=null;
while(curr!=null){
    ListNode ahead=curr.next;
    curr.next=prev;
    prev=curr;
    curr=ahead;

}

return prev;        }}
}
