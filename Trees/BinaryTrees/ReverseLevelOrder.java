package Trees.BinaryTrees;

public class ReverseLevelOrder {
static Node root=null;
    public static void main(String[] args) {
        root = new Node(3);
        root.left=new Node(4);
        root.right=new Node(5);
        root.left.left=new Node(6);
        root.left.right=new Node(7);
        root.right.left=new Node(9);
        root.right.right=new Node(10);
       recur(root);
        System.out.println();
       recurLevelOrder(root);
    }
    static class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
    public static void recur(Node node){
        int height= findHeight(node);
        for(int i=height;i>=1;i--){
            printlevel(node,i);
        }

    }

    private static void printlevel(Node node, int level) {
        if(node==null){
            return;
        }
        if(level==1){
            System.out.print(node.data + " ");
        }
        printlevel(node.left,level-1);
        printlevel(node.right,level-1);


    }

    private static int findHeight(Node node) {
    if(node==null){
        return 0;
    }
    return Math.max(findHeight(node.left),findHeight(node.right))+1;


    }

    private static void recurLevelOrder(Node node){
        int height= findHeight(node);
        for(int i=1;i<=height;i++){
            printlevel(node,i);
        }

    }


}
