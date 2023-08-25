package Queues;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class ImplUsingLL {
    static class Node{
        Node next;
        int val;
        Node(int val){
            this.val=val;
            next=null;
        }
    }
    static Node head;


    static class QueueLL{
        Node front;
        Node rear;

        QueueLL(){
        this.front=this.rear=null;
        }
        void enqueue(int val){
            Node temp = new Node(val);
            if(rear==null){
                front=temp;
                rear=temp;
                return;
            }
            rear.next=temp;
            rear=temp;
        }

        void display(){
            Node current=front;
            System.out.println();
           while(current!=null){
               System.out.print(current.val+" ");
            current=current.next;
           }

        }
        void dequeue(){
            if(front==null){
                System.out.println("Empty");
                return;
            }
            Node next=front.next;
            front.next=null;
            front=next;

        }

    }

    public static void main(String[] args)
    {
//        ImplUsingLL obj = new ImplUsingLL();
//            head= new Node(0);
        QueueLL obj = new QueueLL();

        obj.enqueue(2);
        obj.enqueue(5);
//        obj.enqueue(6);
//        obj.enqueue(8);
//        obj.enqueue(9);
        obj.display();
        obj.dequeue();
        obj.dequeue();
        obj.display();
    }

}
