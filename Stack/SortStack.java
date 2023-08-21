package Stack;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(6);
        stack.push(3);
        stack.push(10);
        stack.push(1);
        Stack<Integer> ans = sort(stack);
        while(!ans.isEmpty()){
            System.out.println(ans.pop());

        }
    }
    public static Stack<Integer> sort(Stack<Integer> org){
        Stack<Integer> temp = new Stack<>();
        while(!org.isEmpty()){
            int current = org.pop();
            while(!temp.isEmpty() && current>temp.peek()){
                org.push(temp.pop());
            }
            temp.push(current);


        }
        return temp;
    }
}
