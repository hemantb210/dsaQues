package BitManipulation;

public class MaximumBitwiseAnd {

    public static void main(String[] args) {
        find(new int[] {3,5,8,10,12});
    }
    public static void find(int[] arr){
        int max=0;
        int tempMax=0;
        for (int i = 0; i < arr.length; i++) {
            tempMax=0;
            for (int j=i+1;j<arr.length;j++){
                tempMax=arr[i]&arr[j];
                if(max<tempMax){
                    max=tempMax;
                }
            }
        }
        System.out.println(max);

    }

}
