package Recursion;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println(reverse("reverse",""));
        System.out.println(reverse2("reverse"));
    }


    public static String reverse(String s,String ans){
        if(s.length()==0){
            return ans;
        }
        ans+=s.charAt(s.length()-1);
        return reverse (s.substring(0,s.length()-1),ans);



    }
    public static String reverse2(String s){
        if(s.length()==0){
            return "";
        }
        return reverse2(s.substring(1) ) +s.charAt(0);



    }
}
