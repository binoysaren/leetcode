class Solution {
    public long gridGame(int[][] grid) {
        int r = 2;
        int c = grid[0].length;
        long topsum = 0;
        long buttomsum = 0;
        for (int i = 0; i < c; i++) {
            topsum += grid[0][i];
        }
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < c; i++) {
            topsum -= grid[0][i];
            ans = Math.min(ans, Math.max(topsum, buttomsum));
            buttomsum += grid[1][i];
        }
        return ans;
    }
}