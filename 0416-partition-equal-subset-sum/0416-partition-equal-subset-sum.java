class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%2!=0) return false;
        int target=sum/2;
        boolean[][] dp=new boolean[n+1][target+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 && j==0){
                    dp[i][j]=true;
                }
                else if(i==0){
                    dp[i][j]=false;
                }
                else if(j==0){
                    dp[i][j]=true;
                }
                else{
                    if(dp[i-1][j]){
                        dp[i][j]=true;
                    }
                    int value=nums[i-1];
                    if(j>=value){
                        if(dp[i-1][j-value]){
                            dp[i][j]=true;
                        }
                    }
                }
            }
        }
        return dp[n][target];
    }
}