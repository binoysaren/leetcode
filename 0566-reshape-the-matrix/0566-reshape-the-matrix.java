class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int R = mat.length;
        int C = mat[0].length;
        if (R * C != r * c)
            return mat;
        int[][] ans = new int[r][c];
        int[] temp = new int[R * C];
        int index = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                temp[index] = mat[i][j];
                index++;
            }
        }
        int k = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = temp[k];
                k++;
            }
        }
        return ans;
    }
}