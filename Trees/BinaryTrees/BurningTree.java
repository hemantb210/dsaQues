package Trees.BinaryTrees;
import Trees.BinaryTrees.Traversals.*;
import java.util.*;

public class BurningTree {
    static Node root;
    public static void main(String[] args) {


    }
    public static int minTime(Node root,int target){

        Map<Node,Node> parentMap = new HashMap<>();
        Map<Node,Boolean> visitedMap= new HashMap<>();
        Node targetNode =find(root,target,parentMap,new Node(0));
        return burnFromTarget(targetNode,parentMap,visitedMap)-1;


    }
    public static Node find(Node node,int target,Map<Node,Node> parentMap,Node ans){
        if(node==null){
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node parent = queue.poll();
            if(parent.data==target){
                ans=parent;
            }
            if(parent.left!=null){
                queue.add(parent.left);
                parentMap.put(parent.left,parent);
            }
            if(parent.right!=null){
                queue.add(parent.right);
                parentMap.put(parent.right,parent);
            }
        }
        return ans;
    }
    public static int burnFromTarget(Node target,Map<Node,Node> parentMap,Map<Node,Boolean> visited){
        if(target==null){
            return 0;
        }
        visited.put(target,true);
        int left=0;
        int right=0;
        int parent=0;
        if(visited.get(target.left)==null){
            left= burnFromTarget(target.left,parentMap,visited);

        }
        if(visited.get(target.right)==null)
        {right=burnFromTarget(target.right,parentMap,visited);
        }
        if(visited.get(parentMap.get(target))==null){
            parent=burnFromTarget(parentMap.get(target),parentMap,visited);
        }
        return Math.max((Math.max(left,right)),parent)+1;
    }
}
