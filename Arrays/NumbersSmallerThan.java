package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class NumbersSmallerThan {
    public static void main(String[] args) {
//        brute(new int []{8,1,2,2,3});
//        better(new int []{8,1,2,2,3});
        optimal(new int []{8,1,2,2,3});

    }
    public static void brute(int [] arr){
       int count =0;
       int [] ans = new int [arr.length];
        for(int i =0; i< arr.length;i++){
            count =0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    count ++;
                }
            }
            ans[i]=count;

        }
        System.out.println(Arrays.toString(ans));

    }
    public static void better(int [] arr){
        int [] org = arr.clone();
        int [] ans = new int[arr.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            map.putIfAbsent(arr[i],i);
        }
        for (int i = 0; i < arr.length; i++) {
            ans[i]= map.get(org[i]);
        }

        System.out.println(Arrays.toString(ans));

    }

    public static void optimal( int [] nums){
        int [] arr= new int [101];
        int [] ans = new int [nums.length];
        for (int i = 0; i < nums.length ; i++) {
            arr[nums[i]]++;
        }
        for(int i =1;i< arr.length;i++){
            arr[i]= arr[i]+arr[i-1];

        }
        for(int i =0;i< nums.length;i++){
            if(nums[i]==0){
                ans[i]=0;
            }
            else{

            ans[i]= arr[nums[i]-1];}


        }
        System.out.println(Arrays.toString(ans));


    }

}
