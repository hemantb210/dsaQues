package Arrays2D;


import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int n =5;
        System.out.println( print(n));
    }

    private static List<List<Integer>> print(int n) {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> firstRow= new ArrayList<>();
    firstRow.add(1);
    list.add(firstRow);

        for (int i = 1; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 1; j < i; j++) {
                List<Integer> prevRow = list.get(i-1);
                row.add(prevRow.get(j-1) +prevRow.get(j));
            }
            row.add(1);
            list.add(row);

        }
        return list;



    }

}
