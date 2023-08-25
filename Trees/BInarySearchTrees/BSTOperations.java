package Trees.BInarySearchTrees;

public class BSTOperations {
    public static class TreeNode {
      int val;
     TreeNode left;
     TreeNode right;
      TreeNode() {}
     TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
          this.right = right;
      }
 }

    public static TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode rootNode= root;
        if(root==null){
            TreeNode newNode= new TreeNode(val);
            return newNode;
        }
        if(root.val>val)
            root.left=insertIntoBST(root.left,val);
        else if(root.val<val)
            root.right=insertIntoBST(root.right,val);
        return root;
    }
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null){
            return null;
        }
        if(root.val==val)
        { return root;}
        if(root.val>val){
            return searchBST(root.left,val);
        }
        else
            return searchBST(root.right,val);

    }
    int minValue(TreeNode node) {
        if(node==null){
            return -1;
        }
        if(node.left==null){
            return node.val;
        }
        return minValue(node.left);
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
        {return root;}
        if(root.val==key){
            return helper(root);
        }
        else if (root.val>key){
            if(root.left!=null&&root.left.val==key){
                root.left= helper(root.left);
            }
            else{
                deleteNode(root.left,key);
            }
        }
        else if(root.val<key){
            if(root.right!=null&&root.right.val==key){
                root.right=helper(root.right);
            }
            else{
                deleteNode(root.right,key);
            }
        }
        return root;
    }
    public TreeNode helper(TreeNode node){
        if(node.left==null){
            return node.right;
        }
        else if(node.right==null){
            return node.left;
        }
        else{
            TreeNode rightOfTarget= node.right;
            TreeNode leftOfTarget= node.left;
            TreeNode rightMostOnTheLeft= findRightMost(leftOfTarget);
            rightMostOnTheLeft.right=rightOfTarget;
            return leftOfTarget;
        }}
    public TreeNode findRightMost(TreeNode node){
        if(node.right==null)
        { return node;}
        return findRightMost(node.right);
    }
}
