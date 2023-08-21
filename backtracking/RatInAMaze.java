package backtracking;

import java.util.ArrayList;
import java.util.List;

public class RatInAMaze {
public static void findPath(List<String> ans, int [][] arr, int row, int col, String path,int [][] vis){

    if(arr[0][0]==0||col<0||row<0||row==arr.length||col==arr[row].length||arr[row][col]==0||vis[row][col]==1){
        return;
    }
    if(row== arr.length-1&&col== arr.length-1){
        ans.add(path);
        return;
    }
    String pathLetter = "DLRU";
//    if(arr[0][0]==1){
        int dir[][]={{1,0},{0,-1},{0,1},{-1,0}};
        for (int i = 0; i < dir.length; i++) {
            int rowDirection= dir[i][0];
            int colDirections= dir[i][1];
            vis[row][col]=1;
            findPath(ans,arr,row+rowDirection,col+colDirections,path+pathLetter.charAt(i),vis);
           vis[row][col]=0;
        }
    //}


}

    public static void main(String[] args) {

//    int [][] arr= {
//            {1,1,1,0},
//            {1,0,1,0},
//            {0,1,1,0},
//            {0,0,1,1}
//
//    };
        int[][] arr = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};

    List <String > list = new ArrayList<>();
    int [][] vis = new int[arr.length][arr.length];


    for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                vis[i][j]=0;
            }
        }
    findPath(list,arr,0,0,"",vis);
        System.out.println(list);

    }



}
