package Arrays;


import java.util.Arrays;

public class DeleteArray {
    public static void main(String[] args) {
        int [] arr = {2,0,5,0,0};
        delete(1,arr,3);
        System.out.println(Arrays.toString(arr));

    }
    static void delete(int index, int [] arr,int currentSize){
        for(int i = index; i<=currentSize-1;i++){
            arr[i]= arr[i+1];
        }
        currentSize--;
    }

}
