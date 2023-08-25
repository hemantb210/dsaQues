package Trees.BinaryTrees;

import java.util.*;

public class LeftView {

    class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
    class Tree
    {
        //Function to return list containing elements of left view of binary tree.
        ArrayList<Integer> leftView(Node root)
        {
            // Your code here
            Node node =root;
            //add code here.
            ArrayList<Integer>list = new ArrayList<>();
            if(node==null){
                return list;

            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(node);

            while(!queue.isEmpty()){
                int size = queue.size();
                int tempsize=size;
                while(size>0){
                    size--;
                    Node temp=queue.poll();
                    if(size==tempsize-1){
                        list.add(temp.data);
                    }
                    if(temp.left!=null)
                    {queue.add(temp.left);}
                    if(temp.right!=null){
                        queue.add(temp.right);
                    }
                }

            }
            return list;
        }


    }
}
