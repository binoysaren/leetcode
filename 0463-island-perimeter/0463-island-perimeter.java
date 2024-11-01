class Solution {
    int R, C;
    int count;
    public int islandPerimeter(int[][] grid) {
        R = grid.length;
        C = grid[0].length;
        count=0;
        boolean[][] visit=new boolean[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid[i][j] == 1 && !visit[i][j]) {
                    dfs(i, j, grid,visit);
                }
            }
        }
        return count;
    }

    public void dfs(int r, int c, int[][] grid,boolean[][] visit) {
        if (r < 0 || r >= R || c < 0 || c >= C ||  grid[r][c]==0) {
            count++;
            return;
        }
        if(visit[r][c]){
            return;
        }
        visit[r][c]=true;
        int[][] adjlist = { { r, c + 1 }, { r, c - 1 }, { r + 1, c }, { r - 1, c } };
        for (int[] i : adjlist) {
          dfs(i[0],i[1],grid,visit);
        }
    }
}