package Trees.BinaryTrees;
import java.util.*;
import Trees.BinaryTrees.Traversals.*;

import Trees.BinaryTrees.Traversals;

public class TreeUsingInPost {
    public static void main(String[] args) {
        root= new Node(1);
        root.left= new Node(2);
        root.left.left= new Node(3);
        root.left.right= new Node(4);
        root.right= new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);
        int [] inorder = {4,2,5,1,6,3,7};
        int [] postorder= {4,5,2,6,7,3,1};
        construct(inorder,postorder);
    }
    static Node root;
    public static void construct(int [] inorder,int [] postorder){
        if(inorder==null||postorder==null||inorder.length!=postorder.length){
            return;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length;i++){
            System.out.println(inorder[i]);
            System.out.println("i " +i );
            map.put(inorder[i],i);
        }
        System.out.println(map);
        Node rootNode =constructTree(inorder,0, inorder.length-1, postorder,0,postorder.length-1,map);
      Traversals traversals= new Traversals();
      traversals.LevelOrder(rootNode);

    }



    public static Node constructTree(int[] inorder, int is,int ie,int[] postorder,int ps,int pe,Map<Integer,Integer> map){
         if(is>ie||ps>pe){
             return null;
         }
         Node newNode = new Node(postorder[pe]);
         int newEnd= map.get(postorder[pe]);
         int leftElements= newEnd-is;
         newNode.left= constructTree(inorder,is,newEnd-1,postorder,ps,ps+leftElements-1,map);
         newNode.right=constructTree(inorder,newEnd+1,ie,postorder,ps+leftElements,pe-1,map);
         return newNode;

    }
}
