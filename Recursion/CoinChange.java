package Recursion;

public class CoinChange {

    public static void main(String[] args) {
        int [] coins = {2,5,3,6};
        int amount = 10;
        System.out.println(findNumOfCoins(coins,coins.length,amount));
        System.out.println(findNum(coins,0,amount));

    }

    public static int findNumOfCoins(int [] arr,int n,int target){

        if(target==0){
            return 1;
        }
        if(target<0){
            return 0;
        }
        if(n<=0){
           return 0;

       }


       return findNumOfCoins(arr,n-1,target)+findNumOfCoins(arr,n,target-arr[n-1] );
    }
    public static int findNum(int [] arr, int index, int target){
        if(target==0)
        {return 1;}
        int count =0;
        for(int i = index; i<arr.length;i++){
            if(target>=arr[i])
           count += findNum(arr,i,target-arr[i]);
        }
      return count;
    }
}
