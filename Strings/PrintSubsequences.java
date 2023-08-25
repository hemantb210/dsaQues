package Strings;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsequences {
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
       print("abcdef",ans);
        System.out.println(ans);
        System.out.println(ans.size());
    }
    public static void print(String s, List<String> list){
        if(s.length()==0){
            list.add(s);
            return;
        }
        else{
        char current = s.charAt(0);

        print(s.substring(1),list);
        int size = list.size();
        for(int i =0;i<size;i++){
            list.add(current+ list.get(i));
        }}
    }




}
