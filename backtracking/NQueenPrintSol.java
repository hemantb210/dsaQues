package backtracking;

public class NQueenPrintSol {
        public static void main (String [] args){
            boolean [] [] arr = new boolean[4][4];
            nQueen(arr,0);

        }
        public static void nQueen(boolean [][] arr,int currentRow){

            if(currentRow==arr.length){
                System.out.println("[");
                for(int i=0; i< arr.length;i++)
                {
                    for (int j = 0; j < arr[i].length; j++) {
                        System.out.print( arr[i][j] + " " );
                    }
                      System.out.println();

                }
                System.out.println("]");
                return ;
            }

            for (int i =0; i< arr[currentRow].length; i++){

                if(canBePlaced(arr,i,currentRow)){
                    arr[currentRow][i]= true;
                   nQueen(arr,currentRow+1);
                    arr[currentRow][i]=false;

                }

            }
            return;

        }

        public static boolean canBePlaced(boolean[][] arr,int col,int currentRow) {
            for (int j =currentRow ; j >=0 ; j--) {
                if(arr[j][col]){
                    return false;
                }
            }
            for (int j =currentRow, i = col ; j >=0 && i< arr.length; j--,i++) {
                if(arr[j][i]){
                    return false;
                }
            }
            for (int j =currentRow, i = col ; j >=0 && i>=0; j--,i--) {
                if(arr[j][i]){
                    return false;
                }
            }
            return true;

        }
    }



