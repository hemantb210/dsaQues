package Arrays2D;

public class SnakeTraversal {
    public static void main(String[] args) {
        int [] [] arr={
                {2,4,9},
                {8,9,3},
                {7,7,1},
                {1,2,9}
        };
        traverse(arr);
    }
    public static void traverse(int [][] arr){
        for (int i = 0; i < arr.length ; i++) {
            if(i%2==0){
                for (int j = 0; j < arr[i].length; j++) {

                    System.out.print(arr[i][j]+",");
                }}
                else{
                for (int j = arr[i].length-1; j >= 0; j--) {

                    System.out.print(arr[i][j]+",");
                }

                }

            }
        }


    }

