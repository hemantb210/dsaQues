package Arrays;

public class GasStation {

    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int []{1,2,3,4,5},new int[]{3,4,5,1,2}));
    }

    public static int canCompleteCircuit(int gas[], int [] cost){
        int remainingGas=0;
        int startingPoint =0;
        int loss=0;
        for(int i =0; i<gas.length;i++){
            remainingGas+= gas[i]-cost[i];
            if(remainingGas<0){
                startingPoint=i+1;
                loss+=remainingGas;
                remainingGas=0;
            }}
        if(loss+remainingGas>=0){
                return startingPoint;
            }
        else{
            return -1;
        }



    }
}
