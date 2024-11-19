class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans = 0;
        long sum = 0;
        int n = nums.length;
        int dup = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) > 1) {
                dup++;
            }
            sum += nums[i];
        }
        for (int i = 1; i <= n - k; i++) {
            if (dup == 0) {
                ans = Math.max(ans, sum);
            }
            int first = map.getOrDefault(nums[i - 1], 0);
            if (first > 1) {
                dup--;
            }
            map.put(nums[i - 1], first - 1);
            int last = map.getOrDefault(nums[i + k - 1], 0);
            if (last >= 1) {
                dup++;
            }
            map.put(nums[i + k - 1], last + 1);
            sum -= nums[i - 1];
            sum += nums[i + k - 1];
        }
        if (dup == 0) {
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}