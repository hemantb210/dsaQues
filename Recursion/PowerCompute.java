package Recursion;

public class PowerCompute {

    public static void main(String[] args) {
        System.out.println(compute(25,2));
        computeLoop(25,2);
    }
    public static int compute(int n ,int k){
        if(n==0){
            return 0;
        }
        if (k==0){
            return 1;
        }
        int ans = n* compute(n,k-1);
        return ans;
    }
    public static void computeLoop(int n,int k){
        int ans =1;
        for (int i = 0; i < k; i++) {
            ans*= n;

        }
        System.out.println(ans);
    }
}

