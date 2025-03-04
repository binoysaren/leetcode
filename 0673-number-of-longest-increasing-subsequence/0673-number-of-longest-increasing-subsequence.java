class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] temp=new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(temp,1);
        int ans = 1;
        int count=0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if(dp[i]==dp[j]+1){
                        temp[i]=temp[i]+temp[j];
                    }
                    else if(dp[i]<dp[j]+1){
                        dp[i]=dp[j]+1;
                        temp[i]=temp[j];
                    }
                }
            }
            ans=Math.max(ans,dp[i]); 
        }
        for(int i=0;i<n;i++){
             System.out.print(dp[i]+ " ");
         }
         System.out.println();
          for(int i=0;i<n;i++){
             System.out.print(temp[i]+ " ");
         }
        for(int i=0;i<n;i++){
            if(dp[i]==ans){
                count+=temp[i];
            }
        }
        return  count;
    }
}
// 7 8 1 2 3 6 4 5 100 
// 1 2 1 1 1 2 1 1 3
