package Arrays2D;

public class SpiralTraversal {
    public static void main(String[] args) {
//        int arr[][] = {
//                {1,2,3,5},
//                {4,6,7,1},
//                {1,5,8,2},
//                {5,6,8,9}
//        };
        int ar[][]={
                {2},
                {3},
                {6}

        };
        int arrr[][]={{2,3,6}};
                traverse(ar);
    }

    public static void traverse(int [][] matrix){
        int top=0;
        int bottom= matrix.length-1;
        int left =0;
        int right = matrix[0].length-1;
        while(left<=right&&bottom>=top){
            for (int i = left ; i <=right; i++) {
                System.out.print(matrix[top][i]);

            }
            top++;
            for (int i = top; i <=bottom; i++) {
                System.out.print(matrix[i][right]);

            }
            right--;
            if(top<=bottom){
            for (int i = right; i >=left; i--) {
                System.out.print(matrix[bottom][i]);

            }
                bottom--;}

            if(left<=right){
            for (int i = bottom; i >=top ; i--) {
                System.out.print(matrix[i][left]);

            } left++;

            }



        }



    }

}
