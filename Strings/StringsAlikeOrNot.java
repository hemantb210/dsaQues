package Strings;

import java.util.Locale;

public class StringsAlikeOrNot {
    public static void main(String[] args) {
        System.out.println(isAlike("ae"));
    }
    public static boolean isAlike(String s){
        if(s.length()%2!=0){
            return false;
        }
        else{
            String part1= s.substring(0,s.length()/2);
            String part2= s.substring(s.length()/2);
            if(countVowels(part1)==countVowels(part2)){
                return true;
            }
        }
        return false;
    }
    public static int countVowels(String s){
        s=s.toLowerCase(Locale.ROOT);
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }

}

