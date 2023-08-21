package Arrays;

import java.util.Arrays;

//LC 75
public class SortColors {
    public static void main(String[] args) {
        int arr[]={0,0,1,2,0,1,0,2,0,2,1,2,1};
        sort(arr);
    }

    private static void sort(int[] arr) {
        int low =0;
        int mid =0;
        int high= arr.length-1;

        while(mid<=high){

            if(arr[mid]==0){
                swap(arr,low,mid);
                mid++;
                low++;
            }
            if(arr[mid]==1){
            mid++;

        }
            if(arr[mid]==2){
                swap(arr,high,mid);
                high--;
            }

    }
        System.out.println(Arrays.toString(arr));

}
static void swap(int [] arr , int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
}
}
