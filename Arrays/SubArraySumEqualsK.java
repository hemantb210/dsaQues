package Arrays;

public class SubArraySumEqualsK {

    public static void main(String[] args) {
        int [] arr ={1,1,1};
        int k =2;
        System.out.println(subarraySum(arr,k));
//        System.out.println(subArraySum(arr,3,k));

    }

    public static int subarraySum(int [] nums,int k){
        int start =0;
        int sum=0;
        int ans=0;
        for (int i = 0; i < nums.length; i++) {

            if(nums[i]==k){
                ans++;
            }
            if(sum<k){
                sum+=nums[i];
        }


              while(sum>k&& start<i-1){
                    sum-=nums[start];
                    start++;

                }
                if (sum==k){
                    ans++;
                }


            }return ans;}
    static int subArraySum(int arr[], int n, int sum)
    {
        int currentSum = arr[0], start = 0, i;

        // Pick a starting point
        for (i = 1; i <= n; i++) {
            // If currentSum exceeds the sum,
            // then remove the starting elements
            while (currentSum > sum && start < i - 1) {
                currentSum = currentSum - arr[start];
                start++;
            }

            // If currentSum becomes equal to sum,
            // then return true
            if (currentSum == sum) {
                int p = i - 1;
                System.out.println(
                        "Sum found between indexes " + start
                                + " and " + p);
                return 1;
            }

            // Add this element to curr_sum
            if (i < n)
                currentSum = currentSum + arr[i];
        }

        System.out.println("No subarray found");
        return 0;
    }

        }


