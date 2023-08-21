package Recursion;

public class ClimbStairs {

   public static int climbStairs(int n){

       if(n==0||n==1){
           return 1;
       }
       else return climbStairs(n-1)+climbStairs(n-2);
   }
    public static void main(String[] args) {
        int n = 10;
        int result = climbStairs(n);
        System.out.println(result);
    }



}
