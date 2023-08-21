package BitManipulation;

public class NumberWhoseBinaryIsPalindrome {

    public static void main(String[] args) {
       find(9);
    }
    public static void find(int A){
        int count =1;
        int num=1;
        if(A==1){
            System.out.println("1");
        }
        else{
        while(true){
            if(count==A){
                System.out.println(num);

                break;
            }

            if(isPalindrome(Integer.toBinaryString(++num))){
                count++;

        }
//        num++;
        }


    }
  }
    public static boolean isPalindrome(String binary){
        int i =0;
        int j=binary.length()-1;
        while(i<=j){
            if(binary.charAt(i)!=binary.charAt(j)){
                return false;
            }
            i++;
            j--;

        }
        return true;

    }
}
