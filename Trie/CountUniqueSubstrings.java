package Trie;

//uniques prefixes of suffixes= unique substrings
//total nodes of trie= count of unique prefixes
//use two loops and put into hashset
public class CountUniqueSubstrings {
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


    public static int countUnique(Node current){
        if(current==null){
            return 0;
        }
        int count =0;
        for (int i = 0; i < 26; i++) {
            if(current.children[i]!=null){
               count+=countUnique(current.children[i]);
            }
        }
        return count+1;
    }
    public static int countUnique2(Node current,int count){
        for (int i = 0; i < 26; i++) {
            if(current.children[i]!=null){
                count = countUnique2(current.children[i],count+1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s= "ababa";
          for (int i=0;i<s.length();i++){
              insert(s.substring(i));}
        System.out.println(countUnique(current));
          int count =1;
       count = countUnique2(current,count);
        System.out.println("count " +count);
    }
}
