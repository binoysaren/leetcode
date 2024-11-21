class Solution {
    int R, C;

    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        R = m;
        C = n;
        boolean[][] visit = new boolean[m][n];
        boolean[][] blocked = new boolean[m][n];
        int count = 0;
        for (int[] w : walls) blocked[w[0]][w[1]] = true;
        for (int[] g : guards) blocked[g[0]][g[1]] = true;
        for (int[] g : guards) dfs(g[0], g[1], visit, blocked);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visit[i][j] && !blocked[i][j]) count++;
            }
        }
        return count;
    }

    public void dfs(int r, int c, boolean[][] visit, boolean[][] blocked) {
        dir(r, c + 1, visit, blocked, 0, 1);
        dir(r, c - 1, visit, blocked, 0, -1);
        dir(r + 1, c, visit, blocked, 1, 0);
        dir(r - 1, c, visit, blocked, -1, 0);
    }

    public void dir(int r, int c, boolean[][] visit, boolean[][] blocked, int dr, int dc) {
        while (r >= 0 && r < R && c >= 0 && c < C) {
            if (blocked[r][c]) break;
            visit[r][c] = true;
            r += dr;
            c += dc;
        }
    }
}
