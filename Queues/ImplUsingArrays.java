package Queues;

public class ImplUsingArrays {

    static class Queue{
        int front;
        int rear;
        int [] arr;
        int capacity;
        Queue(int capacity){
            front =-1;
            rear=-1;
            arr = new int[capacity];
            this.capacity=capacity;
        }

        int front(){
            return arr[front];
        }


        void enqueue(int a){
            if(size()==capacity){
             throw new RuntimeException("overflow");
            }
            if(front==-1){
                front++;
            }
            rear++;
            arr[rear]=a;

        }
        void dequeue(){
            if(front==-1||front>rear){
                throw new RuntimeException("Underflow");
            }
            System.out.println("Dequeued element is " + arr[front]);
            for(int i=front;i<rear+1;i++){
                arr[i]=arr[i+1];
            }
            if(rear<capacity){
                arr[rear]=0;
            }
            rear--;

        }
        int size(){
            return rear-front+1;
        }
        void print(){
            for(int i =0; i<=rear;i++){
                System.out.print(arr[i] + " ");
            }
        }

    }
    public static void main(String[] args) {
Queue queue= new Queue(5);
queue.enqueue(2);
queue.enqueue(3);
queue.enqueue(5);
queue.dequeue();
queue.print();
System.out.println("Size:" +queue.size());




    }
}
