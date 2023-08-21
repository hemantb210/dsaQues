package Recursion;
import java.util.*;
public class StringSubsequences {

    public static void main(String[] args) {
        ArrayList<String> arr= new ArrayList<>();
        printStringSubsequences("ravi",arr);
        System.out.println(arr);

    }

    public static void printStringSubsequences(String s, ArrayList<String> list){
        if(s.length()==0){
        list.add("");
        return;
        }
        char first = s.charAt(0);
        printStringSubsequences(s.substring(1),list);
        int size= list.size();
        for(int i =0;i<size;i++){
            list.add(first+list.get(i));
        }
    }
}
