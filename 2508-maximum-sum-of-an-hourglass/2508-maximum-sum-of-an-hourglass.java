class Solution {
    public int maxSum(int[][] grid) {
        int ans = 0;
        int m = grid.length;
        int n = grid[0].length;
        int sum = 0;
        for (int i = 0; i < m - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                sum = grid[i][j] + grid[i][j + 1] + grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j]
                        + grid[i + 2][j + 1] + grid[i + 2][j + 2];
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }
}