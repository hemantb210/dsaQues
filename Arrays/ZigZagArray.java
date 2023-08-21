package Arrays;

import java.util.Arrays;

public class ZigZagArray {
    public static void main(String[] args) {
        convertToZigZag(new int []{4, 3, 7, 8, 6, 2, 1});
    }

    private static void convertToZigZag(int[] nums) {
    boolean flag = true;

        for (int i = 0; i < nums.length-1; i++) {
            if(flag){
                if(nums[i]>nums[i+1]){
                    swap(i,i+1,nums);
                }
            }
            else{
                if(nums[i]<nums[i+1]){
                    swap(i,i+1,nums);
                }

            }
            flag=!flag;
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void swap(int i, int j, int [] arr ) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
