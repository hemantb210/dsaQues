package Recursion;

import java.util.ArrayList;

public class MazePathDiagonal {
    public static void main(String[] args) {
        System.out.println(allWays(0,0,4,4));
    }
    public static ArrayList<String> allWays(int currentRow,int currentColumn,int endRow, int endCol){
       if(currentRow==endRow&&currentColumn==endCol){
           ArrayList<String> arr = new ArrayList<>();
           arr.add("");
           return arr;
       }
       if(currentRow>endRow||currentColumn>endCol){
           ArrayList<String> arr = new ArrayList<>();
           return arr;
       }
       ArrayList<String> result = new ArrayList<>();
       ArrayList<String> right= allWays(currentRow,currentColumn+1,endRow,endCol);
       for(String s : right){
           result.add("h"+s);
       }
        ArrayList<String> down= allWays(currentRow+1,currentColumn,endRow,endCol);
        for(String s : down){
            result.add("v"+s);
        }
        ArrayList<String> diagonal= allWays(currentRow+1,currentColumn+1,endRow,endCol);
        for(String s : diagonal){
            result.add("d"+s);
        }
       return result;

    }
}
