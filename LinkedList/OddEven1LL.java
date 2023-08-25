package LinkedList;

public class OddEven1LL {

    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return null;
        }

        ListNode temp=head;
        ListNode head2=head.next;
        ListNode temp1=head2;

        while(temp.next!=null&&temp.next.next!=null){
            temp.next=temp1.next;
            temp=temp.next;
            temp1.next=temp.next;
            temp1=temp1.next;
        }
        temp.next=head2;

        return head;




    }
}
