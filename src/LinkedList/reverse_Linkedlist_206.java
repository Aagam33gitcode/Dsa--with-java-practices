package LinkedList;

import java.util.List;
import java.util.Stack;

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
        public ListNode reverseList2(ListNode head) {
            if (head == null || head.next == null) return head;
            Stack<ListNode> st=new Stack<>();
            ListNode temp=head;
            while (temp!=null){
                st.add(temp);
                temp=temp.next;
            }
            head=st.pop();
            temp=head;
            while (!st.isEmpty()){
temp.next=st.pop();
temp=temp.next;
            }
            temp.next=null;
            return head;
       }
}
