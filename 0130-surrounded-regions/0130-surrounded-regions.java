class Solution {
    int R;
    int C;
    public void solve(char[][] board) {
        R = board.length;
        C = board[0].length;
        for(int i=0;i<R;i++){
            if(board[i][0]=='O'){
                dfs(i,0,board);
            }
            if(board[i][C-1]=='O'){
                dfs(i,C-1,board);
            }
        }
        for(int i=0;i<C;i++){
            if(board[0][i]=='O'){
                dfs(0,i,board);
            }
            if(board[R-1][i]=='O'){
                dfs(R-1,i,board);
            }
        }
        for (int i = 0; i < R ; i++) {
            for (int j = 0; j < C ; j++) {
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                else if(board[i][j]=='B'){
                    board[i][j]='O';
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        return;
    }

    public void dfs(int r, int c, char[][] board) {
        if (r < 0 || r >= R || c < 0 || c >= C || board[r][c] != 'O') {
            return;
        }
        board[r][c] = 'B';
        int[][] adj = { { r, c + 1 }, { r, c - 1 }, { r + 1, c }, { r - 1, c } };
        for (int[] neighbor : adj) {
            dfs(neighbor[0], neighbor[1], board);
        }
    }
}