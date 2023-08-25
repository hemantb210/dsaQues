package Trees.BinaryTrees;
import Trees.BinaryTrees.BoundaryTraversal.Node;
import java.util.*;
public class Ancestors {
    static Node root;
    static Stack<Integer> stack = new Stack<>();
    static boolean found=false;

    public static ArrayList<Integer> Ancestors(Node root, int target)
 {
    ArrayList<Integer> list = new ArrayList<>();
        if(root==null) return list;
        if(AncestorsHelper(root,target,list));
             return list;
//    return AncestorsHelper2(root,target,new ArrayList<>());

    }
    public static boolean AncestorsHelper(Node node,int target, ArrayList<Integer> list){
        if(node==null){
            return false;
        }
        if(node.data==target){

            return true;
        }
        if(AncestorsHelper(node.left,target,list)||AncestorsHelper(node.right,target,list)){
            list.add(node.data);
            return true;
        }
        return false;
    }


    //    private static void Ancestors(Node node,int target){
//        if(node==null) {return;}
//        stack.push(node.data);
//        if(!stack.isEmpty()&&stack.peek()==target){
//            while(!stack.isEmpty()){
//                System.out.println(stack.pop());
//            }
//            return;
//        }
//        Ancestors(node.left,target);
//        Ancestors(node.right,target);
//        if(!stack.isEmpty())
//        stack.pop();
//
//
//    }
    public static void main(String[] args) {
        root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        System.out.println(Ancestors(root,5));

    }
}
