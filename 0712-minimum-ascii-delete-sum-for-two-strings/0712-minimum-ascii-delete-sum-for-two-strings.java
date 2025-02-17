class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        long[][] dp=new long[n2+1][n1+1];
        long sum=0;
        for(int i=1;i<n1+1;i++){
            sum+=s1.charAt(i-1);
            dp[0][i]=sum;
        }
        sum=0;
        for(int i=1;i<n2+1;i++){
            sum+=s2.charAt(i-1);
            dp[i][0]=sum;
        }

         for (int i = 1; i <= n2; i++) {
            for (int j = 1; j <= n1; j++) {
                if (s1.charAt(j - 1) == s2.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; 
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j] + s2.charAt(i - 1), dp[i][j - 1] + s1.charAt(j - 1)); 
                }
            }
        }
        // for(int i=0;i<dp.length;i++){
        //     for(int j=0;j<dp[i].length;j++){
        //         System.out.print(dp[i][j]+ " ");
        //     }
        //     System.out.println();
        // }
        return (int)dp[n2][n1];
    }
}
//      s e a
//     0 1 2 3
//   0 0 1 2 3
// e 1 1 2 1 2
// a 2 3 3 2 1
// t 3 3 4 3 2