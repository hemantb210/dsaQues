package Arrays;

import java.util.Arrays;

public class NbonacciSeries {

    public static void main(String[] args) {
        System.out.println(find(3,15));
    }
    public static int find(int n , int m){
        int [] arr = new int [m];
        int sum =1;
        for (int i = 0; i <=n-2; i++) {
            arr[i]=0;
        }
        arr[n-1]=1;
        arr[n]=1;
        for (int i = 0; i <=m-n-2; i++) {
            sum = sum-arr[i]+arr[i+n];
            arr[i+n+1]= sum;
        }
        System.out.println(Arrays.toString(arr));
        return arr[m-1];

    }
}
