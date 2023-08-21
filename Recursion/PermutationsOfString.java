package Recursion;
import java.util.*;
public class PermutationsOfString {

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        ArrayList<String> list= new ArrayList<>();
        String s="abc";
        String ansStr="";
       findPermutations(s,list,ans,new int[s.length()]);
        findPermutations2(s,list,ansStr,new int[s.length()]);
        System.out.println(ans);
        System.out.println(list);

    }
    public static void findPermutations(String s,ArrayList<String> list,ArrayList<ArrayList<String>> ans,int[] visited){
     if(list.size()==s.length()){
         ans.add(new ArrayList(list));
         return;
     }
     for(int i =0;i<s.length();i++){
         if(visited[i]==0){
             visited[i]=1;
             list.add(""+s.charAt(i));
             findPermutations(s,list,ans,visited);
             list.remove(list.size()-1);
             visited[i]=0;
         }

     }



    }
    public static void findPermutations2(String s,ArrayList<String> list,String  ans,int[] visited){
        if(ans.length()==s.length()){
            list.add(ans);
            return;
        }
        for(int i =0;i<s.length();i++){
            if(visited[i]==0){
                visited[i]=1;
                ans= ans+s.charAt(i);
                findPermutations2(s,list,ans,visited);
//                System.out.println("str " +ans);
                ans = ans.substring(0,ans.length()-1);
                visited[i]=0;
            }

        }



    }
}
