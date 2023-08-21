package Arrays2D;

import java.util.Arrays;

public class KWeakestRows {
    public static void main(String[] args) {

        int mat[][] = {{1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1}};
        int k = 3;
      int[] ans = findWeakestRows(mat,k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] +" ");
        }

    }
    public static int[] findWeakestRows(int [][] mat,int k){
        int m = mat.length;
        int n = mat[0].length;
        int[][] ans = new int[m][2];
        for (int i = 0; i < m; i++) {
            int sum=0;
            for (int j = 0; j < n; j++) {
                if(mat[i][j]==0){
                    break;
                }
                else{
                    sum++;
                }
            }
            ans[i][0]=sum;
            ans[i][1]=i;

        }
        Arrays.sort(ans,(a,b)-> {if(a[0]==b[0]) return a[1]-b[1];
            else return a[0]-b[0];


        });

        int [] indices = new int[k];
        for (int i = 0; i < indices.length; i++) {
            indices[i]= ans[i][1];

        }
        return indices;





    }




}
