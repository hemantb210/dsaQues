package Arrays;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DistinctElementsInEveryWindow {

    public static void main(String[] args) {
countDistinct(new int [] {2,3,4,4,5,5,6},7,3);
    }
    static ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here

        HashMap<Integer,Integer> map = new HashMap<>();
        int count =0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if(map.get(A[i])==null){
                map.put(A[i],1);
            }
            else{
                map.put(A[i],map.get(A[i])+1 );
            }
        }
        count = map.size();
//        System.out.println(count);
        list.add(count);
        for (int i = 0; i < A.length-k; i++) {
            int start=0;
            if(map.get(A[i])==1){
                map.remove(A[i]);

            }
            else{
                map.put(A[i], map.get(A[i])-1);
            }

            if(map.get(A[i+k])==null){
                map.put(A[i+k],1);

            }
            else{
                map.put(A[i+k],map.get(A[i+k])+1);
            }
            count = map.size();
            list.add(count);
        }
        return list;


    }


}
