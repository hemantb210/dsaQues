package Arrays2D;

public class RotateImage {
    public static void main(String[] args) {
int [][] arr ={
        {5,1,9,11},
        {2,4,8,10},
        {13,3,6,7},
        {15,14,12,16}


};
rotateImage(arr);
    }
    public static void rotateImage(int [] [] arr){
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[i].length; j++) {
                temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int low=0;
            int mid = arr.length-1;
        while(low<=mid) {
              temp= arr[i][low];
              arr[i][low]=arr[i][mid];
              arr[i][mid]=temp;
              low++;
              mid--;


            }}
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] +",");
            }
            System.out.println();
        }
    }
}
