package Graphs;
import Graphs.Impl.*;
import java.util.*;

public class ShortestPathInUndirectedGraph {

    public static void shortestPath(ArrayList<ArrayList<Integer>> adj){
        int [] distance = new int[adj.size()];
        int [] visited= new int [adj.size()];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0]=1;
        distance[0]=0;
        while(!queue.isEmpty()){
            int first= queue.poll();
            ArrayList<Integer> vertices = adj.get(first);
            for(int i=0; i<vertices.size();i++){
                int second = vertices.get(i);
                if(visited[second]==0)
                visited[second]=1;
                distance[second] =distance[first]+1;
                queue.add(second);
            }
        }
    }

    public static void main(String[] args) {

    }
}
