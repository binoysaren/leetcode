class Solution {
    public int orangesRotting(int[][] grid) {
        int R = grid.length;
        int C = grid[0].length;
        int fresh = 0;
        int time = 0;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid[i][j] == 1) {
                    fresh++;
                } else if (grid[i][j] == 2) {
                    q.add(new int[] { i, j });
                }
            }
        }
        if (fresh == 0)
            return 0;
        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                int[] temp = q.poll();
                int r = temp[0];
                int c = temp[1];
                int[][] adlist = { { r, c + 1 }, { r, c - 1 }, { r + 1, c }, { r - 1, c } };
                for (int[] neighbor : adlist) {
                  int nr=neighbor[0];
                  int nc=neighbor[1];
                  if(nr<0 || nr>=R || nc<0 || nc>=C  || grid[nr][nc]==2 || grid[nr][nc]==0){
                    continue;
                  }
                  q.add(new int[]{nr,nc});
                  grid[nr][nc]=2;
                }
            }
            time++;
            fresh=fresh-q.size();
            if(fresh==0){
                break;
            }
        }
        return fresh==0?time:-1;
    }
}