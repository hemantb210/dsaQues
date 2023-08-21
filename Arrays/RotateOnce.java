package Arrays;

import java.util.Arrays;

//clockwise
//ant
public class RotateOnce {
    public static void main(String[] args) {
        int[] arr= {3,2,1,6,7,5};
//        rotateClockwise(arr);
        rotateApproach2(arr);
//        rotateAntiClockwise(arr);
    }

    private static void rotateClockwise(int[] arr) {
    int temp = arr[arr.length-1];
    for(int i = arr.length-1; i>0;i--){
        arr[i]= arr[i-1];

    }
        arr[0]= temp;
        System.out.println(Arrays.toString(arr));
    }

    private static void rotateAntiClockwise(int[] arr) {
        int temp = arr[0];
        for(int i =0; i<arr.length-1;i++){
            arr[i]= arr[i+1];

        }
        arr[arr.length-1]= temp;
        System.out.println(Arrays.toString(arr));
    }

    private static void rotateApproach2(int []arr){
        int i =0;
        int j=arr.length-1;
        int temp=0;
        while(i<j){
            temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;

        }
        System.out.println(Arrays.toString(arr));
    }


}
