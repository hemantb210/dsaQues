package Strings;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1= "Sabcc ut";
        String s2= "ut Sabcc";
        System.out.println(isAnagram(s1,s2));
    }

    //approach 1 : convert to char arrays, sort them, convert to string and compare
    private static boolean isAnagram(String s1, String s2) {
        int [] arr = new int [256];
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i)]++;
        }
        for (int i = 0; i <s2.length() ; i++) {
            arr[s2.charAt(i)]--;
        }
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }

        return true;

    }

}
