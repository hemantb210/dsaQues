package Trees.BinaryTrees;
import java.sql.SQLOutput;
import java.util.*;
public class DiagonalView {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    static class VerticalPair{
        Node node;
        int coordinate;
        VerticalPair(Node node, int coordinate){
            this.node=node;
            this.coordinate=coordinate;
        }
    }
    private static void diagonalView(Node node){
        if(node==null){
            return;
        }
        TreeMap<Integer,List<Integer>> map= new TreeMap<>();
        Queue<VerticalPair> queue = new LinkedList<>();
        queue.add(new VerticalPair(node,0));
        while(!queue.isEmpty())
        {
            VerticalPair current=queue.poll();
            map.putIfAbsent(current.coordinate,new ArrayList<>());
            map.get(current.coordinate).add(current.node.data);
            if(current.node.left!=null){
                queue.add(new VerticalPair(current.node.left, current.coordinate-1));
            }
            if(current.node.right!=null){
                queue.add(new VerticalPair(current.node.right,current.coordinate));
            }

        }
        for(Map.Entry<Integer,List<Integer>> entry: map.entrySet()){
            int key= entry.getKey();
            System.out.print(map.get(key));
        }
    }
    static Node root;
    public static void main(String[] args) {
        root = new Node(3);
        root.left=new Node(4);
        root.right=new Node(5);
        root.left.left=new Node(6);
        root.left.right=new Node(7);
         root.right.left=new Node (9);
        root.right.right=new Node(10);
        root.left.left.left=new Node(11);
        root.left.left.right=new Node(12);
       root.left.right.left=new Node(13);
        root.left.right.right=new Node(14);
        diagonalView(root);
    }
}
