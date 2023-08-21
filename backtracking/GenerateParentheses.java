package backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args) {
generate(3);
    }

    public static void generate(int n){

        List<String> res = new ArrayList<>();
             helper(res,"",0,0,n);
        System.out.println(res);



    }

    static void helper(List<String> res, String currentString, int open, int close, int max) {
   if(currentString.length()==2*max){
       res.add(currentString);
       return;
   }

   if(open<max){
       helper(res, currentString+'(' , open+1,close,max);

   }
   if(close<open){
       helper(res, currentString+')' , open,close+1,max);
   }
    return;

    }
}
