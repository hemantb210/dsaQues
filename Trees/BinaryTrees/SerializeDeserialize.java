package Trees.BinaryTrees;
import Trees.BinaryTrees.Traversals.*;
import java.util.*;

public class SerializeDeserialize {

    public void serialize(Node root, ArrayList<Integer> A)
    {
        //code here
        if(root==null) return ;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node current = queue.poll();
            if(current==null){
                A.add(0);
                continue;
            }

            queue.add(current.left);
            queue.add(current.right);
            A.add(current.data);
        }

    }

    //Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> A)
    {
        //code here
        Queue<Node> queue = new LinkedList<>();
        Node rootNode = new Node(A.get(0));
        queue.add(rootNode);
        for(int i =1;i<A.size();i++){
            Node parent = queue.poll();
            if(A.get(i)!=0){
                Node leftNode = new Node(A.get(i));
                parent.left=leftNode;
                queue.add(leftNode);
            }
            if(A.get(++i)!=0){
                Node rightNode = new Node(A.get(i));
                parent.right=rightNode;
                queue.add(rightNode);
            }
        }
        return rootNode;

    }
}
