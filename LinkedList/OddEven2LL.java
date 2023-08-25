package LinkedList;

public class OddEven2LL {
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
    void print(Node head){
        Node current =head;
        while(current!=null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    void alternateFashion(){
        Node res1=new Node(0);
        Node res2=new Node(0);
        Node temp1=res1;
        Node temp2=res2;
        Node current= head;
        int i=1;

        while(current!=null){
            if(i%2!=0){
                Node newNode = new Node(current.data);
                temp1.next=newNode;
                temp1=newNode;
            }
            else{
                Node newNode = new Node(current.data);
                temp2.next=newNode;
                temp2=newNode;
            }

            current=current.next;
            i++;


        }
        System.out.println();
        print(res1.next);
        System.out.println();
        print(res2.next);

    }




    public static void main(String[] args) {
        OddEven2LL obj = new OddEven2LL();
        obj.insert(new Node(3));
        obj.insert(new Node(5));
        obj.insert(new Node(0));
        obj.insert(new Node(9));
        obj.insert(new Node(1));
        obj.print(obj.head);
        obj.alternateFashion();

    }


}
