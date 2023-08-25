package Trees.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeImpl {
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
    static Node temp=root;

    public static void insert(Node temp, int key){
        if(temp==null){
            root = new Node(key);
            return;
        }
        Queue<Node> queue= new LinkedList<>();
        queue.add(temp);
        while(!queue.isEmpty()){
            Node current = queue.poll();
            if(current.left==null){
                current.left= new Node(key);
                break;
            }
            else{
                queue.add(current.left);
            }
            if(current.right==null){
                current.right=new Node(key);
                break;
            }
            else{
               queue.add(current.right);
            }

        }

    }


    void deletion(Node root, int key){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            root=null;
            return;
        }
        Queue<Node> q= new LinkedList<>();
        Node keyNode =null;
        Node lastNode=null;
        q.add(root);
        Node temp=null;
        while(!q.isEmpty()){
          temp= q.poll();
            if(temp.data==key)
            {
                keyNode=temp;
            }
            if(temp.left!=null){
                lastNode=temp;
                q.add(temp.left);
            }
            if(temp.right!=null){
                lastNode=temp;
                q.add(temp.right);
            }
        }
        if(keyNode!=null){
            keyNode.data=temp.data;
            if(lastNode.right==temp)
            {
                lastNode.right=null;
            }
            else {
                lastNode.left=null;
            }

        }


    }
    void inorder(Node temp){
        if(temp==null){
            return;
        }
        inorder(temp.left);
        System.out.print(temp.data + " ");
        inorder(temp.right);

    }

    public static void main(String[] args) {
      TreeImpl tree = new TreeImpl();
//        root = new Node(10);
//        root.left = new Node(11);
//        root.left.left = new Node(7);
//        root.right = new Node(9);
//        root.right.left = new Node(15);
//        root.right.right = new Node(8);
        tree.insert(root,10);
        tree.insert(root,8);
        tree.insert(root,0);
        tree.inorder(root);
        tree.insert(root,6);
        System.out.println();
        tree.inorder(root);
        tree.deletion(root,0);
        System.out.println();
        tree.inorder(root);
    }
}
