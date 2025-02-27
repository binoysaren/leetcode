class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        int[][] dp = new int[n][n];
        int maxi = 0;
        for (int i = 2; i < n; i++) {
            int a = 0;
            int b = i - 1;
            while (a < b) {
                int c = arr[a] + arr[b];
                if (c < arr[i]) {
                    a++;
                } else if (c > arr[i]) {
                    b--;
                } else {
                    dp[b][i] = dp[a][b] + 1;
                    maxi = Math.max(maxi, dp[b][i]);
                    a++;
                    b--;

                }
            }
        }
        return maxi == 0 ? 0 : maxi + 2;
    }
}
