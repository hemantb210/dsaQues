package Strings;

public class PrintSuffixes {
    public static void main(String[] args) {
        printSuffix("brain");
    }

    public static void printSuffix(String arr){
        for (int i = arr.length()-1; i >=0; i--) {
            System.out.println(arr.substring(i));
        }


    }
}
