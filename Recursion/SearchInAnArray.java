package Recursion;

public class SearchInAnArray {
    public static void main(String[] args) {
        int [] arr= {4,3,2,6,6,7};
        int k =2;
//        System.out.println(search(arr,k,0));
        System.out.println(searchFromLast(arr,k,arr.length-1));
    }
    public static int search(int [] arr, int k,int index){
        if(index==arr.length){
            return -1;

        }
        if(arr[index]!=k){
            return search(arr,k,index+1);
        }
        return index;

    }
    public static int searchFromLast(int [] arr, int k,int index){
        if(index==-1){
            return -1;

        }
        if(arr[index]!=k){
            return searchFromLast(arr,k,index-1);
        }
        return index;

    }
}
