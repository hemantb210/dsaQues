package Arrays;

import java.util.Arrays;

public class SortZeroAndOne {
    public static void main(String[] args) {
        sort(new int []{0,0,1,1,0,1,0,1,0,0,1,1,1});
    }
    static void sort(int[] arr){
        int count =0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(i<=count){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
