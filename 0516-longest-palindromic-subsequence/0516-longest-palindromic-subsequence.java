class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        String[][] dp = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                dp[i][j] = s.substring(i, j + 1);
            }
        }
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(dp[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        int[][] DP = new int[n][n];
        for (int i = n-1; i >=0; i--) {
            for (int j = i; j < n; j++) {
                int size = dp[i][j].length();
                if (size == 1) {
                    DP[i][j] = 1;
                } else if (dp[i][j].charAt(0) == dp[i][j].charAt(size - 1)) {
                    DP[i][j] = DP[i + 1][j - 1] + 2;
                } else {
                    DP[i][j] = Math.max(DP[i][j - 1], DP[i + 1][j]);
                }
            }
        }
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(DP[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        return DP[0][n - 1];
    }
}