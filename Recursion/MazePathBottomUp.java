package Recursion;

import java.util.ArrayList;

public class MazePathBottomUp {

    public static void main(String[] args) {
        System.out.println(bottomUp(0,0,4,4).size());
    }

    public static ArrayList<String> bottomUp(int currentRow,int currentColumn,int lastRow,int lastCol){
        if(currentRow==lastRow&&currentColumn==lastCol){
            ArrayList<String> arr = new ArrayList<>();
            arr.add("");
            return arr;}
        if(currentColumn>lastCol||currentRow>lastRow){
            ArrayList<String> arr = new ArrayList<>();
            return arr;
        }
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> horizontal = bottomUp(currentRow,currentColumn+1,lastRow,lastCol);
        for(String s : horizontal){
            result.add("h"+s);
        }
        ArrayList<String> vertical = bottomUp(currentRow+1,currentColumn,lastRow,lastCol);
        for(String s : vertical){
            result.add("v"+s);
        }
        return result;



        }


}
