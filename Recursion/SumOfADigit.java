package Recursion;

public class SumOfADigit {

    public static void main(String[] args) {
        sum(234);
        System.out.println(sumRecur(234));

    }
    static void sum(int digit){
      int sum =0;
       while(digit>0){
          sum+=digit%10;
          digit= digit/10;

       }
        System.out.println(sum);


    }
    static int sumRecur(int digit){

        if(digit==0){
            return 0 ;
        }
        int sum = digit%10+ sumRecur(digit/10);
        return sum;
    }

}
