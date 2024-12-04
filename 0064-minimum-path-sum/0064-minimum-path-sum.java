class Solution {
    public int minPathSum(int[][] grid) {
        int R = grid.length;
        int C = grid[0].length;
        int[][] dp = new int[R][C];
        int sum = 0;
        for (int i = 0; i < R; i++) {
            sum += grid[i][0];
            dp[i][0] = sum;
        }
        sum = 0;
        for (int i = 0; i < C; i++) {
            sum += grid[0][i];
            dp[0][i] = sum;
        }
        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[R-1][C-1];
    }
}