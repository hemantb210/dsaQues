package Trees.BinaryTrees;

import java.util.ArrayDeque;
import java.util.*;

public class MaxWidth {
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
    static HashMap<Integer,Integer> hmMax=new HashMap<>();
    static HashMap<Integer,Integer> hmMin= new HashMap<>();



    public static int findWidth(Node node){
        if(node==null){
            return 0;
        }
        getWidthHelper(node,0,0);
        int maxx=Integer.MIN_VALUE;
        for(Integer key :hmMax.keySet()){
            maxx= Math.max(maxx,hmMax.get(key)-hmMin.get(key)+1);

        }
        return maxx;
    }
    public static void getWidthHelper(Node node,int level,int index){
        if(node==null){
            return;
        }
        if(hmMax.containsKey(level)){
            hmMax.put(level,Math.max(index,hmMax.get(level)));
        }
        else{
            hmMax.put(level,index);
        }
        if(hmMin.containsKey(level)){
            hmMin.put(level,Math.min(index,hmMin.get(level)));
        }
        else{
            hmMin.put(level,index);
        }
        getWidthHelper(node.left,level+1,2*index+1);
        getWidthHelper(node.right,level+1,2*index+2);


    }
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
        System.out.println(findWidth(root));
    }

}
