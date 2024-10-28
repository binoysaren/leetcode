class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int r=triangle.size();
        int[][] dp=new int[r][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                dp[i][j]=Integer.MAX_VALUE;
            }
        }
        return recur(triangle,0,0,dp);
    }
    public int recur(List<List<Integer>> list,int row,int col,int[][] dp){
        if(row==list.size()-1){
            return list.get(row).get(col);
        }
        if(dp[row][col]!=Integer.MAX_VALUE){
            return dp[row][col];
        }
        int down=recur(list,row+1,col,dp);
        int down_right=recur(list,row+1,col+1,dp);
        dp[row][col]=list.get(row).get(col)+Math.min(down,down_right);
        return dp[row][col];
    }
}