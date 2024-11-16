class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int index = 0;
        for (int i = 0; i <= n - k; i++) {
            int maxi = nums[i];
            boolean flag = true;
            for (int j = i; j < i + k - 1; j++) {
                if (nums[j] + 1 != nums[j + 1]) {
                    flag = false;
                }
                maxi = Math.max(maxi, nums[j + 1]);
            }
            ans[index++] = flag ? maxi : -1;
        }
        return ans;
    }
}