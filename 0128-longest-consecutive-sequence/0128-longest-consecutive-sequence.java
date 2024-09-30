class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return 1;
        int ans = Integer.MIN_VALUE;
        int count = 1;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                continue;
            if (nums[i] == nums[i - 1] + 1) {
                count++;
            } else {
                count = 1;
            }
            ans = Math.max(count, ans);
        }
        ans=Math.max(ans,count);
        return ans;
    }
}