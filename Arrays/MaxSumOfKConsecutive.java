package Arrays;

public class MaxSumOfKConsecutive {

    public static void main(String[] args) {
        int [] arr = {1,40,30,10,20,5};
        int k =3;
//        find(arr,k);
        optimal(arr,k);
    }
    public static void find(int [] arr, int k){
        int sum=0;
        int maxSum=0;
        for (int i = 0; i <arr.length-k ; i++) {
            sum=0;
            for(int j=i; j<i+k;j++){
                sum+=arr[j];
            }
            if(maxSum<sum){
                maxSum=sum;
            }
        }
        System.out.println(maxSum);


    }


    //Sliding Window...
    public static void optimal(int [] arr, int k){
        int sum=0;
        int maxSum=0;
        for (int i = 0; i <k; i++) {
            sum+=arr[i];
        }
        maxSum=sum;
        for (int i = 0; i < arr.length-k; i++) {
            sum+=arr[i+k]-arr[i];
            if(maxSum<sum){
                maxSum=sum;
            }

        }
        System.out.println(maxSum);


    }
}
