class Solution {
    public int countServers(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int[] row=new int[r];
        int[] col=new int[c];
        for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++){
               sum+=grid[i][j];
            }
            row[i]=sum;
        }
        for(int i=0;i<c;i++){
            int sum=0;
            for(int j=0;j<r;j++){
               sum+=grid[j][i];
            }
            col[i]=sum;
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1 && row[i] == 1 && col[j] == 1) {
                    grid[i][j] = 0;
                }
            }
        }
        int ans=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans+=grid[i][j];
            }
        }
        return ans;
    }
}
// 1  1  1  0  1     
// 0  1  1  0  0     
// 1  0  1  1  0     
// 0  0  0  0  1   

