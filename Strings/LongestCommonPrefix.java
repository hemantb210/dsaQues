package Strings;

import java.sql.SQLOutput;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] arr = {"like","liking","likle","likkkk"};
        find (arr);

    }
    public static void find(String[] arr){
        int minLength = arr[0].length();
        String temp="";
        for (String s :
             arr) {
            if(s.length()<minLength){
                minLength= s.length();
            }
        }
//        first:
//       for(int i =0; i< minLength;i++){
//           for (int j = 0; j < arr.length-1 ; j++) {
//               if(arr[j].charAt(i)!=arr[j+1].charAt(i)){
//                   break first;
//               }
//           }
//           temp+=arr[0].substring(i,i+1);
//
//           }
//        System.out.println(temp);
        String ans = "";
        for (int i = 0; i < minLength; i++) {

            char current = arr[0].charAt(i);
            for (int j = 0; j < arr.length; j++) {
                if(arr[j].charAt(i)!=current){
                    System.out.println(ans);
                    return;
                }

            }
            ans+=current;
        }
        if(ans.isEmpty()){
            System.out.println("No LCP found");
        }
        else System.out.println(ans);

       }


    }

