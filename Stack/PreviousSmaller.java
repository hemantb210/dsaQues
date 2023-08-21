package Stack;
import java.util.*;
//nearest smaller number on left side
public class PreviousSmaller {
    public static int[] find(int [] arr){

        Stack <Integer> s = new Stack<>();
        s.push(arr[0]);
        int ans[] = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {

            while(!s.isEmpty()&& arr[i]<=s.peek()){
                s.pop();
            }
            if(s.empty()){
                ans[i]=0;
            }
            else{
                ans[i]= s.peek();

            }
            s.push(arr[i]);
        }
        return ans;

    }

    public static void main(String[] args) {
int arr[]={1,6,4,10,2,5};
int [] ans = find(arr);
        System.out.println(Arrays.toString(ans));
    }


}
