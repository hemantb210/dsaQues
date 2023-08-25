package Trees.BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RightView {

    class Node
    {
        int data;
        Node left, right;
        public Node(int data)
        {
            this.data = data;
            left = right = null;
        }
    }
    class Solution{
        //Function to return list containing elements of right view of binary tree.
        ArrayList<Integer> rightView(Node node) {
            //add code here.
            ArrayList<Integer>list = new ArrayList<>();
            if(node==null){
                return list;

            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(node);

            while(!queue.isEmpty()){
                int size = queue.size();
                while(size>0){
                    size--;
                    Node temp=queue.poll();
                    if(size==0){
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
