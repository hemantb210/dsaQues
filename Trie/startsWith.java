package Trie;

public class startsWith {

    static class Node{
        Node children[];
        boolean eow;
        public Node()
        {
            children= new Node[26];
            eow=false;
        }}
    static Node root = new Node();
    public static void insert(String s){
        Node current = root;
        for (int i = 0; i <s.length() ; i++) {
            int index = s.charAt(i) -'a';
            if(current.children[index]==null){
                current.children[index]= new Node();
            }
            if(i==s.length()-1){
                current.children[index].eow=true;
            }
            current= current.children[index];

        }



    }
    public static void main(String[] args) {
        String [] words = {"bub","ban", "bus"};
        for (int i =0;i< words.length;i++){
            insert(words[i]);
        }
        System.out.println(startsWith("bl"));
    }
    public static boolean startsWith(String prefix){
     Node current = root;
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i)-'a';
            if(current.children[index]==null){
                return false;
            }
            current= current.children[index];
        }
        return true;

    }
}
