package LinkedList;

public class SortLisnkList012 {
    class ListNode {
        int val;
      ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count0=0;
        int count1=0;
        int count2=0;
        ListNode temp=head;
        while (temp!=null){
            if (temp.val==0){
                count0++;
            } else if (temp.val==1) {
                count1++;
            }else{
                count2++;
            }
            temp=temp.next;
        }
        temp=head;
        while (temp!=null){
            if (count0!=0){
                count0--;
                temp.val=0;
            } else if (count1!=0) {
                count1--;
                temp.val=1;
            }else {
                count2--;
                temp.val=2;
            }
temp=temp.next;
        }return head;
    }
    public ListNode sortLinkedlistEnd1(ListNode head){
ListNode head0=new ListNode(-1);
    ListNode tail0=head0;
    ListNode head1=new ListNode(-1);
    ListNode tail1=head1;
    ListNode head2=new ListNode(-1);
    ListNode tail2=head2;
    ListNode temp=head;
    while (temp!=null){
        ListNode nextNode=temp.next;
        temp.next=null;
        if (temp.val==0){
            tail0.next=temp;
            tail0=temp;

        } else if (temp.val==1) {
            tail1.next=temp;
            tail1=temp;
        }
        else{
            tail2.next=temp;
            tail2=temp;
        }
        temp=nextNode;
    }
   if (head1.next!=null){
       tail0.next=head1.next;
       tail1.next=head2.next;
   }
   else {
       tail0.next=head2.next;
   }
 return head0.next;
    }}
