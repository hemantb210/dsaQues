package LinkedList;

public class RemoveDuplicatesSorted {


    public static void main(String[] args) {

    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode current=head;
        while(current!=null){
            if(current.next!=null&&current.data==current.next.data){
                current.next=current.next.next;
            }
            else {
                current=current.next;
            }
        }
        return head;


    }

}
