package Arrays;
//A peak element is an element that is strictly greater than its neighbors.
//Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
//
//        You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
//
//        You must write an algorithm that runs in O(log n) time.
public class findPeakElement {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,0};
        System.out.println(findPeakElement1(arr));
    }
    public static int findPeakElement1(int[] nums) {
        int low =0;
        int high = nums.length-1;
        int n = nums.length;

        while(low<=high){
            int mid = low+(high-low)/2;
            if((mid==0 || nums[mid]>nums[mid-1])&& ( mid==(n-1)||nums[mid]>nums[mid+1])){
                return mid;
            }
            else if(nums[mid]<nums[mid+1]){
                low = mid+1;

            }
            else{
                high = mid-1;
            }


        }
        return -1;

    }
}
