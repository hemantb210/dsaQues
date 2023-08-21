package Arrays;

import java.util.Arrays;

//LC 189
public class RotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6};
        int k =3;
        rotateLeft(arr,k);
//        rotateRight(arr,k);
    }

    private static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k=k%n;
        reverseArray(0,n-k-1,arr);
        reverseArray(n-k,n-1,arr);
        reverseArray(0,n-1,arr);
        System.out.println(Arrays.toString(arr));


    }
    private static void rotateLeft(int [] arr,int k){
        int n = arr.length;
        k=k%n;
        reverseArray(0,k-1,arr);
        reverseArray(k,n-1,arr);
        reverseArray(0,n-1,arr);
        System.out.println(Arrays.toString(arr));

    }
    private static void reverseArray(int a, int i1, int[] arr) {

        int i = a;
        int j = i1;
        while(i<j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;
            j--;
        }

    }


}
