class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int r = isWater.length;
        int c = isWater[0].length;
        int[][] dp = new int[r][c];
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (isWater[i][j] == 1) {
                    dp[i][j] = 0;
                    q.add(new int[] { i, j });
                } else {
                    dp[i][j] = -1;
                }
            }
        }
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         System.out.print(dp[i][j]+ " " );
        //     }
        //     System.out.println();
        // }
        int[][] adj={{-1,0},{0,1},{1,0},{0,-1}};
        while (!q.isEmpty()) {
            int[] temp = q.poll();
            int newr = temp[0];
            int newc = temp[1];
            for (int[] i:adj) {
                int m = i[0]+newr;
                int n = i[1]+newc;
                // System.out.println(newr + " "+newc);
                if ( m >= 0 && m < r && n >= 0 && n < c && dp[m][n] == -1) {
                    dp[m][n] = dp[newr][newc] + 1;
                    q.add(new int[]{m,n});
                }
            }
        }
        return dp;
    }
}
// 0 0 1
// 1 0 0
// 0 0 0

// -1 -1 0
// 0 -1 -1
// -1 -1 -1