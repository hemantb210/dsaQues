package backtracking;

public class NQueenOptiimised {

    public static void main (String [] args){
        boolean [] [] arr = new boolean[4][4];
        int c = nQueen(arr,0);
        System.out.println(c);

    }
    public static int nQueen(boolean [][] arr,int currentRow){
        int count=0;
        if(currentRow==arr.length){
            return 1;
        }

        for (int i =0; i< arr[currentRow].length; i++){

            if(canBePlaced(arr,i,currentRow)){
                arr[currentRow][i]= true;
                count += nQueen(arr,currentRow+1);
                System.out.println("currentbeforeBT " +currentRow);
                arr[currentRow][i]=false;
                System.out.println("currentafterBT  " +currentRow);
            }

        }
        System.out.println("currentInitially  " +currentRow);
        return count;

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
