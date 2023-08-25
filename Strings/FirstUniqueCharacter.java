package Strings;

import java.util.Arrays;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        System.out.println(findUniqueChar("aabbcdcce"));
    }

    private static int findUniqueChar(String s) {
        int [] arr = new int[256];
        for(int i=0;i<s.length();i++){
        arr[s.charAt(i)]++;

        }
        for(int i =0;i<s.length();i++){
            if(arr[s.charAt(i)]==1){
                return i;
            }
        }
        return -1;


    }

}
