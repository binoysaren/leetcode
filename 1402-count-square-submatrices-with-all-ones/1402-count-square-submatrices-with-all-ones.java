class Solution {
    public int countSquares(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] dp = new int[r][c];
        for (int i = 0; i < c; i++) {
            dp[0][i] = matrix[0][i];
        }
        for (int i = 0; i < r; i++) {
            dp[i][0] = matrix[i][0];
        }
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (matrix[i][j] == 1)
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
            }
        }
        int count = 0;
        for (int[] i : dp) {
            for (int j : i) {
                count += j;
            }
        }
        return count;
    }
}