package LinkedList;

public class SortLinklist {
    public class ListNode {
        int val;
    ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val,ListNode next) {
            this.val = val;
            this.next = next; }

    }
    public ListNode sortLinkedlist(ListNode headA){
        if (headA==null||headA.next==null){
            return headA;
        }
        ListNode temp=headA.next;
        ListNode sTail=headA;
        while (temp!=null){
            if (temp.val>=sTail.val){
                sTail=temp;
                temp=temp.next;
                continue;
            }
            sTail.next=temp.next;
ListNode prev=null;
ListNode t1=headA;
while (t1!=sTail.next){
    if (t1.val>= temp.val){
        break;
    }
    prev=t1;
    t1=t1.next;
}
if (prev==null){
    temp.next=headA;
    headA=temp;
}
    else{
        temp.next=prev.next;
        prev.next=temp;
                }

            temp=sTail.next;
        }

            return headA;
        }


}
