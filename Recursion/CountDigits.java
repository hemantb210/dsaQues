package Recursion;

public class CountDigits {

    public static void main(String[] args) {
        System.out.println( count(234343));
        System.out.println(countRecur(234234));
        int count=0;
        System.out.println( countRecur2(2324343,count));

    }
    public static int count(int n){

        int count=0;
        while(n>0){
            n=n/10;
            count++;

        }
        return count;

    }
    public static int countRecur(int n){
        if(n==0){
            return 0;
        }
        int count = 1+ countRecur(n/10);

    return count;}


    public static int countRecur2(int n,int count){
        if(n==0){
            return count;
        }
        n=n/10;
        count++;
        return countRecur2(n,count);


    }
}
