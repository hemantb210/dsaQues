package Arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int [] arr = {3,2,1,6,7};
        reverse(arr);
    }
    public static void reverse(int [] arr){
        int i =0;
        int j = arr.length-1;
        int temp=0;
        while(i<=j){
            temp =arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
