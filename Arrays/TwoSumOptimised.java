package Arrays;

import java.util.Arrays;

public class TwoSumOptimised {

    public static void main(String[] args) {
        int arr[] = {3,2,1,5,6};
        int k=11;
        twoSum(arr,k);


    }
    static void twoSum(int [] arr, int k){
        Arrays.sort(arr);
        int i=0;
        int j = arr.length-1;
        int [] ans = new int [2];
        int a=-1;
        int b =-1;
        while(i<j){
            if(arr[i]+arr[j]==k){
                ans[0]=arr[i];
                ans[1]=arr[j];
                System.out.println(ans[0] + " "+ ans[1]);
            break;}

            else if(arr[i]+arr[j]>k)
            {j--;}
            else {
                i++;
            }
        }
//        for (int l = 0; l < arr.length; l++) {
//            if(arr[l]==ans[0]){
//                a=l;
//            }
//            if(arr[l]==ans[1]){
//                b=l;
//            }
//        }
//        System.out.println("Sum of " + a + " "+b);

    }
}
