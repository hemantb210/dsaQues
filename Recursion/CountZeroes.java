package Recursion;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(count(20));
        System.out.println(countRecur(200089090,0));
    }
    public static int count(int n){
        int count=0;
     while(n>0){
         if(n%10==0){
             count++;
         }
         n=n/10;

     }
        return count;
    }

    public static int countRecur(int n,int count){

        if(n==0){
            return count;
        }
        if(n%10==0){  count ++;

        }
        return countRecur(n/10,count);

    }
}
