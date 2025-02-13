import java.math.BigInteger;
class Solution {
    public int countHousePlacements(int n) {
        BigInteger mod = BigInteger.valueOf(1000000007); 
        if (n == 1) return 4;
        if (n == 2) return 9;
        BigInteger[] dp = new BigInteger[n + 1];
        dp[1] = BigInteger.valueOf(2);
        dp[2] = BigInteger.valueOf(3);
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1].add(dp[i - 2]);
        }
        return dp[n].multiply(dp[n]).mod(mod).intValue();
    }
}
