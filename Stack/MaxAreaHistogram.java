package Stack;

import java.util.*;

public class MaxAreaHistogram {

    public static void main(String[] args) {

    }
    public int largestRectangleArea(int[] heights) {
        int [] ns = ns(heights);
        System.out.println(Arrays.toString(ns));
        int [] ps= ps(heights);
        System.out.println(Arrays.toString(ps));
        int maxArea=0;
        for(int i =0; i<heights.length;i++){
            int area = heights[i]*(ns[i]-ps[i]-1);
            if(maxArea<area){
                maxArea=area;
            }
        }
        return maxArea;

    }


    public int [] ps(int [] heights){
        Stack <Integer> stack = new Stack<>();
        int [] ans = new int[heights.length];
        ans[0]=-1;
        stack.push(0);
        for(int i =1; i<heights.length;i++){
            while(!stack.isEmpty()&& heights[i]<=heights[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=stack.peek();
            }
            stack.push(i);


        }

        return ans;
    }

    public int [] ns(int [] heights){
        Stack <Integer> stack = new Stack<>();
        int n = heights.length;
        int [] ans = new int[heights.length];
        ans[n-1]=n;
        stack.push(n-1);
        for(int i =n-2; i>=0;i--){
            while(!stack.isEmpty()&& heights[i]<=heights[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=n;
            }
            else{
                ans[i]=stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }



}
