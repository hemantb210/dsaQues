package Recursion;

public class ArmstrongOrNot {
    public static void main(String[] args) {
        int n = 1634;
        System.out.println(isArmstrong(1634));
        int count =count(n);
        System.out.println(isArmstrongRecur(n,count));

    }
    public static boolean isArmstrong(int n){
        int num=n;
        int count = count(n);
        int sum=0;
       while(n>0){
           sum+=(int) Math.pow((n%10),count);
           n=n/10;

       }
       System.out.println(sum);
     if(sum==num){
         return true;
     }
     else
    return false;
    }

    public static int count(int n) {
       int count =0;
        while(n>0){
           n=n/10;
           count++;
       }
    return count;
    }
    public static boolean isArmstrongRecur(int n,int count){
        int sum=0;
        int num=n;
        sum=findSum(n,count,sum);
        if(sum==num){
            return true;
        }else return false;





    }
    public static int findSum(int n,int count,int sum){
        if(n==0){
            return sum;
        }
        int curr = n%10;
        n=n/10;
        sum += Math.pow(curr,count);
        return findSum(n,count,sum);
    }



}
