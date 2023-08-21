package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeaderInArray {
    public static void main(String[] args) {
        int [] arr = {60,58,72,9,2};
        leader(arr);
    }

    private static void leader(int[] nums) {
    List<Integer> list = new ArrayList<>();

    int max = Integer.MIN_VALUE;
    for(int i= nums.length-1; i>=0;i--){
        if(nums[i]>max){
            max= nums[i];
            list.add(max);
        }

    }
        System.out.println(list);


    }

}
