package Trie;

public class NumberOfWords {
    static Node root = new Node();
    static Node current = root;

    static class Node{
        Node children[];
        boolean eow;
        public Node(){
            children= new Node[26];
            eow=false;
        }
    }
    public static void insert(String s){
        Node current = root;

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i)-'a';
            if(current.children[index]==null){
                current.children[index]= new Node();
            }
            if(i==s.length()-1){
                current.children[index].eow= true;
            }
            current= current.children[index];
        }

    }
    public static int count(Node current){
        int count =0;
        for (int i = 0; i < 26; i++) {
            if(current.children[i]!=null){
                if(current.children[i].eow){
                    count++;
                }
//                count++;
                count+=count(current.children[i]);
            }
        }
        return count;
    }



    public static void main(String[] args) {
        String [] words = {"apple","app","ban","banana","cat"};
        for (String s : words)
        { insert(s);
        }
        System.out.println(count(current));
    }

}
