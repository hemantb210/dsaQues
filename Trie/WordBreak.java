package Trie;

public class WordBreak {
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
    public static boolean search(String s){
        Node current = root;

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i)-'a';
            if(current.children[index]==null){
                return false;
            }
            if((i==s.length()-1)&& current.children[index].eow==false){
                return false;
            }
            current = current.children[index];


        }
        return true;
    }

    public static boolean wordBreaker(String key){
        if(key.length()==0){
            return true;
        }

        for(int i =1;i<=key.length();i++){
            String part1 = key.substring(0,i);
            String part2= key.substring(i);
            if (search(part1)&& wordBreaker(part2)){
                return true;
            }

        }
        return false;

    }


    public static void main(String[] args) {
        String [] words = {"b"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        String key= "a";
        System.out.println(wordBreaker(key));
    }


}
