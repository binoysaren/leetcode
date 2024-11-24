class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        long positive = 0;
        long negative = 0;
        int n = matrix.length;
        long mini = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum+=Math.abs(matrix[i][j]); 
                if(matrix[i][j]<0)negative++;
                mini = Math.min(mini, Math.abs(matrix[i][j]));
            }
        }
        if (negative % 2 == 0) {
            return sum;
        } else {
            return sum - 2*mini;
        }
    }
}