package LinkedList;

public class DetectCycle {

    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){return false;}
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(slow==fast){return true;}
        else return false;
    }

    public boolean hasCycle2(ListNode head) {
        if(head==null||head.next==null){return false;}
          ListNode temp=new ListNode(2);
        while(head!=null){
            //    if(head.next==null){return false;}
            if(head.next==temp){
                return true;
            }
            ListNode next = head.next;
            head.next= temp;
            head= next;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
