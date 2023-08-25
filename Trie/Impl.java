package Trie;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Impl {
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
    public static void print(Node current,List<String> list, String ans){
//        if(current==null){
//            return;
//        }
        if(current.eow){
            list.add(ans);
        }
        for (int i = 0; i < 26; i++) {
            if(current.children[i]!=null){
                ans+=(char)(i+'a');
                print(current.children[i],list,ans);
                ans = ans.substring(0,ans.length()-1);
            }
        }
        return;
    }
    public static Node delete(Node current,String s,int depth){
        if(current==null){
            return current;
        }
        if(depth==s.length()){
            if(!current.eow){
                return current;
            }
            else{
                current.eow=false;
                if(isEmpty(current))
                    current=null;
            }
            return current;

        }
        int index = s.charAt(depth)-'a';
        current.children[index]= delete(current.children[index],s,depth+1);

        if(isEmpty(current)&& !current.eow){
            current = null;
        }
        return current;
    }

    private static boolean isEmpty(Node current) {
         for(int i =0;i<26;i++){
             if(current.children[i]!=null){
                 return false;
             }

         }
        return true;
    }

    public static void main(String[] args) {
        String [] words = {"apple","app","orange","or","but"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        List<String>list = new ArrayList<>();
        print(current,list,"");
        System.out.println(list);
        Node current = root;
       System.out.println(delete(current,"apor",0));
        List<String> secondList= new ArrayList<>();
        print(current,secondList,"");
        System.out.println(secondList);
    }
}
