package Recursion;

public class ArraySorted {
    public static void main(String[] args) {
        int [] arr = {2,5,5,5,9};
        System.out.println(isArraySorted(arr,0));
    }
    public static boolean isArraySorted(int[] arr,int index1){

        if((index1==arr.length-1)){
            return true;
        }
        if(arr[index1]<=arr[index1+1]){
            return isArraySorted(arr,index1+1);
        }
        else {
            return false;
        }

    }
}
