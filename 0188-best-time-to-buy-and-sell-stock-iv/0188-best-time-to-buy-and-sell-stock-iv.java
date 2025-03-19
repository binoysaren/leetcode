class Solution {
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        int[][] dp=new int[k+1][n];
        for(int i=1;i<k+1;i++){
            for(int j=1;j<n;j++){
                int maxi=Integer.MIN_VALUE;
                for(int index=0;index<j;index++){
                    maxi=Math.max(maxi,dp[i-1][index]+prices[j]-prices[index]);
                }
                dp[i][j]=Math.max(dp[i][j-1],maxi);
            }
        }
        return dp[k][n-1];
    }
}