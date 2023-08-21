package DP;

public class ClimbingStairs {
    static int [] ways = new int[100];
    public static int findWaysMemo(int n){
        if(n==0||n==1){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(ways[n]!=-1){
            return ways[n];
        }
        return ways[n]= findWaysMemo(n-1)+ findWaysMemo(n-2);

    }

    public static int findWaysTabulation(int n){
    int [] dp = new int[n+1];
    dp[0]=1;
    dp[1]=1;
    for(int i =2;i<n+1;i++){
        dp[i]= dp[i-1]+dp[i-2];
    }
    return dp[n];}
    public static int spaceOptimized(int n){
        int [] dp = new int[2];
        dp[0]=1;
        dp[1]=1;
        for(int i =0;i<2;i++){
          dp[i%2]=dp[(i-1)%2]+dp[(i-2)%2];
        }
        return dp[n%2];
    }

    public static void main(String[] args) {
        for (int i = 0; i < ways.length; i++) {
            ways[i]=-1;
        }
        System.out.println(findWaysMemo(10));
        System.out.println(findWaysTabulation(10));
        System.out.println(spaceOptimized(10));
    }
}
