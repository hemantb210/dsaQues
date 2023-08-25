package Trie;


import java.sql.SQLOutput;
import java.util.Locale;

public class LongestCommonPrefix {

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

    public static int[] count(Node current){
        int count =0;
        int index =0;
        for (int i = 0; i < 26; i++) {
            if(current.children[i]!=null){
                index=i;
                count++;
            }
        }
        return new int[]{count,index};
    }

    public static void main(String[] args) {
        String [] words = {"ap","aple", "appu"};
        for (int i =0;i< words.length;i++){
            insert(words[i]);
        }
        System.out.println(longestCommonPrefix(root,""));
    }

    public static String longestCommonPrefix(Node current,String ans){
        int[] countArr = count(current);


        if(countArr[0]<=1){
            int index = countArr[1];
            ans += (char)(index+'a');
            return longestCommonPrefix(current.children[index],ans);
        }
        else{
        return ans;}
    }

}
