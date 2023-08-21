package DP;

public class DiceGame {
    static int [] ways = new int[10];
    public static int totalWaysMemo(int n){
        if(n==0){
            return 1;
        }
        if(ways[n]!=-1){
            return ways[n];
        }
        int count =0;
        for(int i =1;i<=6;i++){
            if(n>=i){
                count =count+ totalWaysMemo(n-i);
            }
        }
        return ways[n]=count;
    }
    public static int diceGame(int n){
        int [] dp = new int[n+1];
        dp[0]=1;
        for(int i= 1;i<n+1;i++){
            for(int j=1;j<=6;j++){
                if(i>=j)
                dp[i]=dp[i]+dp[i-j];
            }
        }

    return dp[n];}
    public static int spaceOptimized(int n){
        int [] dp = new int[6];
        dp[0]=1;
        for(int i =1;i<n+1;i++)
        {int sum=0;
            for(int j=1;j<=6;j++){
                if(i>=j)
             sum+= dp[(i-j)%6];
            }
            dp[i%6]=sum;


        }
return dp[n%6];
    }


    public static void main(String[] args) {
        for (int i = 0; i < ways.length; i++) {
            ways[i]=-1;
        }
        System.out.println(totalWaysMemo(7));
        System.out.println(diceGame(7));
        System.out.println(spaceOptimized(7));
    }



}
