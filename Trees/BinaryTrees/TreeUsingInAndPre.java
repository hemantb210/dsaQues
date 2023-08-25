package Trees.BinaryTrees;
import java.util.*;
import Trees.BinaryTrees.Traversals.*;

public class TreeUsingInAndPre {
    public static void main(String[] args) {
        int [] inorder= {4,2,5,1,6,3,7};
        int [] preorder= {1,2,4,5,3,6,7};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length;i++){
            map.put(inorder[i],i );
        }
        Node root = makeATree(inorder,0,inorder.length-1,preorder,0,preorder.length-1,map);
    }

    private static Node makeATree(int[] inorder, int is, int ie, int[] preorder, int ps, int pe, Map<Integer, Integer> map) {
        Node root = new Node(preorder[ps]);
        int newEnd= map.get(preorder[ps]);
        int leftElements = newEnd-is;
        root.left= makeATree(inorder,is,newEnd-1,preorder,ps+1,ps+leftElements,map);
        root.right=makeATree(inorder, newEnd+1,ie, preorder,ps+leftElements+1,pe,map);
return root;
    }

}
