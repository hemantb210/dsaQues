package Graphs;
import Trees.BinaryTrees.Traversals;

import java.util.*;
public class Impl {
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    static class Traversals{
        static void BFS(ArrayList<ArrayList<Integer>> adj,int start,int[] visited){
//            int [] visited = new int[adj.size()];
            Queue<Integer> queue = new LinkedList<>();
            queue.add(start);
            visited[start]=1;
            while(!queue.isEmpty()){
                int index= queue.poll();
                System.out.print(index + " ");
                ArrayList<Integer> verticesList= adj.get(index);
                for(int i =0;i<verticesList.size();i++){
                    if(visited[verticesList.get(i)]==0){
                      visited[verticesList.get(i)]=1;
                      queue.add(verticesList.get(i));
                    }
                }
            }
        }
       static void BFSDisconnected(ArrayList<ArrayList<Integer>> adj) {
            int[] visited = new int[adj.size()];

           for (int i = 0; i < visited.length; i++) {
               if(visited[i]==0)
               { BFS(adj,i,visited);
               }
           }
       }

       static void DFS(ArrayList<ArrayList<Integer>> adj,int start,int [] visited){
            if(visited[start]==1){
                return;
            }
            ArrayList<Integer> vertexList= adj.get(start);
            System.out.print(start+" ");
           visited[start]=1;
           for (int i = 0; i < vertexList.size(); i++) {
               DFS(adj,vertexList.get(i),visited);
           }
       }

       static void DFSDisconnected(ArrayList<ArrayList<Integer>> adj){
           int [] visited = new int[adj.size()];
           for(int i =0;i<visited.length;i++){
               if(visited[i]==0){
                   DFS(adj,i,visited);
               }
           }

       }
    }


    public static void main(String[] args) {
        int v=7;
        for(int i =0;i<v;i++){
            list.add(new ArrayList<>());
        }
      insert(0,3);
        insert(0,1);
        insert(1,2);
        insert(3,2);
        insert(6,5);
        insert(4,5);
        System.out.println("list " +list);
//        print();
//        Traversals.BFSDisconnected(list);
//        Traversals.DFS(list,0,new int[list.size()]);
        Traversals.DFSDisconnected(list);
    }

    public static void insert(int u,int v){
        list.get(u).add(v);
        list.get(v).add(u);
    }
    public static void print(){
        for(int i =0;i<list.size();i++){
            System.out.print(i + ": ");
            for(int j=0;j<list.get(i).size();j++){
                System.out.print(list.get(i).get(j)+ " ");
            }
            System.out.println();
        }
    }



}
