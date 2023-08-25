package Strings;

public class MinimumReversals {

    int countRev (String s)
    {
        int leftBraces=0;
        int rightBraces=0;
        if(s.length()%2!=0)
            return -1;
        for(int i =0; i< s.length();i++){
            if(s.charAt(i)=='{'){
                leftBraces++;
            }
            else{
                if(leftBraces==0){
                    rightBraces++;
                }
                else{
                    leftBraces--;
                }

            }

        }
        return (int)(Math.ceil((0.0+leftBraces)/2)+Math.ceil((0.0+rightBraces)/2));
    }
}
