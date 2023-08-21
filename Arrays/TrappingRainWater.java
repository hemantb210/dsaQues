package Arrays;

import java.util.Arrays;

//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
public class TrappingRainWater {
    public static int trap(int[] height) {
        int leftmax=0;
        int rightmax=0;
        int l=0;
        int ans =0;
        int r =height.length-1;
        while(l<=r){
            if(leftmax<=rightmax){
                if(leftmax>height[l]){
                    ans += leftmax- height[l];
                }
                else{
                    leftmax=height[l];
                }
                l++;
            }
            else{
                if(rightmax<=height[r]){
                    rightmax=height[r];
                }
                else{
                    ans += rightmax-height[r];
                }
                r--;
            }
        }
        return ans;
    }

    public static void brute(int [] arr){
        int leftMax=0;
        int rightMax=0;
        int ans =0;
        for (int i = 0; i < arr.length ; i++) {
            rightMax=0;
            leftMax=0;
            for (int j = i; j < arr.length; j++) {
                if(rightMax<=arr[j]){rightMax=arr[j];}
            }
            for (int j = 0; j <=i; j++) {
                if(leftMax<=arr[j]){leftMax=arr[j];}
            }
            ans += Math.min(rightMax,leftMax)-arr[i];
        }
        System.out.println(ans);


    }

    public static void better(int [] height){
        int [] prefixMax = new int [height.length];
        int [] suffixMax= new int [height.length];
        int ans =0;
        prefixMax[0]= height[0];
        suffixMax[height.length-1]=height[height.length-1];
        for (int i =  1; i < prefixMax.length; i++) {
            prefixMax[i]= prefixMax[i-1] < height[i]?height[i] :prefixMax[i-1];
        }

        for (int j= height.length-2;j>=0;j--){
            suffixMax[j]=suffixMax[j+1]<height[j]?height[j] :suffixMax[j+1];
        }

        for(int i=0;i<height.length;i++){
            ans += Math.min(prefixMax[i],suffixMax[i])-height[i];

        }
        System.out.println("better " +ans);

    }


    public static void main(String[] args) {
        System.out.println(trap(new int [] {0,1,0,2,1,0,1,3,1,2,1}));
        brute(new int [] {0,1,0,2,1,0,1,3,1,2,1});
        better(new int [] {0,1,0,2,1,0,1,3,1,2,1});
    }
}
