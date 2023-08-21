package Recursion;

import java.util.Arrays;

public class ElementOccurs {

    public static void main(String[] args) {
        int [] arr={2,3,3,3,6,7,2};
        int k =3;
        int [] ans = findElement(arr,k,0,new int[arr.length],0);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] findElement(int [] arr,int k,int index,int [] ans,int ansIndex){
        if(index== arr.length){
            return ans;
        }
        if(arr[index]==k){
            ans[ansIndex] = index;
            return findElement(arr,k,index+1,ans,ansIndex+1);
        }
        return findElement(arr,k,index+1,ans,ansIndex);
    }
}
