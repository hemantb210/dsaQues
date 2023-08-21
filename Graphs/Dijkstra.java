package Graphs;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.*;

public class Dijkstra {

    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {

        // Write your code here
        int [] parent = new int[V];
        int [] distance= new int[V];
        for(int i =0; i< distance.length;i++){
            distance[i]=Integer.MAX_VALUE;
        }
        parent[S]= -1;
        PriorityQueue<Pair> pq= new PriorityQueue<>((x,y)-> x.weight-y.weight);
        pq.add(new Pair(0,S));
        distance[S]=0;
        while(!pq.isEmpty()){
            int node = pq.peek().node;
            int weight= pq.peek().weight;
            pq.remove();
            for(int i =0; i<adj.get(node).size();i++){
                int adjNode = adj.get(node).get(i).get(0);
                int adjWeight= adj.get(node).get(i).get(1);
                if(distance[adjNode]> weight+adjWeight){
                    distance[adjNode]= weight+adjWeight;
                    pq.add(new Pair(adjWeight+weight,adjNode));
                    parent[adjNode]= node;
                }


            }

        }
        ArrayList<Integer> path = new ArrayList<>();
        if(distance[V-1]==Integer.MAX_VALUE){
            path.add(-1);
            System.out.println(path);
        }
       int node= V-1;
        while(parent[node]!=-1){
            path.add(node);
            node= parent[node];
        }
        path.add(S);
        Collections.reverse(path);
        System.out.println(path);

        return distance;

    }

    static class Pair{
        int node;
        int weight;
        Pair(int weight,int node){
            this.node=node;
            this.weight= weight;
        }

    }
}
