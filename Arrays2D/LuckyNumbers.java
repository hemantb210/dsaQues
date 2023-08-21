package Arrays2D;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbers {
    public static void main(String[] args) {
        int [][] matrix= {{3,7,8},
                         {9,11,13},
                         {15,16,17}};
        System.out.println(luckyNumbers(matrix));
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        int max=0;
        int j=0;
        int i=0;
        int row=0;
        List<Integer> list = new ArrayList<>();
        for ( i = 0; i < matrix.length; i++) {
            int min=matrix[i][0];
            for (j =0; j<matrix[i].length;j++){

                if(matrix[i][j]<min){
                  row=j;
                    min=matrix[i][j];
                }

            }
             max=0;
            for (int k = 0; k < matrix.length; k++) {
                if(matrix[k][row]>max){
                    max=matrix[k][row];
                }
            }
            if(max==min) {
                list.add(max);
            }
        }
        if(list.size()==0){
            list.add(-1);
        }
return list;

    }

}
