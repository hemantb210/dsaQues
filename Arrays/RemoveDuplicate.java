package Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }


    //HashSet Approach
    public static int removeDuplicates(int[] nums) {
        int k =1;
        for (int i=0; i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){

                nums[k]=nums[i+1];
                k++;
            }


        }
        return k;
    }

    public static int approach2(int [] nums){

        int i =0;
        int j =0;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                nums[i+1]=nums[j];
                i++;
                j++;
            }}
        return i+1;
    }

}
