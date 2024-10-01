class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxi = nums[n - 1] - k;
        int mini = nums[0] + k;
        int ans = nums[n - 1] - nums[0];
        for (int i = 0; i < n-1; i++) {
            int ma = Math.max(maxi, nums[i] + k);
            int mi = Math.min(mini, nums[i+1] - k);
            ans = Math.min(ans, ma - mi);
        }
        return ans;
    }
}