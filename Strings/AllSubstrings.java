package Strings;

import java.util.ArrayList;
import java.util.List;

//print only palindromes
public class AllSubstrings {

    public static void main(String[] args) {
        String string= "aabbccbb";

        printSubstrings(string);
        System.out.println();
        approach2(string);
    }
    public static void printSubstrings(String string){
        for(int i=0; i<string.length();i++){
            for(int j=i+1;j<=string.length();j++){
//                if(isPalindrome(string.substring(i,j)))
                {
                System.out.print(string.substring(i,j) +",");}

            }
        }
    }
    public static boolean isPalindrome(String s){
        int i =0;
        int j=s.length()-1;
        while(i<=j) {
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;


    }

     public static void approach2(String string){

        for(int i=0; i<string.length();i++){
            String s="";
            for (int j = i; j < string.length(); j++) {
                s+=string.charAt(j);
//                if(isPalindrome(s))
                {
                System.out.print(s + " ");}
            }
        }

     }
}
