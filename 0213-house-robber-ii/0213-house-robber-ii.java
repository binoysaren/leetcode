class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        int[] num1=new int[n-1];
        int[] num2=new int[n-1];
        for(int i=0;i<n-1;i++){
            num1[i]=nums[i];
        }
        for(int i=1;i<n;i++){
            num2[i-1]=nums[i];
        }
        int max1=f(num1);
        int max2=f(num2);
        return Math.max(max1,max2);
    }
    public int f(int[] arr){
        int N=arr.length;
        int[] dp=new int[N];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<N;i++){
            dp[i]=Math.max(dp[i-2]+arr[i],dp[i-1]);
        }
        // System.out.println(dp);
        return dp[N-1];
    }
}
