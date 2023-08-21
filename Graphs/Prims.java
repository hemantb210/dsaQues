package Graphs;
import java.util.*;


public class Prims {
   static HashMap<Integer,HashMap<Integer,Integer>> adj = new HashMap<>();
    static class Node{
        int parent;
        int distance;
        int node;
        Node(int node, int distance ,int parent){
            this.node= node;
            this.distance = distance;
            this.parent=parent;
        }
    }
    public static int minimumSpanningTree(HashMap<Integer,HashMap<Integer,Integer>> adj,ArrayList<Integer> list ){
        PriorityQueue<Node> queue = new PriorityQueue<>((x,y)->  x.distance-y.distance);
        queue.add(new Node(0,0,-1));
        int [] visited = new int[adj.size()];
        int sum=0;
        while(!queue.isEmpty())
        {
            int node = queue.peek().node;
            int parent = queue.peek().parent;
            int distance= queue.peek().distance;
            queue.remove();
            if(visited[node]==1) continue;
            list.add(node);
            visited[node]=1;
            sum+=distance;
            HashMap<Integer,Integer> vertices = adj.get(node);
            for(Map.Entry<Integer,Integer> vertex: vertices.entrySet()){
                if(visited[vertex.getKey()]==0) {
                    queue.add(new Node(vertex.getKey(), vertex.getValue(), node));

                }
        }


        }
        return sum;

    }
    public static void insert(int a, int b,int w ){
        adj.get(a).put(b,w);
        adj.get(b).put(a,w);
    }




    public static void main(String[] args) {
        int v= 5;

        for(int i =0;i<v;i++){
            adj.put(i,new HashMap<Integer,Integer>());
        }
        insert(0,1,3);
        insert(0,2,2);
        insert(2,3,4);
        insert(1,4,1);
        insert(2,4,8);
        System.out.println(adj);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(minimumSpanningTree(adj,list));
        System.out.println("List " + list);



    }
}
