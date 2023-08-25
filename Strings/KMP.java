package Strings;

import java.util.ArrayList;
import java.util.List;

public class KMP {
    public static void main(String[] args) {
//        int [] ans = computeWeight("aabaabaaa");
//        for (int a:
//             ans) {
//            System.out.print(a);

        System.out.println(search("aadabcddabc","abc"));



    }
    public static int [] computeWeight(String pattern){
        int [] weightArray = new int[pattern.length()];
        int i=1;
        int j =0;
        weightArray[0]=0;
        while(i<pattern.length()){
            if(pattern.charAt(i)==pattern.charAt(j)){
                weightArray[i]=j+1;
                i++;
                j++;
            }
            else{
                if(j==0){
                    weightArray[i]=0;
                    i++;
                }
                else{
                    j=weightArray[j-1];

                }
            }


        }
        return weightArray;



    }

    public static List<Integer> search(String text, String pattern){
        int [] weightArray= computeWeight(pattern);
        List<Integer> list = new ArrayList<>();
        int i =0;
        int j=0;
        while(i<text.length()){
            if(pattern.charAt(j)==text.charAt(i)){
                i++;
                j++;
                if(j==pattern.length()){
                  list.add(i-j);
                  j=0;
                }


            }
            else{
                if(j==0){
                    i++;
                }
                else{
                    j = weightArray[j-1];

                }

            }

        }
        return list;

        //Youtube comment
        // why is j==arr[j-1;]
        //because we are checking what length of prefix from the start had matched upto j-1
        //this is because we had matched upto j-1 and we want to know upto which index/length it had matched with prefix from start
        //
//        Basically  to understand what happens at 9:40 -
//
//                Useful to understand -
//
//                Value stored in the array at index "i" - Length of prefix matched ( from the start , hence we do A[i] = j+1 ) upto that index i.
//
//        "j" index - this is actually the length of the prefix matched from the start. This index keeps on getting reset ( not always to 0 )  .
//
//        "i" index - this is just iterating through every character of the substring.
//
//
//
//        1) We increment "i" whenevr there is a mismatch ( A[j] != A[i] )
//        and j=0 or if there is a match ( A[j]==A[i]  ,in which case j++ is also done )
//
//        2)  We "reset" "j" whenever there is a mismatch ( A[i] != A[j] )
//        But how do we reset it ?
//
//                Key logic -  Go to index j-1. look at A[j -1 ] , this gives prefix length matched upto current "i-1".
//                Hence we start checking from A[A[j-1]] against current character at "i".
//
//                To convince yourself of this , think of "j" and "i" moving together when they match characters.
//


    }
}
