package Arrays2D;

public class Transpose {
    public static void main(String[] args) {
        int [][] arr= {{2,3,4},{4,5,6},{7,7,4}};
    findTranspose(arr);
    }
    public static void findTranspose(int [][]arr){
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[i].length; j++) {
                temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ ",");
            }
            System.out.println();
        }

    }


}
