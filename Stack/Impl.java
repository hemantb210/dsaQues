package Stack;

public class Impl {
    static class Stack{
        private int [] arr;
        private int top;
        private int capacity;

        public Stack(int size){
            arr= new int[size];
            top=-1;
            capacity= size;
        }
        public void push(int a ){
            if(top==capacity-1){
                System.out.println("Overflow");
                return ;
            }
            top++;
            arr[top]=a;
        }
        public int pop(){
            if(top==-1){
                System.out.println("underflow");
                return -1;
            }
            return arr[top--];
        }
        public int peek(){
            if(top==-1){
                System.out.println("Underflow");
                return -1;
            }
            return arr[top];
        }
        public int size(){
            return top+1;
        }
        public boolean isEmpty(){
            return top==-1;

        }


    }
    public static void main(String[] args) {
        Stack stack= new Stack(5);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());


    }

}
