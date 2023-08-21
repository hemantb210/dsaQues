package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
//        int ans = missingNumber(new int []{2,1,0,4});
//
//        System.out.println(ans);
        approach2(new int []{2,1,0,3,5});

    }

    public static int missingNumber(int[] nums) {
        int ans =0;
        int i =0;
        for(i =0;i<nums.length;i++){
            ans = ans^i^nums[i];
        }
        ans ^=i;

        return ans;
    }
    public static void approach2(int [] arr){
        int sum =0;
        int arraySum = 0;
        for (int i = 0;i<arr.length+1;i++){
            sum += i;
        }
        for(int i=0 ;i< arr.length;i++){
            arraySum+= arr[i];
        }
        System.out.println(sum- arraySum);


    }

}
