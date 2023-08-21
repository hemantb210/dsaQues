package Arrays2D;

import java.util.ArrayList;

public class SumOfUpperAndLowerTriangles {

    public static void main(String[] args) {
        int [][] arr= {
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };
       ArrayList<Integer> ar = sumTriangles(arr,3);
        System.out.println(ar);

    }

    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int sum=0;
        int sum2=0;
        for(int i=0; i<n;i++){
            for(int j=i;j<n;j++)
            {sum+=matrix[i][j];}
        }
        list.add(sum);
        for(int i=n-1;i>=0;i--){
            for(int j= i;j>=0;j--){
                sum2+=matrix[i][j];
            }
        }
        list.add(sum2);
        return list;
}}
