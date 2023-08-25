package Trees.BinaryTrees;
import java.util.*;

public class FindMaximum {
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
    public static int findMax(Node node){
        int max=Integer.MIN_VALUE;
        if(node==null){
            return 0;
        }
        if(node.left==null&&node.right==null){
           return node.data;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node temp= queue.remove();
            if(temp.data>max){
                max=temp.data;
            }
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }

        }
        return max;
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
        System.out.println(findMax(root));
    }


}
