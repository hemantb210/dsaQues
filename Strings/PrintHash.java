package Strings;

public class PrintHash {

    public static void main(String[] args) {
        System.out.println(print("aaaaaaaaaaabbbbbbccccde"));
    }
    public static String print(String s){
        if(s.length()==1){
            return s;
        }
        char current = s.charAt(0);
        String replace = print(s.substring(1));
        if(current==replace.charAt(0)){
            replace= current+"#"+replace.substring(1);
        }
        else{
            replace= current+replace;
        }
        return replace;
    }
}
