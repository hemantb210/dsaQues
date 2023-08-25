package LinkedList;

public class SplitCircular {

    public static void main(String[] args) {

    }
    Node head;
    class Node {
        int data;
        Node next;
        Node(int d)  { data = d;  next = null; }
    }
    void splitList(Node list)
    {
        Node head1;
        Node head2;

        if(head==null){
            return;
        }

        //Modify these head1 and head2 here, head is the starting point of our original linked list.
        Node slow=head;
        Node fast=head;
        while(fast.next!=head&fast.next.next!=head){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast.next.next==head){
            fast=fast.next;
        }
        fast.next=slow.next;
        head2=slow.next;
        slow.next=head;
        head1=head;

    }
}
//https://practice.geeksforgeeks.org/problems/split-a-circular-linked-list-into-two-halves/1s