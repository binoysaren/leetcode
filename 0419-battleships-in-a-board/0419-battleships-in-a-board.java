class Solution {
    public int countBattleships(char[][] board) {
        int count = 0;
        int rows = board.length;
        int columns = board[0].length;

        for (int i = 0; i<rows; i++){
            int j = 0;
            while(j<=columns){
                while(j<columns && board[i][j]!='X'){
                    j++;
                }
                boolean candidate = false;
                if (j<columns && board[i][j] =='X'&& (i==0 || board[i-1][j]!='X')){
                    count++;
                }
                j++;
                while(j<columns && board[i][j]=='X'){
                    j++;
                }

            }
        }

        return count;
    }
}