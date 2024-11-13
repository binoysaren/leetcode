class Solution {
    int mod=1000000007;
    public int countPaths(int[][] grid) {
      int R=grid.length;
      int C=grid[0].length;
      int[][] memo=new int[R][C];
      for(int i=0;i<R;i++){
        for(int j=0;j<C;j++){
           dfs(i,j,R,C,memo,grid);
        }
      } 
      int ans=0;
      for(int i=0;i<R;i++){
        for(int j=0;j<C;j++){
            System.out.print(memo[i][j] + " ");
            if(memo[i][j]!=0){
                ans=(ans+memo[i][j])%mod;
            }
        }
        System.out.println();
      }
      return ans;
    }

    public int dfs(int r,int c,int R,int C,int[][] memo,int[][] grid){
        if(memo[r][c]!=0){
            return memo[r][c];
        }
        int maxi=1;
        int[][] adj={{r,c+1},{r,c-1},{r+1,c},{r-1,c}};
        for(int[] neighbor:adj){
            int a=neighbor[0];
            int b=neighbor[1];
            if(a>=0 && a<R && b>=0 && b<C && grid[r][c]<grid[a][b]){
                maxi=(maxi+dfs(a,b,R,C,memo,grid))%mod;
            }
        }
        memo[r][c]=maxi;
        return memo[r][c];
    }
}