package Stack;

import java.util.Stack;

public class InToPost {
    public static void main(String[] args) {
        System.out.println(postfix("a+(b+c)"));
    }

    public static String postfix(String s){
        Stack<Character> stack = new Stack<>();
        StringBuilder result= new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                result.append(c);
            }
            else if(c=='('){
                stack.push(c);
            }
            else if(c==')'){
                while(!stack.isEmpty()&& stack.peek()!='('){
                    result.append(stack.peek());
                    stack.pop();
                }
                stack.pop();
            }
            else {while(!stack.isEmpty()&& prec(c)<=prec(stack.peek()))
            {
                result.append(stack.pop());}
            stack.push(c);
            }}

            while(!stack.isEmpty()){
                if(stack.peek()=='('){
                    System.out.println("invalid");
                    return null;
                }
                result.append(stack.pop());



        }
        return result.toString();
    }
    static int prec(char c ){
        switch(c){
            case '+':
            case '-':
                return 1;
            case '/':
            case '*':
                return 2;
            case '^':
                return 3;

        }
        return -1;


    }



}
