package Trees.BinaryTrees;

import java.util.*;

public class VerticalTraversal {
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

    static Node root;

    static class VerticalPair{
        Node node;
        int coordinate;
        VerticalPair(Node node,int coordinate ){
            this.node=node;
            this.coordinate=coordinate;
        }
    }
static List<List<Integer>> traversal(Node node){
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        Queue<VerticalPair> queue = new LinkedList<>();
        queue.add(new VerticalPair(node,0));
        int minCoordinate=Integer.MAX_VALUE;
        int maxCoordinate=Integer.MIN_VALUE;

        while(!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                VerticalPair v = queue.poll();
                minCoordinate = Math.min(minCoordinate, v.coordinate);
                maxCoordinate = Math.max(maxCoordinate, v.coordinate);
                map.putIfAbsent(v.coordinate, new ArrayList<>());
                map.get(v.coordinate).add(v.node.data);
                if (v.node.left != null) {
                    queue.add(new VerticalPair(v.node.left, v.coordinate - 1));
                }
                if (v.node.right != null) {
                    queue.add(new VerticalPair(v.node.right, v.coordinate + 1));
                }

            }
        }
        for(int i=minCoordinate;i<=maxCoordinate;i++){
            ans.add(map.get(i));
        }
return ans;

}
public static void topView(){
        List<List<Integer>> list =traversal(root);
        for(List<Integer> l : list){
            System.out.print(l.get(0) + " ");
        }
}
public static void bottomView(){
    List<List<Integer>> list =traversal(root);
    for(List<Integer> l : list){
        if(l.size()==1)
        {System.out.print(l.get(0) + " ");}

        else if(l.size()>1){
            System.out.print(l.get(l.size()-1) + " ");

    }
}}

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
        System.out.println(traversal(root));
        topView();
        System.out.println();
        bottomView();
    }

}
