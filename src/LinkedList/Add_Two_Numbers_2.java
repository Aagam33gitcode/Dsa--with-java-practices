package LinkedList;

import java.util.List;

public class Add_Two_Numbers_2 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode temp=null;
            ListNode head=null;
            int carry=0;
            while (l1!=null||l2!=null||carry!=0){
                int val1=(l1==null)?0:l1.val;
                int val2=(l2==null)?0:l2.val;
            int sum=val1+val2;
            ListNode newNode=new ListNode(sum%10);
             carry=sum/10;
            if (head==null){
                head=newNode;
            }
            else{

                temp.next=newNode;
                temp=temp.next;
            }
            if (l1!=null){
                l1=l1.next;
            }
            if (l2!=null){
               l2= l2.next;
            }
            }
            return head;
        }}
        public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
         ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        int carry=0;
         while (l1!=null||l2!=null||carry!=0){
             int val1=(l1==null)?0:l1.val;
             int val2=(l2==null)?0:l2.val;
             int sum=val1+val2+carry;
             ListNode newNode=new ListNode(sum%10);
             temp.next=newNode;
             temp=temp.next;
             carry=sum/10;
             if (l1!=null){
                 l1=l1.next;
             }
             if (l2 !=null){
                 l2=l2.next;
             }
        }

    return dummy.next;
    }
}
