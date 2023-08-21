package Graphs;
import java.util.*;

public class WeightedUsingMaps {
    static HashMap<Integer,Vertex> graph = new HashMap<>();
    static class Vertex{
        HashMap<Integer,Integer> neighbours = new HashMap<>();
        public String toString(){
           return  ""+ neighbours;
        }
    }

    public static void addVertex(int v){
        Vertex vertex = new Vertex();
        graph.put(v,vertex);
    }
    public static void addEdge(int v,int u,int weight){
        if(graph.get(v)!=null||graph.get(u)!=null||!graph.get(v).neighbours.containsKey(u)){
            graph.get(v).neighbours.put(u,weight);
            graph.get(u).neighbours.put(v,weight);
        }
    }
    static void print(){
        for(Map.Entry<Integer,Vertex> currentVertex: graph.entrySet()){
            System.out.println(currentVertex.getKey()+ "=>"+currentVertex.getValue());

        }
    }

    public static void main(String[] args) {
        addVertex(1);
        addVertex(2);
        addVertex(3);
        addVertex(4);
        addVertex(5);
        addEdge(1,4,2);
        addEdge(1,3,4);
        addEdge(1,2,3);
        addEdge(3,5,2);
        addEdge(2,3,1);
        print();


    }


}