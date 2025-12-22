package LinkedList;

public class Find_Intersection_LinkedList {
    public class ListNode {
        int val;
     ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next; }
    }
    public ListNode findIntersection(ListNode headA,ListNode headB){
        ListNode tempA=headA;
        ListNode tempB=headB;
        ListNode newHead=null;
        ListNode temp=null;
        while (tempA!=null&&tempB!=null){
            if (tempA.val== tempB.val){
                if (newHead==null){
                    newHead=new ListNode(tempA.val);
                    temp=newHead;
                }else{
                    //with dupilcate intersection
                    temp.next=new ListNode(tempA.val);
                    temp=temp.next;
                }
                tempA= tempA.next;
                tempB=tempB.next;
            }else if (tempA.val>tempB.val){
                tempB=tempB.next;
            }else {
                tempA=tempA.next;
            }
        }
        return newHead;
    }

}
