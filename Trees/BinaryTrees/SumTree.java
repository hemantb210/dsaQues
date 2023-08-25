package Trees.BinaryTrees;
import Trees.BinaryTrees.BoundaryTraversal.Node;
import java.util.*;

public class SumTree {
    public static int  sum(Node node){
        if(node==null){
            return 0;
        }
         int sumLeft= sum(node.left);
         int sumRight=sum(node.right);
         int currentValue= node.data;
        node.data=sumLeft+sumRight;
        return node.data+currentValue;

    }
    static void bfs(Node node){
        if (node == null) {
        return;}
        Queue<Node> queue= new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node temp=queue.poll();
            System.out.print(temp.data+ " ");
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }


    }
static Node root;
    public static void main(String[] args) {
       root= new Node(10);
       root.left=new Node(-1);
       root.right=new Node(3);
       root.left.left=new Node(4);
       root.left.right=new Node(5);
        root.right.left=new Node(-2);
        bfs(root);
        sum(root);
        System.out.println();
        bfs(root);

    }
}
