package Recursion;

public class Pattern1 {
    static int k =1;
    public static void main(String[] args) {
pattern(5,1);
    }

    public static void pattern(int rows, int currentRow){

        if(rows==0){
            return;
        }
        print(currentRow);
        System.out.println();
        pattern(rows-1,currentRow+1);

    }
    public static void print(int row){
        if(row==0){
            return;
        }
        System.out.print(k + " ");
        k++;
        print(row-1);

    }

}
