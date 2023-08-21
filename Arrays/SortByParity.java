package Arrays;

public class SortByParity {
    public static void main(String[] args) {
        sort(new int [] {2,1,4,5,0,0});

    }

    private static void sort(int[] nums) {
    int i =0;
    int j=nums.length-1;
    int temp=0;
    while(i<j){
        if(nums[i]%2==0){
            i++;

        }
        else{
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]= temp;
            j--;
        }

    }
    }
}
