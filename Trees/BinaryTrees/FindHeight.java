package Trees.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class FindHeight {

    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data= data;
            left=null;
            right=null;
        }

    }
    static Node root;
    static int maxHeight(Node root){
        if(root==null)
        {return 0;}
        return Math.max(maxHeight(root.left),maxHeight(root.right))+1;

    }
    static int maxHeightIteration(Node root){
        Queue<Node> queue = new LinkedList<>();
        int height =0;
        queue.add(root);
        while(!queue.isEmpty()){
            height++;
            int size = queue.size();
            while(size>0){
                size--;
                Node current = queue.remove();
                if(current.left!=null){
                    queue.add(current.left);
                }
                if(current.right!=null){
                    queue.add(current.right);
                }
            }

        }
return height;
    }

    public static void main(String[] args) {
        FindHeight tree = new FindHeight();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left=new Node(8);

        System.out.println(maxHeight(tree.root));
        System.out.println(maxHeightIteration(tree.root));


    }

}
