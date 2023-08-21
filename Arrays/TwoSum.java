package Arrays;

import java.util.Arrays;
import java.util.HashMap;

//LC 1
public class TwoSum {
    public static void main(String[] args) {
        approach2(new int []{2,3,6,7,4},6);

    }

    public static void approach1(int [] arr,int target){
        int a =0;
        int ans[] = new int[2];
        int i =0;
        for ( i = 0; i < arr.length; i++) {
            a= linearSearch(arr,target-arr[i]);
            if(a!=-1){
                ans[0]=i;
                ans[1]=a;

            }
        }
        System.out.println(Arrays.toString(ans));

    }
    public static int linearSearch(int[] arr, int element){
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==element){
                return i;
            }
        }
        return -1;

    }

    public static void approach2(int [] arr, int target){
        HashMap<Integer,Integer>  map= new HashMap<>();
        for(int i=0; i< arr.length;i++){
            if(map.get(arr[i])==null){
            map.put(target-arr[i],arr[i]);}
            else {
                System.out.println(arr[i]+ " " + map.get(arr[i]));
            }
        }



    }

}
