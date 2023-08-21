package Arrays;

public class SecondMax {

    public static void main(String[] args) {
secondMax(new int[] {2,8,8,7,0});
    }

    static void secondMax(int [] arr){
        int secondMax=Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]>max){
                secondMax=max;
                max=arr[i];
            }
            if(arr[i]!=max && arr[i]>secondMax)
            {secondMax= arr[i];}

        }
        System.out.println("Second max " + secondMax);
        //or find max and reiterate to find an element not equal to max and greater than second max


    }



    }

