package Stack;

import java.util.Stack;

public class PrefixEval {

    public static void main(String[] args) {
        System.out.println(prefix("+*231"));
    }
    public static int prefix(String s){
        Stack<Integer> stack = new Stack<>();
        int ans =0;
        for(int i =s.length()-1;i>=0;i--){
            if(Character.isDigit(s.charAt(i))){
                stack.push(s.charAt(i)-'0');
            }
            else {
                char x = s.charAt(i);
                int a = stack.pop();
                int b = stack.pop();
                switch (x) {
                    case '+':
                        ans = a + b;
                        stack.push(ans);
                        break;
                    case '-':
                        ans = a - b;
                        stack.push(ans);
                        break;
                    case '*':
                        ans = a * b;
                        stack.push(ans);
                        break;
                    case '/':
                        ans = a / b;
                        stack.push(ans);
                        break;

                }
            }
        }
        return ans;

    }
}
