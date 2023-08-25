package Trees.BinaryTrees;
import Trees.BinaryTrees.Traversals.*;
public class LowestCommonAncestor {
    public static void main(String[] args) {
       Node root = new Node(10);
       root.left = new Node(11);
      root.left.left = new Node(7);
      root.right = new Node(9);
      root.right.left = new Node(15);
      root.right.right = new Node(8);
      System.out.println(findAncestor(root,15,8).data);
    }
    public static Node findAncestor(Node root,int a, int b){
        if(root==null||root.data==a||root.data==b){
            return root;
        }
        Node left=findAncestor(root.left,a,b);
        Node right=findAncestor(root.right,a,b);
        if(left==null){
            return right;
        }
        else if(right==null){
            return left;
        }
        else{
            return root;
        }
    }
}
