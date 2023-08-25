package Trees.BinaryTrees;
import Trees.BinaryTrees.BoundaryTraversal.Node;

public class BalanceTree {
    static boolean ans;

    public static boolean isBalanced(Node node){
        if(node==null) return true;
        if(isBalanced(node.left)&& isBalanced(node.right)){
       if(Math.abs((height(node.left)-height(node.right)))<=1){
           return true;
       }}

       return false;
    }
    public static int height(Node node){
        if(node==null){
            return 0;
        }
        int heightL=height(node.left);
        int heightR=height(node.right);
        return 1+ Math.max(heightL,heightR);
    }
    public static int isBalanced2(Node node){
        if(node==null){
            return 0;
        }
        int left= isBalanced2(node.left);
        if(left==-1) return -1;
        int right= isBalanced2(node.right);
        if(right==-1) return -1;
        if(Math.abs(left-right)>1) return -1;
        else return Math.max(left,right)+1;
    }

    public static void main(String[] args) {


    }
}
