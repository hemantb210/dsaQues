package Trees.BinaryTrees;

public class BoundaryTraversal {
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

    static void printLeftNodes(Node node){
        if(node==null){
            return;
        }
        if(node.left!=null){
            System.out.print(node.data + " ");
            printLeftNodes(node.left);
        }
        else if(node.right!=null){
            System.out.print(node.data + " ");
            printLeftNodes(node.right);
        }

    }
    static void printRightNodes(Node node){
       if(node==null){
           return;
       }
        if(node.right!=null){
        printRightNodes(node.right);
        System.out.print(node.data + " ");
        }
        else if(node.left!=null){
            printRightNodes(node.left);
            System.out.print(node.data+ " ");
        }

    }
    static void printLeaves(Node node){
        if(node==null){
            return;
        }

            printLeaves(node.left);

        if(node.left==null&&node.right==null){
            System.out.print(node.data + " " );
        }

            printLeaves(node.right);



    }


    public static void boundaryTraversal(Node node){
if(node==null){
    return;
}
System.out.print(node.data + " " );
printLeftNodes(node.left);
printLeaves(node.left);
printLeaves(node.right);
printRightNodes(node.right);



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
        boundaryTraversal(root);
    }
}
