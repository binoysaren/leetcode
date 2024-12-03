class Solution {
    int R, C;
    public int numEnclaves(int[][] grid) {
        R = grid.length;
        C = grid[0].length;
        boolean[][] visit = new boolean[R][C];
        int ans = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid[i][j] == 1 && !visit[i][j]) {
                    int sum = dfs(i, j, visit, grid);
                    if (sum > 0) {
                        ans += sum;
                    }
                }
            }
        }
        return ans;
    }
    public int dfs(int r, int c, boolean[][] visit, int[][] grid) {
        if (r < 0 || r >= R || c < 0 || c >= C || grid[r][c] == 0 || visit[r][c]) {
            return 0;
        }
        visit[r][c] = true;
        int sum = 1;
        boolean isBoundary = (r == 0 || r == R - 1 || c == 0 || c == C - 1);
        int[][] adj = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
        for (int[] neighbor : adj) {
            int newr = r + neighbor[0];
            int newc = c + neighbor[1];
            int result = dfs(newr, newc, visit, grid);
            if (result == -1) {
                isBoundary = true;
            } else {
                sum += result;
            }
        }
        return isBoundary ? -1 : sum;
    }
}
