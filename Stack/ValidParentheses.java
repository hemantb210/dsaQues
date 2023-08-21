package Stack;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        ValidParentheses vd = new ValidParentheses();
        System.out.println(vd.isValid("((()))"));
    }
    Stack<Character> stack = new Stack<>();

    public boolean isValid(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }
            else {
                if(stack.isEmpty()){
                    return false;
                }
            else if(pairMatch(stack.peek(),s.charAt(i))){
                stack.pop();
            }
            else{
                return false;
                }

        }}
        return stack.isEmpty();


    }
    public boolean pairMatch(char a, char b){
        if(a=='(' && b==')'){
            return true;
        }
        if(a=='{' && b=='}'){
            return true;
        }
        if(a=='[' && b==']'){
            return true;
        }
        return false;
    }
}
