package Recursion;

public class PrimeInARange {
    public static void main(String[] args) {
printPrimes(2,100);
    }
    public static void printPrimes(int n,int m){
        for (int i = n; i < m+1; i++) {
            if(isPrimeRecur(i,(int)Math.sqrt(i)+1)){
                System.out.print(i + ",");
            }
        }
    }
    public static boolean isPrimeRecur(int n,int num){
        if(num==1||n==2){
            return true;

        }
        if(n%num==0){
            return false;

        }
        return isPrimeRecur(n,num-1);


    }

}
