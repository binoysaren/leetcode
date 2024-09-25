class Solution {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, nums[i]);
            left[i] = maxi;
        }
        int mini = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            mini = Math.min(mini, nums[i]);
            right[i] = mini;
        }
        for (int i = 1; i < n; i++) {
            if (left[i - 1] <= right[i]) {
                return i;
            }
        }
        return left.length;
    }
}