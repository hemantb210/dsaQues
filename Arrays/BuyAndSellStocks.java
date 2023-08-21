package Arrays;

import java.util.Arrays;

public class BuyAndSellStocks {

    public static void main(String[] args) {
        find(new int [] {100, 180, 260, 310, 40, 535, 695});
        approach2(new int [] {7,1,5,3,6,4});
        approach3(new int [] {7,1,5,3,6,4});

    }
    public static void find(int [] arr){

        int max =0;

        for (int i = 0; i <arr.length -1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(max<(arr[j]-arr[i])){
                    max=arr[j]-arr[i];

                }
            }
        }
        System.out.println(max);

    }
    public static void approach2(int [] arr){
        int prefixMin[] = new int [arr.length];
        prefixMin[0]= arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixMin[i]= prefixMin[i-1] >arr[i]?arr[i]:prefixMin[i-1];
        }
        System.out.println(Arrays.toString(prefixMin));

   int max=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]-prefixMin[i]>max){
                max= arr[i]-prefixMin[i];
            }
        }
        System.out.println("Max diff " + max);

    }
    public static void approach3(int [] prices){
        int min =prices[0];
        int max=0;
        for (int i = 0; i < prices.length; i++) {
            if((prices[i]-min)>max){
                max= prices[i]-min;

            }
            if(prices[i]<min){
                min=prices[i];
            }
        }
        System.out.println(max);
    }





}
