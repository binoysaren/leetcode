class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        int n = s.length() + 1;
        int[] dp = new int[n];
        Arrays.fill(dp,n);
        dp[0] = 0;
        Set<String> set = new HashSet<>(Arrays.asList(dictionary));
        for (int i = 1; i <= s.length(); ++i) {
            dp[i] = dp[i - 1] + 1;
            for (int l = 1; l <= i; ++l) {
                if (set.contains(s.substring(i - l, i))) {
                    dp[i] = Math.min(dp[i], dp[i - l]);
                }
            }
        }
        return dp[s.length()];
    }
}