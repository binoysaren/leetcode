class Solution {
    int R;
    int C;
    public boolean hasValidPath(int[][] grid) {
        R = grid.length;
        C = grid[0].length;
        boolean[][] visit = new boolean[R][C];
        return dfs(grid, visit, 0, 0);
    }
    public boolean dfs(int[][] grid,boolean[][] visit,int r,int c){
        if(r==R-1 && c==C-1){
            return true;
        }
        if(r<0 || r>=R || c<0 || c>=C || visit[r][c]){
            return false; 
        }
        visit[r][c]=true;
        if(grid[r][c]==1){
             if((c>0 && (grid[r][c-1]==1 || grid[r][c-1]==4 || grid[r][c-1]==6 ) && dfs(grid,visit,r,c-1)) || (c<C-1 && (grid[r][c+1]==1 || grid[r][c+1]==3 || grid[r][c+1]==5) && dfs(grid,visit,r,c+1) )){
                return true;
             }
        }
        else if(grid[r][c]==2){
               if((r>0 && (grid[r-1][c]==2 || grid[r-1][c]==3 || grid[r-1][c]==4 ) && dfs(grid,visit,r-1,c)) || (r<R-1 && (grid[r+1][c]==2 || grid[r+1][c]==5 || grid[r+1][c]==6) && dfs(grid,visit,r+1,c) )){
                return true;
             }
        }
        else if(grid[r][c]==3){
              if((c>0 && (grid[r][c-1]==1 || grid[r][c-1]==4 || grid[r][c-1]==6 ) && dfs(grid,visit,r,c-1)) || (r<R-1 && (grid[r+1][c]==2 || grid[r+1][c]==5 || grid[r+1][c]==6) && dfs(grid,visit,r+1,c) )){
                return true;
             }
        }
        else if(grid[r][c]==4){
              if((c<C-1 && (grid[r][c+1]==1 || grid[r][c+1]==3 || grid[r][c+1]==5 ) && dfs(grid,visit,r,c+1)) || (r<R-1 && (grid[r+1][c]==2 || grid[r+1][c]==5 || grid[r+1][c]==6) && dfs(grid,visit,r+1,c) )){
                return true;
             }
        }
        else if(grid[r][c]==5){
              if((c>0 && (grid[r][c-1]==1 || grid[r][c-1]==4 || grid[r][c-1]==6 ) && dfs(grid,visit,r,c-1)) || (r>0 && (grid[r-1][c]==2 || grid[r-1][c]==3 || grid[r-1][c]==4) && dfs(grid,visit,r-1,c) )){
                return true;
             }
            }
        else {
              if((r>0 && (grid[r-1][c]==2 || grid[r-1][c]==3 || grid[r-1][c]==4 ) && dfs(grid,visit,r-1,c)) || (c<C-1 && (grid[r][c+1]==1 || grid[r][c+1]==3 || grid[r][c+1]==5) && dfs(grid,visit,r,c+1)) ){
                return true;
             }
        }
        return false;
    }
}