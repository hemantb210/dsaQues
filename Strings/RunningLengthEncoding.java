package Strings;

public class RunningLengthEncoding {
    public static void main(String[] args) {
        String s = "aabbbbccc";
        find(s);
    }

    private static void find(String s) {
    int count =1;
    int i =0;
    for (i =0; i<s.length()-1;i++){
        if(s.charAt(i)==s.charAt(i+1)){
            count++;

        }
        else {

            System.out.print(s.charAt(i)+""+count);
            count=1;
        }
    }
        System.out.print(s.charAt(i-1)+""+count);


    }

}
