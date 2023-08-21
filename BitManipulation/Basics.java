package BitManipulation;

public class Basics {

    public static void oddOrEven(int n){

        //& with 1 returns the bit itself
        if((n&1)==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }

    }

    public static void getIthBit(int n,int i){
        if((n&(1<<i))>0){
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }


    }
    public static void setIthBit(int n,int i){
        System.out.println(Integer.toBinaryString(n));
        int num = n|(1<<i);
        System.out.println(Integer.toBinaryString(num));

    }
    public static void clearIthBit(int n,int i){
        System.out.println(Integer.toBinaryString(n));
        int num = n&(~(1<<i));
        System.out.println(Integer.toBinaryString(num));

    }
    public static void clearMBits(int n,int m){
        System.out.println(Integer.toBinaryString(n));
        int num = n&((~0)<<m);
        System.out.println(Integer.toBinaryString(num));

    }

    public static void updateIthBit(int n,int i,int b){
        System.out.println(Integer.toBinaryString(n));
        int num = n&(~(1<<i));
        int res= num|(b<<i);
        System.out.println(Integer.toBinaryString(res));

    }
    public static boolean isPowerOfTwo(int n){
        if(n==0){
            return false;
        }
        if((n&(n-1))==0){return true;}
        else return false;


    }
    public static boolean haveSameSign(int n,int m){
        if((n^m)>0){return true;}
        else return false;

    }
    public static void countNoOfSetBits(int n){
        System.out.println(Integer.toBinaryString(n));
        int count=0;
        while(n>0) {
//            count += n & 1;
         if((n&1)==1) {
        count++;
      }
            n = n >> 1;



    }System.out.println(count);}
    public static void countNoOfSetBitsOptimal(int n){
        int count =0;
        while(n>0){
            n= n&(n-1);
            count++;
        }
        System.out.println(count);

    }

    //clear lsb
    public static void XORWithoutOperator(int n,int m){
        int xor = ((~n)&m )+ ((~m)&n );
        System.out.println(xor);
        System.out.println("With operator " + (n^m));

    }



    public static void main(String[] args) {
//        setIthBit(12,1);
//        clearIthBit(12,2);
//        clearMBits(191,3);
//        updateIthBit(191,3,0);
//        System.out.println(isPowerOfTwo(102));
//        System.out.println(haveSameSign(102,10));
//        countNoOfSetBits(191);
//countNoOfSetBitsOptimal(191);
//        System.out.println(Math.ceil(1.0));
//        System.out.println(Math.ceil(1.0)==Math.floor(1.0));
//        XORWithoutOperator(2,5);
        System.out.println("d".substring(1)=="");

    }


}
