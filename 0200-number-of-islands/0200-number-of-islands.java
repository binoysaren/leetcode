class Solution {
    int R;
    int C;
    public int numIslands(char[][] grid) {
       R=grid.length;
       C=grid[0].length;
       int ans=0;
       boolean[][] visit=new boolean[R][C];
       for(int i=0;i<R;i++){
        for(int j=0;j<C;j++){
            if(grid[i][j]=='1' && !visit[i][j] ){
                dfs(i,j,grid,visit);
                ans++;
            }
        }
       } 
       return ans;
    }
    public void dfs(int r,int c,char[][] grid,boolean[][] visit){
       if(r<0 || r>=R || c<0 || c>=C || grid[r][c]=='0' || visit[r][c]){
        return;
       }
       visit[r][c]=true;
       int[][] adjlist={{r,c+1},{r,c-1},{r-1,c},{r+1,c}};
       for(int[] neighbor:adjlist){
        dfs(neighbor[0],neighbor[1],grid,visit);
       }
    }
}