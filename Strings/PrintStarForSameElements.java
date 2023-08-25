package Strings;

public class PrintStarForSameElements {

    public static void main(String[] args) {
        System.out.println(print("aaabbccccd"));
    }
    public static String print(String s){
        if(s.length()==1){
            return s;
        }
        char current = s.charAt(0);
       String replace= print(s.substring(1));
        if(current==replace.charAt(0)){
            replace=current+"*"+replace;
        }
        else{
            replace=current+replace;
        }
        return replace;
    }
}
