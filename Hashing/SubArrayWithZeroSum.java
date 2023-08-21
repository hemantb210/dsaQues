package Hashing;

import java.util.HashMap;

public class SubArrayWithZeroSum {


    public static void main(String[] args) {
//        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        int arr[] = {1,1,4,-2,-3};

        System.out.println(maxLengthSubArray(arr));

    }
    public static int maxLengthSubArray(int [] arr){
        int sum=0;
        int max=0;
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i =0; i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
               max=i+1;
            }
            Integer x = map.get(sum);
            if(x==null){
                map.put(sum,i);
            }
            else {
              int j = i-x;
              max= Math.max(max,j);
            }

        }


return max;
    }
}
