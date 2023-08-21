package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class MazePathTopDown {

    public static int findWays(int rows, int columns, String [] output){
        if(rows==1){
            output[0]="";
            for(int i =0; i<columns-1;i++){
               output[0]+='h';
            }
            return 1;
        }
        if(columns==1){
            output[0]="";
            for(int i =0; i<rows-1;i++){
                output[0]+='v';
            }
            return 1;
        }
        String ans[]= new String[1000];
        int k=0;
        int left= findWays(rows,columns-1,output);


        for(int i=0; i<left;i++){
            ans[k]=output[i]+"h";
            k++;
        }
        int right= findWays(rows-1,columns,output);
        for(int i=0; i<right;i++){
            ans[k]=output[i]+"v";
            k++;
        }
        for(int i =0;i<left+right;i++){
            output[i]=(ans[i]);
        }
        return left+right;



    }
    public static int num(int rows,int cols){
        if(rows==0||cols==0){
            return 1;
        }
        return num(rows-1,cols)+num(rows,cols-1);
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        String [] s= new String[1000];
findWays(4,4,s);
int n =0;
        for (int i = 0; i < s.length; i++) {
            if(s[i]==null)
            {n=i-1;
                break;}
            else
                System.out.print(s[i] + " ");
        }
        System.out.println();
        System.out.println(num(4,4));

    }
}
