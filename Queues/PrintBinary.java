package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class PrintBinary {

    //space 2n+1
    //tc n


    public static void main(String[] args) {
        print(4);
    }
    public static void print(int n){
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");
        for (int i = 0; i < n; i++) {
            String a =queue.poll();
            System.out.print(a+ " ");
             queue.offer(a+"0");
             queue.offer(a+"1");
        }
//        System.out.println("Extra");
//        while (!queue.isEmpty()) {
//            System.out.print(queue.poll() + " ");
//        }




    }

}
