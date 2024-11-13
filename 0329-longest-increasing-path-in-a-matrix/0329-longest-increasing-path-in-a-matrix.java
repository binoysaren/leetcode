class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;
        int ans = 0;
        int[][] memories = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                ans = Math.max(ans, dfs(i, j, R, C, memories, matrix));
            }
        }
        return ans;
    }

    public int dfs(int r, int c, int R, int C, int[][] memories, int[][] matrix) {
        if(memories[r][c]!=0){
            return memories[r][c];
        }
        int maxi=1;
        int[][] adj = { { r, c + 1 }, { r, c - 1 }, { r + 1, c }, { r - 1, c } };
        for (int[] neighbor : adj) {
            int a = neighbor[0];
            int b = neighbor[1];
            if (a>=0 && a<R && b>=0 && b<C && matrix[a][b] > matrix[r][c]) {
                maxi=Math.max(maxi,1+dfs(neighbor[0], neighbor[1], R, C,memories, matrix));
            }
        }
        memories[r][c]=maxi;
        return maxi;
    }
}