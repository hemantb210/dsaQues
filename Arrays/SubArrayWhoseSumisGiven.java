package Arrays;


public class SubArrayWhoseSumisGiven {
    public static void main(String[] args) {
        int [] arr= {20,10,40,30,60,50};
        int sum =50;
        find(arr,sum);

    }


    public static void find(int [] arr, int sum){
        int s=0;
        for (int i = 0; i < arr.length; i++) {
            s= arr[i];
            if(arr[i]==sum){
                System.out.println(i + "is the index");
            }
            else{
            for (int j =i+1;j< arr.length;j++){
               s+=arr[j];
              if(s==sum){
                   System.out.println( i+ " " +j + " is the index");
                   break;
               }
            }
                if(s==sum){
                    break;
                }

        }}

    }
}
