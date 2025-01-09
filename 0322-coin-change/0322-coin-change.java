class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount<1) return 0;
        int[] dp = new int[amount + 1];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
               if(coins[j]<=i && dp[i-coins[j]]!=Integer.MAX_VALUE){
                dp[i]=Math.min(dp[i],1+dp[i-coins[j]]);
               }
            }
        }
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }
}