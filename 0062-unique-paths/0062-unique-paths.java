class Solution {
    public int uniquePaths(int m, int n) {
      int[][] dp=new int[m][n];
      return recur(0,0,m,n,dp);  
    }
    public int recur(int r,int c,int m,int n,int[][] dp){
       if(r==m-1 || c==n-1) return 1;
       if(dp[r][c]!=0) return dp[r][c];
       dp[r][c]= recur(r+1,c,m,n,dp)+recur(r,c+1,m,n,dp);
       return dp[r][c];
    }
}