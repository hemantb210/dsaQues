package backtracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
 /*   Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

    A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.*/


    static String [] keys ={"","","abc","def","ghi","jkl", "mno","pqrs","tuv","wxyz"};

    public static List<String> findLetterCombinations(String digits){
        //base case
       if (digits.length()==0){
           List<String> list = new ArrayList<>();
           list.add("");
           return list;
       }

       char firstDigit = digits.charAt(0);
       int index = firstDigit -'0';
       String remainingDigit = digits.substring(1);
       String currentString = keys[index];
       List<String> ans = new ArrayList<>();

       for (int i=0; i<currentString.length();i++){
          List <String > res = findLetterCombinations(remainingDigit);
           for(String s :res){
               ans.add(currentString.charAt(i)+ s);
           }
       }
return ans ;
    }

    public static void main(String[] args) {
        List<String> list = findLetterCombinations("13");
        System.out.println(list);
    }


        }





