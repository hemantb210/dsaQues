package backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    //39. Combination Sum
    public static void main(String[] args) {
        int [] arr = {2,5,6,1};
        int sum = 7;
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        combinationSum(arr,sum,0,list,ans);
        System.out.println(ans);

    }
    public static void combinationSum(int [] arr, int sum,int index, List<Integer> ds,List<List<Integer>> ans){
//        arr[index]>sum||
        if( index==arr.length){return;}
        if(sum==0){
            ans.add(new ArrayList(ds));
            return;}

       if(arr[index]<=sum){
           ds.add(arr[index]);
           combinationSum(arr,sum-arr[index],index,ds,ans);
           ds.remove(ds.size()-1);


       }
       combinationSum(arr,sum,index+1,ds,ans);


    }

}
