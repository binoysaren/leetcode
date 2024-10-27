class Solution {
    public int matrixScore(int[][] grid) {
      int r=grid.length;
      int c=grid[0].length;
      if(r==1 && c==1){
        return 1;
      }  
      List<Integer> row=new ArrayList<>();
      for(int i=0;i<r;i++){
        if(grid[i][0]==0){
            row.add(i);
        }
      }
      for(int i=0;i<row.size();i++){
        for(int j=0;j<c;j++){
             if(grid[row.get(i)][j]==0){
                grid[row.get(i)][j]=1;
             }
             else{
                grid[row.get(i)][j]=0;
             }
        }
      }
      List<Integer> col=new ArrayList<>();
      for(int i=1;i<c;i++){
        int count=0;
        for(int j=0;j<r;j++){
          if(grid[j][i]==1){
            count++;
          }
        }
        if(count<=r/2){
          col.add(i);
        }
      }
      for(int i=0;i<col.size();i++){
        for(int j=0;j<r;j++){
            if(grid[j][col.get(i)]==0){
                grid[j][col.get(i)]=1;
            }
            else{
                grid[j][col.get(i)]=0;
            }
        }
      }
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(" " +grid[i][j]);
        }
      }
      int ans=0;
      int base=1;
      for(int i=0;i<r;i++){
         for(int j=c-1;j>=0;j--){
            ans+=grid[i][j]*base;
            base*=2;
         }
         base=1;
      }
      return ans;
    }
}
//   0   1  2  3
// 0 00  01 02 03 
// 1 10  11 12 13
// 2 20  21 22 23
