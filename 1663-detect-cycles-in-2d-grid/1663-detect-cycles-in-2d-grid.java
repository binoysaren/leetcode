class Solution {
    int R;
    int C;

    public boolean containsCycle(char[][] grid) {
        R = grid.length;
        C = grid[0].length;
        boolean[][] visit = new boolean[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (!visit[i][j]) {
                    if (dfs(i, j, -1, -1, visit, grid)) {
                        return true;
                    }
                }
            }
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(visit[i][j] + "  ");
            }
            System.out.println();
        }
        return false;
    }

    public boolean dfs(int r, int c, int pr, int pc, boolean[][] visit, char[][] grid) {
        visit[r][c] = true;
        int[][] adj = { { r, c + 1 }, { r, c - 1 }, { r + 1, c }, { r - 1, c } };
        for (int[] neighbor : adj) {
            int newr = neighbor[0];
            int newc = neighbor[1];
            if (newr >= 0 && newc >= 0 && newr < R && newc < C && grid[newr][newc] == grid[r][c]) {
                if (newr == pr && newc == pc) {
                    continue;
                }
                if (visit[newr][newc]) {
                    return true;
                }
                if (dfs(newr, newc, r, c, visit, grid)) {
                    return true;
                }
            }
        }
        return false;
    }
}