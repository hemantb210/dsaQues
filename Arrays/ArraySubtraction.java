package Arrays;

import java.util.Arrays;

public class ArraySubtraction {
    public static void main(String[] args) {
        int [] arr1={9,8,5,1};
        int [] arr2= {2,6,3,8};
        arrSub(arr1,arr2);
    }

    private static void arrSub(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int [] ans = new int [n];
        int carry=0;
        int i = n-1;
        int j= m-1;
        int k = ans.length-1;
        while(k>=0){
            int d =0;
            int arr2Element = j<0?0:arr2[j];
            if(arr1[i]<arr2Element){
                d= arr1[i]+10+carry-arr2Element;
                carry =-1;
            }
            else {
                d= arr1[i]-arr2Element+carry;
                carry=0;
            }
            ans[k]= d;
            i--;
            j--;
            k--;

        }
        System.out.println(Arrays.toString(ans));


    }

}
