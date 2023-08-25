package Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxElement {
    Queue<Integer> queue= new LinkedList<>();
    Deque<Integer> deque = new ArrayDeque<>();

    void enqueue(int element){

        queue.offer(element);

        while(!deque.isEmpty()&& deque.peekLast()<element){
            deque.pollLast();
        }
         deque.offer(element);
    }
    int dequeue(){
        if(queue.peek()==deque.peekFirst()){
            deque.pollFirst();
        }
        return queue.poll();
    }
    int maxElement(){
        if(deque.isEmpty()){
            System.out.println("No element");

            return 0;
        }
        return deque.peekFirst();

    }

    public static void main(String[] args) {
        MaxElement maxElement= new MaxElement();
        maxElement.enqueue(9);
        maxElement.enqueue(6);
        maxElement.enqueue(4);
        maxElement.enqueue(5);
        maxElement.enqueue(8);
        System.out.println(maxElement.maxElement());
        System.out.println(maxElement.dequeue());
        System.out.println(maxElement.maxElement());

    }



}
