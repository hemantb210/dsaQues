package LinkedList;

public class AlternateFashion {
    Node head ;
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    public void insert(Node node){
        if(head==null){
            head=node;
            return;
        }
        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=node;
    }
    void print(Node x){
        Node current =x;
        while(current!=null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        AlternateFashion obj = new AlternateFashion();
        obj.insert(new Node(3));
        obj.insert(new Node(5));
        obj.insert(new Node(0));
        obj.insert(new Node(9));
        obj.insert(new Node(1));
        obj.print(obj.head);
        System.out.println();
        obj.alternateFashion();
    }

    private Node findMidpoint(){
        Node fast = head;
        Node slow=head;
        Node prev=null;
        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        return slow;
    }

    private void alternateFashion() {
        Node current1 = head;
  Node midPoint= findMidpoint();
        Node head1= reverseList(midPoint);
        Node current2=head1;
        Node res= new Node(0);
        Node temp=res;
        while(current1!=null&&current2!=null){

            if(current1!=null){
                temp.next=current1;
                temp=temp.next;
                current1=current1.next;
            }
            if(current2!=null){
                temp.next=current2;
                temp=temp.next;
                current2=current2.next;
            }
        }
        res=res.next;
        print(res);




    }
    private Node reverseList(Node midpoint){
        Node current = midpoint;
        Node prev=null;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        midpoint=prev;
        return midpoint;



    }

}
