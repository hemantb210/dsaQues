package Trees.BinaryTrees;
import java.util.*;

public class NodesAtDistanceKFromRoot {

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
    public static List<Integer> printNodes(Node node,int currentLevel,int targetLevel,List<Integer> list){
        if(node==null){
            return list;
        }
        if(currentLevel==targetLevel){
            list.add(node.data);
            return list;
        }
        printNodes(node.left,currentLevel+1,targetLevel,list);
        printNodes(node.right,currentLevel+1,targetLevel,list);
return list;

    }


    public static void printNodesQ(Node node,int k){
        if(node==null){
            return;
        }
        if(node.left==null&node.right==null){
            System.out.println(node.data);
        }
        int count=0;
        Queue<Node> queue= new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            count++;
            if(count==k){
                int size = queue.size();
                while(size>0){
                    size--;
                    System.out.print(queue.remove().data + " ");
                }
                break;
            }
            else {
                int size = queue.size();
                while(size>0){
                    size--;
            Node temp= queue.remove();
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }}

            }
        }
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
        System.out.println(printNodes(root,1,3,new ArrayList<>()));
        printNodesQ(root,3);
    }

}
