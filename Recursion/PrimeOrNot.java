package Recursion;

public class PrimeOrNot {

    public static void main(String[] args) {
        System.out.println(isPrime(9993947));
        int n =9993947;
        System.out.println(isPrimeRecur(n,(int)Math.sqrt(n)+1));
    }
    public static boolean isPrime(int n){
        int root = (int)Math.sqrt(n);

        for(int i=2; i<=root;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPrimeRecur(int n,int num){
        if(num==1){
            return true;

        }
        if(n%num==0){
            System.out.println(num);
            return false;

        }
        return isPrimeRecur(n,num-1);


    }
}
