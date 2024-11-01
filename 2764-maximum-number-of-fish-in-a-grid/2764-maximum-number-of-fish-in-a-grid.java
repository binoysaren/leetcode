class Solution {
    int R, C, maxi = 0;

    public int findMaxFish(int[][] grid) {
        R = grid.length;
        C = grid[0].length;
        boolean[][] visit = new boolean[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid[i][j] != 0 && !visit[i][j]) {
                    int sum = dfs(i, j, grid, visit);
                    maxi = Math.max(maxi, sum);
                }
            }
        }
        return maxi;
    }

    public int dfs(int r, int c, int[][] grid, boolean[][] visit) {
        if (r < 0 || r >= R || c < 0 || c >= C || grid[r][c] == 0 || visit[r][c]) {
            return 0;
        }
        visit[r][c] = true;
        int sum = grid[r][c];
        sum += dfs(r, c + 1, grid, visit);
        sum += dfs(r, c - 1, grid, visit);
        sum += dfs(r - 1, c, grid, visit);
        sum += dfs(r + 1, c, grid, visit);
        return sum;
    }
}
