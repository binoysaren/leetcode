class Solution {
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
       robot.sort(null);
        Arrays.sort(factory, (a, b) -> Integer.compare(a[0], b[0]));
        int n = robot.size();
        int m = factory.length;
        long[] dp = new long[n + 1];
        Arrays.fill(dp, Long.MAX_VALUE / 2);
        dp[0] = 0;
        for (int j = 0; j < m; j++) {
            for (int i = n; i > 0; i--) {
                long distance = 0;
                for (int k = 1; k <= factory[j][1] && i - k >= 0; k++) {
                    distance += Math.abs(robot.get(i - k) - factory[j][0]);
                    dp[i] = Math.min(dp[i], dp[i - k] + distance);
                }
            }
        }
        
        return dp[n];  
    }
}