package Stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
     int arr[] ={100,80,60,70,60,75,85};
     int ans[] = find(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int [] find(int [] arr){
        int [] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        ans[0]=1;
        stack.push(0);
        for (int i = 1; i <arr.length; i++) {
            //there is only one push and pop for any i
            //take example 40.30,20,10,50: no of comparisons for 30,20,10 is 1 and for 50 it is n-1 which is O(n)
            while(!stack.isEmpty()&& arr[stack.peek()]<arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]= i+1;
            }
            else{
                ans[i]= i-stack.peek();
            }
            stack.push(i);
        }

return ans;

    }
}
