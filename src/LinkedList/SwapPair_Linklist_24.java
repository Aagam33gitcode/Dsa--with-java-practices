package LinkedList;
public class SwapPair_Linklist_24 {
    public class ListNode {
        int val;
       ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode swapPair(ListNode head){
        ListNode first=head;
        ListNode prev=null;
        while (first!=null&&first.next!=null){
            ListNode second=first.next;
            first.next=second.next;
            second.next=first;
            if (prev==null){
                head=second;
            }else {
                prev.next=second;
            }
            prev=first;
            first=first.next;
        }
        return head;



    }
}
