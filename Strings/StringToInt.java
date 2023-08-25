package Strings;

public class StringToInt {
    public static void main(String[] args) {
        System.out.println(AtoI("      46574648897979"));
    }
    public static int AtoI(String s){
        int sign =1;
        int r=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                continue;
            }
            if(s.charAt(i)=='-'){
                sign =-1;
            }
            if(Character.isDigit(s.charAt(i))){
                int digit = s.charAt(i)-'0';
                if(r>Integer.MAX_VALUE/10||(r==Integer.MAX_VALUE/10&&(digit>Integer.MAX_VALUE%10))){
                    return (sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE);
                }
                r= r*10+digit;



            }

        }
        return sign*r;

    }

}
