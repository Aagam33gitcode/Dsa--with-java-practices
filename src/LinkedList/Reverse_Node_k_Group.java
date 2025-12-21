package LinkedList;

import java.util.List;

public class Reverse_Node_k_Group {
    public class ListNode {
      int val;
           ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
          ListNode temp=head;
          int count=0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }

ListNode prevH=null;
ListNode currH=head;
ListNode ans=null;
int group=count/k;
            for (int i = 0; i <group ; i++) {
                ListNode prev=null;
                ListNode dummy=currH;
                ListNode nn=null;
                for (int j = 0; j < k; j++) {
                    nn=dummy.next;
                    dummy.next=prev;
                    prev=dummy;
                    dummy=nn;
                }
                if (prevH==null){
                  ans=prev;
                }else{
                    prevH.next=prev;
                }
                prevH=currH;
                currH=dummy;

            }
            prevH.next=currH;
            return ans;

        }
}}
