package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        int [] arr = {4,5,6};
        List<Integer> list = new ArrayList<>();
        boolean [] map = new boolean[3];
    List<List<Integer>> res = new ArrayList<>();
//            findPermutations1(res,arr,list,map);
        findPermutations(res,arr,0);
        System.out.println(res);

    }

    private static void findPermutations(List<List<Integer>> res, int[] arr,int index) {

        if(index== arr.length){
            List<Integer> list= new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);

            }
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i = index ;i< arr.length;i++ ){
          int  temp= arr[index];
          arr[index]=arr[i];
          arr[i]= temp;
          findPermutations(res,arr,index+1);
              temp= arr[index];
            arr[index]=arr[i];
            arr[i]= temp;


        }

return;
    }

    private static void findPermutations1(List<List<Integer>> res,int[] arr,List<Integer> list,boolean[] map) {
        if (list.size()== arr.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if(!map[i]){
                list.add(arr[i]);
                map[i] = true;
                findPermutations1(res,arr,list,map);
                map[i]=false;
                list.remove(list.size()-1);
            }
        }
        return;




    }






}
