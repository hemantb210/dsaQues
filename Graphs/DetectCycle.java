package Graphs;
import java.util.*;

public class DetectCycle {

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        int [] visited =new int[adj.size()];
        int [] parent = new int[adj.size()];
        for(int i=0;i<V;i++){
            if(visited[i]==0){
                if(detectCycle(adj,i,visited,parent))
                    return true;
            }
        }
        return false;
    }

    public boolean detectCycle( ArrayList<ArrayList<Integer>> adj,int source,int [] visited,int[] parent){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        parent[source]=-1;

        while(!queue.isEmpty()){
            int first = queue.poll();
            ArrayList<Integer> listOfVertices = adj.get(first);
            visited[first]=1;
            for(int i=0; i<listOfVertices.size();i++){
                int second= listOfVertices.get(i);
                if(visited[second]==0)
                {parent[second]= first;
                    queue.add(second);}
                else{
                    if(second!=parent[first])
                        return true;
                }
            }

        }
        return false;
    }
}
