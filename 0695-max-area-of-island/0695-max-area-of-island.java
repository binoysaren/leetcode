class Solution {
    int R;
    int C;
    int ans=Integer.MIN_VALUE;
    public int maxAreaOfIsland(int[][] grid) {
        R=grid.length;
        C=grid[0].length;
        boolean[][] visit=new boolean[R][C];
        int count=0;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(grid[i][j]==1){
                    count=dfs(i,j,grid,visit);
                }
                System.out.print(count + ",");
                ans=Math.max(ans,count);
            }
            System.out.println();
        }
        return ans;
    }
    public int dfs(int r,int c,int[][] grid,boolean[][] visit){
        if(r<0 || r>=R || c<0 || c>=C|| grid[r][c]==0 ||visit[r][c]){
            return 0;
        }
        visit[r][c]=true;
        int[][] adjlist={{r,c+1},{r,c-1},{r+1,c},{r-1,c}};
        int cnt=1;
        for(int[] neighbor:adjlist){
            cnt+=dfs(neighbor[0],neighbor[1],grid,visit);
        }
        return cnt;
    }
}