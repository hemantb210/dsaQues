package Recursion;
import sun.swing.BakedArrayList;

import java.util.*;
public class DiceGame {
    public static void main(String[] args) {
        Integer count = new Integer(0);
        count =findWays(7);
        System.out.println(count);
        System.out.println(listOfWays(0,4));
    }
    public static int findWays(int n){

        if(n==0)
            return 1;
        int count =0;
        for(int i=1;i<=6;i++){
            if(n-i>=0)
             count =count+findWays(n-i);
        }
        return count;
    }
    public static ArrayList<String> listOfWays(int currentValue,int target)
    {
        if(currentValue==target){
            ArrayList<String> arr= new ArrayList<>();
            arr.add("");
            return arr;
        }
        if(currentValue>target){
            ArrayList<String> arr= new ArrayList<>();
            return arr;
        }
        ArrayList<String> result = new ArrayList<>();

        for(int i =1;i<=6;i++){
            ArrayList<String> temp =  listOfWays(currentValue+i,target);
            for(String s: temp){
                result.add(i+s);
            }

        }
        return result;


    }
}

