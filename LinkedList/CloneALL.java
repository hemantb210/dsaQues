package LinkedList;

import java.util.HashMap;

public class CloneALL {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        Node current;
        HashMap<Node,Node> map = new HashMap<>();
        for(current=head;current!=null;current=current.next){
            map.put(current,new Node(current.val));
        }
        for(current=head; current!=null;current=current.next){
            Node newCurrent = map.get(current);
            newCurrent.next=map.get(current.next);
            newCurrent.random=map.get(current.random);
        }
        Node head2= map.get(head);
        return head2;
    }

    public Node copyRandomList2(Node head) {
        if(head==null){return head;}

        Node next;
        Node current=head;
        //   while(current!=null){
        //     next=current.next;
        //     current.next=new Node(current.val);
        //     current.next.next=next;
        //     current=next;

        //   }
        for(current = head; current != null; current = current.next.next) {
            next = current.next;
            current.next = new Node(current.val);
            current.next.next= next;
        }
        for( current=head;current!=null;current=current.next.next){
            current.next.random= current.random!=null?current.random.next:null;
        }
        Node odd=head;
        Node even =head.next;
        Node head2=head.next;

        while(odd.next!=null&&odd.next.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        if(odd.next.next==null){
            odd.next=null;
        }
        return head2;

    }




}
