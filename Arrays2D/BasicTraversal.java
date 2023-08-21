package Arrays2D;

//Symmetric  matrix a[i][j]=a[j][i]
public class BasicTraversal {
    public static void main(String[] args) {
        int [][] arr = {
                {2,3,4},
                {4,3,2},
                {5,3,2},
        };
//        rowWise(arr);
        columnWise(arr);
    }
    public static void rowWise(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ ",");
            }
            System.out.println();
        }

    }
    public static void columnWise(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[j][i]+ ",");
            }
            System.out.println();
        }



    }


}
