package backtracking;

public class WordSearch {
    static char board[][] = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
    };

    static boolean isValid = false;


    public static boolean searchWord(String word){
        for(int i=0; i<board.length; i++){
            for (int j=0; j< board[0].length;j++){
                if(isMatch(i,j,word)){
                return true;

            }
        }


    } return false;}

        static boolean isMatch(int row, int col, String word){

        //base case

            if(word.length()==0){return true;}

            if(row < 0 || col < 0 || row == board.length || col == board[0].length || board[row][col] != word.charAt(0)){
                return false;
            }

            board[row][col]='#';

            int [][] directions ={{0,1}, {1,0},{-1,0},{0,-1}};

            for(int i=0; i<directions.length; i++){

                 int rowDirection = directions[i][0];
                 int columnDirection = directions[i][1];

                 isValid = isMatch(row +rowDirection,col+columnDirection,word.substring(1));

                 if(isValid)
                 {break;}


                }
            board[row][col]=word.charAt(0);
            return isValid;



        }





    public static void main(String[] args) {
        String word = "SEED";
        boolean result = searchWord(word);
        System.out.println(result);
    }



}
