class Solution {
    public boolean checkValidGrid(int[][] grid) {
      if(grid[0][0]!=0){
        return false;
      }
      int R=grid.length;
      return dfs(0,0,R,R,grid);  
    }
    public boolean dfs(int r,int c,int R,int C,int[][] grid){
        if(grid[r][c]==R*R-1){
            return true;
        }
        int[][] adj={{r-1,c-2},{r-2,c-1},{r-2,c+1},{r-1,c+2},{r+1,c+2},{r+2,c+1},{r+2,c-1},{r+1,c-2}};
        for(int[] neighbor:adj){
            int newr=neighbor[0];
            int newc=neighbor[1];
            if( newr>=0 && newr<R && newc>=0 && newc<C && grid[newr][newc]==grid[r][c]+1){
                System.out.println(grid[newr][newc]);
                 if (dfs(newr, newc, R, C, grid)) {
                    return true;
                }
            }
        }
        return false;
    }
}