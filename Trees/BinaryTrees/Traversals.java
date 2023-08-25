package Trees.BinaryTrees;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.*;

public class Traversals {
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
    public static void LevelOrder(Node current){
        if(current==null){
            return;
        }
        if(current.left==null&&current.right==null){
            System.out.println(current.data);
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(current);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.print(temp.data+ " " );
            if(temp.left!=null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }

        }
    }
    public static void inOrder(Node current){
        if(current==null){
            return;
        }
        inOrder(current.left);
        System.out.print(current.data + " ");
        inOrder(current.right);

    }


    public static void inorderIter(Node current){
        Stack<Node> s = new Stack<>();
        while(!s.isEmpty()||current!=null){
            while(current!=null){
                s.push(current);
                current=current.left;
            }
            current=s.pop();
            System.out.print(current.data + " ");
            current=current.right;

        }
    }
    public static void preorderIter(Node current){

        Stack<Node> s= new Stack<>();

        while(!s.isEmpty()||current!=null){
            while(current!=null){
                System.out.print(current.data+ " ");
                s.push(current);
                current=current.left;
            }
            current=s.pop();
            current=current.right;


        }





    }
    public static void preorder(Node current){
        if(current ==null){
            return;
        }
        System.out.print(current.data + " ");
        preorder(current.left);
        preorder(current.right);

    }
    public static void postorder(Node current){
        if(current==null){
            return;
        }
        postorder(current.left);
        postorder(current.right);
        System.out.print(current.data + " ");

    }

    public static void spiral(Node current){
        if(current==null){return;}
        int turn=0;
        Deque<Node > queue = new ArrayDeque<>();
        queue.addLast(current);
        while(queue.isEmpty()==false)
        {
            int size = queue.size();
            while(size>0){
            size--;
            if(turn==1) {
                Node temp = queue.pollLast();
                System.out.print(temp.data + " ");
                if(temp.left!=null){
                    queue.addFirst(temp.left);
                }
                if(temp.right!=null){
                    queue.addFirst(temp.right);
                }
                if(size==0){
                    turn=0;
                }

            }
            else {
                Node temp = queue.pollFirst();
                System.out.print(temp.data + " ");

                if(temp.right!=null){
                    queue.addLast(temp.right);
                }if(temp.left!=null){
                    queue.addLast(temp.left);
                }

                if(size==0){
                    turn=1;
                }

            }
            }
        }


    }


    ArrayList<Integer> zigZagTraversal(Node root)
    {
        //Add your code here.
        ArrayList<Integer> list= new ArrayList<>();
        if(root==null){
            return list;
        }
        int size=0;

        Deque<Node> queue = new ArrayDeque<>();
        queue.add(root);
        int turn =0;
        while(!queue.isEmpty()){
            size=queue.size();
            if(turn==0){
                while(size>0){
                    size--;
                    Node temp= queue.pollFirst();
                    list.add(temp.data);
                    if(temp.left!=null){
                        queue.addLast(temp.left);
                    }
                    if(temp.right!=null){
                        queue.addLast(temp.right);
                    }

                }
                turn=1;

            }
            else{
                while(size>0){
                    size--;
                    Node temp= queue.pollLast();
                    list.add(temp.data);

                    if(temp.right!=null){
                        queue.addFirst(temp.right);
                    }
                    if(temp.left!=null){
                        queue.addFirst(temp.left);
                    }
                }

                turn=0;
            }}

        return list;
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node (6);
        root.right.right=new Node(7);
//        root.left.left.left=new Node(11);
//        root.left.left.right=new Node(12);
//        root.left.right.left=new Node(13);
//        root.left.right.right=new Node(14);
//    LevelOrder(root);
//        System.out.println();
    inOrder(root);
        System.out.println();
        preorder(root);
//        System.out.println();
//        postorder(root);
//        System.out.println();
//        spiral(root);
        System.out.println();
        inorderIter(root);
        System.out.println();
        preorderIter(root);



    }


}
