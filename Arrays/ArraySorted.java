package Arrays;

public class ArraySorted {

    public static void main(String[] args) {
        int [] arr ={5,6,7,3};
//        System.out.println(isSorted(arr));
        System.out.println(isSortedEfficient(arr));
    }

    public static boolean isSorted(int [] arr){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[i]){
                    return false;
                }
            }

        }
        return true;

    }

    public static boolean isSortedEfficient(int [] arr){
        for (int i=0;i< arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
