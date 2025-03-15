class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int n = nums.size();
        int[] dp = new int[target + 1];
        Arrays.fill(dp,Integer.MIN_VALUE);
        dp[0] = 0;
        for (int i :nums) {
            for (int j = target; j >= i; j--) {
                if (dp[j - i] != Integer.MIN_VALUE) { 
                    dp[j] = Math.max(dp[j], dp[j - i] + 1);
                }
            }
        }
        return dp[target]==Integer.MIN_VALUE?-1:dp[target];
    }
}