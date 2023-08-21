package BitManipulation;

import java.util.Arrays;

//Find the two non-repeating elements in an array of repeating elements
public class TwoSingleNumbers {


    public static int[] singleNumber(int[] nums)
    {
        // Code here
        int x=0;
        int [] ans = new int [2];
        for(int i=0;i<nums.length;i++){
            x^=nums[i];

        }
        //find rightMost set bit
        int mask = x&(-x);
        //  int mask = x&(~(x-1));
        int  p=0;
        int q=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&mask)>0){
                p^=nums[i];

            }
            else{
                q^=nums[i];
            }
        }
        if(p>q){
            ans[0]=q;
            ans[1]=p;
        }
        else{
            ans[0]=p;
            ans[1]=q;
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] ans = singleNumber(new int[] {1,2,3,2,1,4});
        System.out.println(Arrays.toString(ans));
    }
}
