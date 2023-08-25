package Trie;

public class LongestWordWithAllPrefixes {
    static class Node{
        Node children[];
        boolean eow;
        public Node()
        {
            children= new Node[26];
            eow=false;
        }}
    static Node root = new Node();
    static Node current = root;
    static String ans = new String();
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

    public static void longestWord(Node current,StringBuilder temp){

        if(current==null){
            return;
        }
        for (int i = 0; i < 26; i++) {
            if(current.children[i]!=null&&current.children[i].eow){
                temp.append((char)(i+'a'));
                if(ans.length()<temp.length()){
                    ans=temp.toString();
                }
                 longestWord(current.children[i],temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }


    }

    public static void main(String[] args) {
        String [] words = {"a","ap","app","appl", "appla","apple","b","ba","ban","abana","banan","banana"};
        for (int i =0;i< words.length;i++){
            insert(words[i]);
        }


        longestWord(current,new StringBuilder(""));
        System.out.println(ans);


    }


}
