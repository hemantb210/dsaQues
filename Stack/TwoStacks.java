package Stack;

import java.util.Arrays;

public class TwoStacks {

    static class Stack{

        int [] arr ;
        int top1;
        int top2;
        Stack(int n){
            arr= new int[n];
            top1=-1;
            top2=n;
        }

        public void push1(int a) throws Exception {
            if(top1 < top2-1){
                top1++;
                arr[top1]= a;
            }
            else{
                throw new Exception("Stack1 Overflow");
            }

        }
        public void push2(int a) throws Exception{
            if(top1+1<top2){
                top2--;
                arr[top2]=a;
            }
            else{
                throw new Exception("Stack2 Overflow");
            }
        }
        public int pop1(){
            if(top1>0){
            return arr[top1--];}
            else
                return -1;
        }
        public int pop2(){
            if(top2< arr.length){
            return  arr[top2++];}
            else return -1;
        }
        public int size1(){
            return top1+1;
        }
        public int size2(){
            return arr.length-top2;
        }
        public void print(){
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) throws Exception {
        Stack stack = new Stack(6);
        stack.push1(1);
        stack.push1(2);
        stack.push2(5);
        stack.push2(4);
        stack.print();
        System.out.println(  stack.pop1());
        System.out.println( stack.pop2());
        stack.print();


    }
}
