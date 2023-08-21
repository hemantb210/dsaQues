package Arrays;

import java.util.Arrays;

public class ArrayAddition {

    public static void approach1(int[] arr1, int[] arr2){

        int n = arr1.length;
        int m = arr2.length;
        int [] ans = new int[n>m?n:m];
        int i = arr1.length-1;
        int j= arr2.length-1;
        int k = ans.length-1;
        int carry =0;
        while(k>=0){
            int d = carry;
            if(i>=0){
                d+=arr1[i];
            }
            if(j>=0){
                d+=arr2[j];
            }
            carry = d/10;
            int sum = d%10;
            ans[k]=sum;
            i--;
            j--;
            k--;
        }

        if(carry>0){
        System.out.print(carry);}
        System.out.print(Arrays.toString(ans));
    }
    public static int [] approach2(int [] arr1, int [] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int ans []= new int [n>m?n+1:m+1];
        int i = n-1;
        int j = m-1;
        int carry=0;
        int k = ans.length-1;
        while(i>=0 && j>=0){
            int sum = carry+arr1[i]+ arr2[j];
            carry = sum/10;
            ans[k]= sum%10;
            i--;
            j--;
            k--;


        }
        if(i<0){
            while(j>=0){
                int sum = carry+arr2[j];
                carry=sum/10;
                ans[k]= sum%10;
                j--;
                k--;

            }


        }
        if(j<0){
            while(i>=0){
                int sum = carry+arr1[i];
                carry=sum/10;
                ans[k]= sum%10;
                i--;
                k--;

            }
        }
        if(carry>0){
            ans[k]=carry;
        }
        return ans;

    }




    public static void main(String[] args) {
       approach1(new int []{2,3,6,9},new int []{9,3,4,6});

       int [] ans = approach2(new int []{3,6,9},new int []{9,3,4,6,8});
        System.out.println();
        System.out.println(Arrays.toString(ans));
    }
}
