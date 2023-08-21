package Stack;

import java.util.Arrays;
import java.util.Stack;

//if it is a circular array so learn the loop till 2n-1 and change i to i%n

public class NextGreater {
    public static long[] nextLargerElement(long[] arr, int n)
    {
        // Your code here
        long[] ans = new long[arr.length];
        Stack<Long> s = new Stack<>();
        s.push(arr[n-1]);
        ans[n-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            while(!s.isEmpty()&& arr[i]>=s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=s.peek();
            }

            s.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        long [] ans = nextLargerElement(new long[]{10,12,4,9,6,15},6);
        System.out.println(Arrays.toString(ans));
    }


}
