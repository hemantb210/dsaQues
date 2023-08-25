package Trees.BinaryTrees;

public class Diameter {
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
    static int ans=0;
    public static int height(Node node){

        if(node==null){
            return 0;
        }
        int heightL= height(node.left);
        int heightR=height(node.right);
        ans = Math.max(ans,heightR+heightL+1);
        return Math.max(heightL,heightR)+1;

    }

    public static int count(Node node){
        int diameter=0;
        diameter =height(node);
        return ans;
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
    }
}
