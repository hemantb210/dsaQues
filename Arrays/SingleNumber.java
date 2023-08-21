package Arrays;

import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
      int [] nums = {2,2,4,5,5,6,6};
//        System.out.println(findSingleNumber(nums));
        approach2(nums);
    }
    public static int findSingleNumber(int [] nums){
        int ans =0;
        for(int i =0; i< nums.length;i++) {
            ans ^= nums[i];
        }
        return ans;

    }

    public static void approach2(int [] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.get(nums[i])==null){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(map.get(nums[i])==1){
                System.out.println(nums[i]);
            }
        }

    }
}
