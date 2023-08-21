package Arrays;

public class MaxElement {
    static void max(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]>max){
                max= arr[i];
            }

        }
        System.out.println("max " +max);



    }

    //Sorting



    static void max1(int [] arr){
        boolean isMax;
        for (int i = 0; i < arr.length ; i++) {
            isMax=true;
            for (int j = 0; j <arr.length ; j++) {
                if(arr[j]>arr[i]){
                    isMax=false;
                    break;
                }
            }
            if(isMax){
                System.out.println("max " + arr[i]);
                return;
            }

        }




    }

    public static void main(String[] args) {
        int [] arr = {3,4,7,1,6};
        max(arr);
    }


}
