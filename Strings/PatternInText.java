package Strings;

//text:abchd
//pattern:ch
//found at index 2
public class PatternInText {

    public static void main(String[] args) {
        String text= "abbccdbdd";
        String pattern="bdc";
        patternMatch(text,pattern);
    }
    public static void patternMatch(String text, String pattern){
        if(text.length()<pattern.length()){
            System.out.println("NO Match");
        }
        else {
            int i=0;
            int j=0;
        while(i<text.length()&&j<pattern.length()) {
            if(text.charAt(i)==pattern.charAt(j)){

                i++;
                j++;
            }
            else{
                j=0;
                i++;
            }



        }
        if(j==pattern.length()){
        System.out.println("Match found");
        }
        else{
            System.out.println("Match Not Found");
        }
        }



    }
}
