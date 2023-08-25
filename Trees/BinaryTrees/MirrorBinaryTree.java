package Trees.BinaryTrees;
import Trees.BinaryTrees.Traversals.*;
public class MirrorBinaryTree {
    public static void main(String[] args) {

    }
    public void findMirror(Node root)
    {
        helper(root);
    }
    Node helper(Node node){
        if(node==null) return null;
        Node left= helper(node.left);
        Node right=helper(node.right);
        node.left=right;
        node.right=left;
        return node;
    }

}
