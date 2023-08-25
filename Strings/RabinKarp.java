package Strings;

import java.util.ArrayList;
import java.util.List;

public class RabinKarp {

    public static void main(String[] args) {
        System.out.println(patternMatch("abcnsdhjabc","abc"));

    }
    public static long hash(String str) {
        long hashValue = 0;
        int m = str.length();
        for(int i =0; i<m;i++){
            hashValue+= str.charAt(i)* Math.pow(10,i);

        }
        return hashValue;
    }
    public static List<Integer> patternMatch(String text, String pattern){
        int n = pattern.length();
        int flag =0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < text.length()-n+1; i++) {
            long hashText=hash(text.substring(i,i+n));
            long hashPattern= hash(pattern);
            if(hashText==hashPattern){
                for (int j = 0; j <n ; j++) {
                    if(pattern.charAt(j)!=text.substring(i,i+n).charAt(j)){
                        flag=1;
                        break;
                    }
                }
               if(flag==0){
                   list.add(i);
               }

            }
        }
    return list;


    }
}
