package Arrays;

import java.util.HashMap;

//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

public class MajorityElement {
    public static void main(String[] args) {
        int [] arr = {1,2,1,2,1,3,1,1,4,1,5,1,2,8,1};
//        approach1(arr);
        approach2(arr);
    }
    public static void approach1(int [] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            if(map.get(arr[i])==null){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1 );
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(map.get(arr[i])>(arr.length/2)){
                System.out.println("Majority element :" + arr[i]);
                flag=1;
                break;
            }
        }
        if(flag==0)
        System.out.println("Majority Element not found");

    }

    //Moore's voting algorithm
    public static void approach2(int [] nums){


        int count =0;
        int majorityElement=0;
        for (int i = 0; i < nums.length ; i++) {


            if (count == 0) {
                majorityElement = nums[i];
            }
            if(majorityElement==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        System.out.println("Majority Element " + majorityElement);
    }





}
