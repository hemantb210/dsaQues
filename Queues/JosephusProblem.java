package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class JosephusProblem {

    public static void main(String[] args) {
       int [] arr={1,2,3,4,5,6,7};
       int k =3;
        System.out.println(winner(arr,k));
    }
    public static int winner(int [] arr,int k){
        Queue<Integer> queue = new LinkedList<>();
        for(int i =0;i<arr.length;i++){
            queue.offer(arr[i]);
        }
        while(queue.size()!=1){
            for(int i =0;i<k-1;i++){
                int p= queue.poll();
                queue.offer(p);
            }
            int l =queue.poll();

        }
        return queue.peek();
    }

}
