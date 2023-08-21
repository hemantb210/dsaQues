package Arrays;
//print a bar chart like pattern
public class BarChart {
    public static void main(String[] args) {
        int [] arr = {3,2,1,0,5,6};
        printBarChart(arr);
    }

    static int max(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]>max){
                max= arr[i];
            }

        }
        return max;
//        System.out.println("max " +max);
    }

    private static void printBarChart(int[] arr) {
        int maxElement = max(arr);

        for (int i = maxElement;i>0;i--){
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]>=i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
