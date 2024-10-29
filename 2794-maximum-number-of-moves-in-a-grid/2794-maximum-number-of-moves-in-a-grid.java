class Solution {
    public int maxMoves(int[][] grid) {
      int max=0;
      int[][] dp=new int[grid.length][grid[0].length];
      for(int[] i:dp){
        Arrays.fill(i,-1);
      }
      for(int i=0;i<grid.length;i++){
        max=Math.max(max,fun(grid,dp,i,0));
      }  
      return max;
    }
    public int fun(int[][] grid,int[][] dp,int r,int c){
        int row=grid.length;
        int col=grid[0].length;
        if(r==row || c==col){
            return 0;
        }
        if(dp[r][c]!=-1){
            return dp[r][c];
        }
        int max=0;
        if(r-1>=0 && c+1<col && grid[r][c]<grid[r-1][c+1]){
            max=1+fun(grid,dp,r-1,c+1);
        }
        if(r>=0 && c+1<col && grid[r][c]<grid[r][c+1]){
            max=Math.max(max,1+fun(grid,dp,r,c+1));
        }
        if(r+1<row && c+1<col && grid[r][c]<grid[r+1][c+1]){
            max=Math.max(max,1+fun(grid,dp,r+1,c+1));
        }
        dp[r][c]=max;
        return dp[r][c];
    }
}