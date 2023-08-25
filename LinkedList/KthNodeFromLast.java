package LinkedList;
class ListNode<T>{
    T data;
    ListNode next;
    public ListNode(T data){
        this.data= data;
        this.next=null;

    }

}
public class KthNodeFromLast {
    private ListNode start;  void insert(ListNode node){
        if(start==null){
            start = node;
            start.next=null;}
        else{
            ListNode current= start;
            while(current.next!=null){
                current = current.next;
            }
            current.next= node;
        }
    }

    void print(){
        ListNode current = start;
        while(current!=null){
            System.out.print(current.data);
            current= current.next;
        }
        System.out.println();


    }

    void midpoint(){
        ListNode slow=start;
        ListNode fast = start;
//        NodeA prev=null;

        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
//            prev=slow;
            slow = slow.next;
        }
        System.out.println(slow.data);


    }

    void findElement(int k){
        int n= count();
        System.out.println("n "+n);
        int i =1;
        ListNode current = start;
        //i should be less than where you want to reach
        while(i<n-k+1){
            current = current.next;
            i++;
        }
        System.out.println(current.data);

    }

    void findElementOptimised(int k){

        //When you move the fast pointer to the kth node, the remaining nodes to traverse is (size_of_linked_list - k). After that, when you start moving the slow pointer and fast pointer by 1 node each, it is guaranteed that the slow pointer will cover a distance of (size_of_linked_list - k) nodes.
        ListNode slow = start;
        ListNode fast = start;
         for(int i =1;i<=k;i++){
             fast = fast.next;
         }
         while(fast!=null){
             fast=fast.next;
             slow=slow.next;
         }
         System.out.println(slow.data);
    }
    int count(){
        int i =1;
        ListNode current= start;
        while(current.next!=null){

            current= current.next;
            i++;
        }
       return i;
    }

    public static void main(String[] args) {
        KthNodeFromLast k = new KthNodeFromLast();
        k.insert(new ListNode(2));
        k.insert( new ListNode(3));
        k.insert(new ListNode(5));
        k.insert(new ListNode(6));
//        k.insert(new NodeA(8));
        k.print();
//        k.findElementOptimised(2);
        k.midpoint();
    }
}
