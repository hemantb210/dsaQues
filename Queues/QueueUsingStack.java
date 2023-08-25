package Queues;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> stack1= new Stack<>();
    Stack<Integer> stack2= new Stack<>();
void enqueue(int a){
    stack1.push(a);
}

int dequeue(){
    if(stack1.isEmpty()&&stack2.isEmpty()){
        System.out.println("error ");
        return 0;
    }
    while(!stack1.isEmpty()){
        stack2.push(stack1.pop());
    }
    int x= stack2.pop();
    while(!stack2.isEmpty()){
        stack1.push(stack2.pop());
    }
    return x;
}
void print(){

    while(!stack1.isEmpty()){
        stack2.push(stack1.pop());
    }
    while(!stack2.isEmpty()){
        System.out.print(stack2.peek() + " ") ;
        stack1.push(stack2.pop());
    }
}

    public static void main(String[] args) {
        QueueUsingStack obj = new QueueUsingStack();
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.enqueue(5);
        obj.print();
        System.out.println();
        System.out.println("DEQUE "+obj.dequeue());
        System.out.println("DEQUE "+obj.dequeue());
        obj.print();


    }


}
