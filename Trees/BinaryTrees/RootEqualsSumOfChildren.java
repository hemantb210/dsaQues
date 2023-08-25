package Trees.BinaryTrees;

public class RootEqualsSumOfChildren {
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
    public static void main(String[] args) {
        root = new Node(10);
        root.left=new Node(10);
//        root.right=new Node(6);
//        root.left.left=new Node(2);
//        root.left.right=new Node(2);
//        root.right.left=new Node (9);
//        root.right.right=new Node(10);
//        root.left.left.left=new Node(11);
//        root.left.left.right=new Node(12);
//        root.left.right.left=new Node(13);
//        root.left.right.right=new Node(14);
        System.out.println(isSumProperty(root));
    }
    public static int isSumProperty(Node node){
        if(node==null){
            return 1;
        }


        if(isSumProperty(node.left)==1&& isSumProperty(node.right)==1){
            if(node.left!=null&&node.right!=null){
                if(node.left.data+node.right.data==node.data){
                    return 1;
                }}
            else if(node.left==null&&node.right==null){
                return 1;
            }
            else if(node.left!=null&&node.right==null){
                if(node.left.data==node.data){
                    return 1;
                }
            }
            else if((node.left==null&&node.right!=null)){
                if(node.right.data==node.data){
                    return 1;
                }
            }
        }
      return 0;
    }


}
