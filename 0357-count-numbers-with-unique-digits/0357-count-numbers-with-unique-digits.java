class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0)
            return 1;
        int[] dp = new int[9];
        dp[0] = 1;
        dp[1] = 10;
        int temp = 9, result = 9;
        for (int i = 2; i < 9; i++) {
            result *= temp--;
            dp[i] = dp[i - 1] + result;
        }
        return dp[n];
    }
}
// 1 9*9 9*9*8 9*9*8*7