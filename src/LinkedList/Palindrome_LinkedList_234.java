package LinkedList;
public class Palindrome_LinkedList_234 {
    public static class ListNode {
        int val;
       ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val,ListNode next) {
            this.val = val;
            this.next = next; }
    }

    public static boolean palindrome(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        ListNode newNode=null;
        while (fast!=null&&fast.next!=null){
            newNode=new ListNode(slow.val);
            newNode.next=prev;
            prev=newNode;
            slow=slow.next;
            fast=fast.next.next;

        }
        if (fast!=null){
            slow=slow.next;
        }
        while (slow!=null&&prev!=null){
            if (slow.val!=prev.val){
                return false;
            }
            slow=slow.next;
            prev=prev.next;
        }
        return true;
    }
    public static boolean palindrome2(ListNode head){
        ListNode slow=head;
      ListNode fast=head;
 ListNode prev=null;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
     ListNode nexNode=null;
        while (slow!=null){
            nexNode=slow.next;
            slow.next=prev;
            prev=slow;
            slow=nexNode;
        }
        while (head!=null&&prev!=null){
            if (head.val!=prev.val){
                return false;
            }
            head=head.next;
            prev=prev.next;
        }
        return true;


    }
}
