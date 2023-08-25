package Trees.BinaryTrees;
import java.util.*;
public class CountNodes {
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




   static  Node root;

    private static int count(Node current){
        if(current==null){
            return 0;
        }
        return count(current.left)+count(current.right)+1;
    }
    private static int levelOrderCount(Node current){
        if(current==null){
            return 0;
        }
        if(current.left==null&&current.right==null){
            return 1;
        }
        Queue<Node> queue = new LinkedList<>();
        int count=0;
        queue.add(current);
        while(!queue.isEmpty()){
            count++;
            Node temp= queue.poll();
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
        return count;

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
        System.out.println(count(root));
        System.out.println(levelOrderCount(root));
    }



}
