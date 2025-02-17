class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int[][] dp=new int[n1+1][n2+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                if(i==0){
                    dp[i][j]=0;
                }
                else if(j==0){
                    dp[i][j]=0;
                }
                else if(nums1[i-1]==nums2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
            
        }     
        // for(int i=0;i<dp.length;i++){
        //     for(int j=0;j<dp[i].length;j++){
        //         System.out.print(dp[i][j] + " ");
        //     }
        //     System.out.println();
        // } 
        return dp[n1][n2];
    }
} 
//   0 1 9 2 5 1
// 0 0 0 0 0 0 0
// 1 0 1 1 1 1 1
// 3 0 1 1 1 1 1
// 7 0 1 1 1 1 1
// 1 0 1 
// 7 0
// 5 0