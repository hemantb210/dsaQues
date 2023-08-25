package LinkedList;

import java.util.HashSet;

public class RemoveDuplicatesUnsorted {
    class Node
    {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {

    }
    public Node removeDuplicates(Node head)
    {
        // Your code here
        HashSet<Integer> set = new HashSet<>();
        Node current =head;
        Node prev=null;
        while(current!=null){
            if(set.contains(current.data)){
                prev.next=current.next;

            }
            else{
                set.add(current.data);
                prev=current;

            }

            current=current.next;
        }
        return head;

    }

}
