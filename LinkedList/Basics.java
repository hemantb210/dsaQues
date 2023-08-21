package LinkedList;

 class Node<T>{
 T data;
 Node<T> next;
  public Node(T data){
     this.data = data;
     this.next=null;
     }
}
public class Basics{
      Node start;
    public static void main(String[] args) throws Exception {
        Node<Integer> node1 = new Node<>(23);
        Basics basics = new Basics();
        basics.insertAtBeginning(node1);
        basics.insertAtBeginning(new Node<Integer>(43));
        basics.insertAtBeginning(new Node<>("String"));
        basics.insertAtBeginning(new Node<>("String4"));
        basics.insertAtBeginning(new Node<>("String9"));
        basics.insertAtEnd(new Node ("String2"));
        basics.insertAtMid(new Node("end"),2);
        basics.print();
//        basics.deleteFromBeg();
//        basics.print();
//        basics.deleteFromEnd();
//        basics.print();
//        basics.deleteFromMid(3);
//        basics.print();
//        basics.update(2,"Hello");
//        basics.print();
        basics.reverse();
        basics.print();
        System.out.println( basics.midpoint());
//        basics.print();

    }
    //insert a beginning, mid,end

    //print the linkedlist
    //delete beginning,mid,end
    public int count(){
        if (start == null) {
            return 0;
        }
        Node current = start;
        int count=0;
        while(current!=null){
            count++;
         current= current.next;
        }
        return count;
    }

    public void insertAtBeginning(Node node){
        if(start==null){
            start=node;
            return;
        }
        else {
            node.next=start;
            start=node;
        }


    }
    public void insertAtEnd(Node node){
        if (start == null) {
            insertAtBeginning(node);
        }
        else{
            Node current = start;
            while(current.next!=null){
                current= current.next;
            }
            current.next= node;
        }

    }
    public void insertAtMid(Node node,int k) throws Exception {


        if(start==null){
            start=node;
        }
        if(k>count()){
            throw new Exception("Cannot insert here");
        }
        if(k >= 1) {
            int i = 1;
            Node temp = start;
            while(i < k) {
                temp = temp.next;
                i++;
            }
            node.next = temp.next;
            temp.next = node;
        }

    }
    public void deleteFromBeg(){
        if(start==null){
            System.out.println("The list is empty");
        }
        else{
            start = start.next;

        }

    }
    public void deleteFromEnd(){
        if(start==null){
            System.out.println("The list is empty");
        }
        else{
            Node current =start;
            while(current.next.next!=null){
                current= current.next;
            }
            current.next =null;

        }

    }
    void deleteFromMid(int index) throws Exception {
        if(start==null){
           throw new Exception("The list is empty");
        }
        if(index>count()){
            throw new Exception("Index>Count");
        }
        else{
            int i =1;
            Node current= start;
            while(i<index-1){
                current= current.next;
                i++;
            }
            current.next = current.next.next;
        }

    }
    void update (int index, String data){
        int i=0;
        Node current = start;
        while(i<index-1){
            current= current.next;
            i++;
        }
        current.data = data;
    }
    void print(){
        Node current = start;
        while(current!=null){
            System.out.print(current.data+",");
            current=current.next;
        }
        System.out.println();

    }
    public  void reverse(){
        if(start==null){
            System.out.println("Empty");
            return;
        }
        if(start.next==null){
            System.out.println("There is only one element");
            return;
        }

        Node current = start;
        Node prev = null;
        while(current!=null){
            Node next = current.next;
            current.next = prev;
            prev= current;
            current=next;

        }
        start=prev;


    }
        String midpoint(){
        Node slow = start;
        Node fast= start;
        while(fast.next!=null && fast!=null){
            slow= slow.next;
            fast = fast.next.next;
        }
        return (String)slow.data;

}


}
