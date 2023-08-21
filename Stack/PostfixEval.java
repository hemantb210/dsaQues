package Stack;

import java.util.Stack;

public class PostfixEval {


    public static void main(String[] args) {
        postfix("621+/");

    }
    public  static void postfix(String s){
        Stack<Integer> stack = new Stack<>();
        char x=0;
        int a=0;
        int b=0;
        int ans=0;
        for(int i =0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                stack.push(s.charAt(i)-'0');
            }
            else{
                x = s.charAt(i);
                a = stack.pop();
                b= stack.pop();
            }
            switch(x){
                case '+':
                  ans = a+b;
                  stack.push(ans);
                  break;
                case '-':
                    ans=b-a;
                stack.push(ans);
                break;
                case '/':
                    ans=b/a;
                    stack.push(ans);
                    break;
                case '*':
                    ans=b*a;
                    stack.push(ans);
                    break;



            }


        }
        System.out.println(ans);

    }


}
