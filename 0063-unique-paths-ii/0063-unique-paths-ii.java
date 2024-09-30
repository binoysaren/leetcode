class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int[] i : dp) {
            Arrays.fill(i, -1);
        }
        return dfs(dp, grid, 0, 0);
    }

    public int dfs(int[][] dp, int[][] grid, int r, int c) {
        if (r < 0 || r == grid.length || c < 0 || c == grid[0].length || grid[r][c] == 1) {
            return 0;
        }
        if (r == grid.length - 1 && c == grid[0].length - 1) {
            return 1;
        }
        if (dp[r][c] > -1) {
            return dp[r][c];
        }
        dp[r][c] = dfs(dp, grid, r, c+1) + dfs(dp, grid, r+1, c );
        return dp[r][c];
    }
}