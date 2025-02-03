class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int in = Integer.MIN_VALUE;
        int de = Integer.MIN_VALUE;
        int n = nums.length;
        int count = 1;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                count++;
                in = Math.max(in, count);
            } else {
                count = 1;
            }
            // System.out.println(in+" "+count);
        }
        count = 1;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
                de = Math.max(de, count);
            } else {
                count = 1;
            }
            // System.out.println(de+" "+count);
        }
        int ans=Math.max(in,de);
        return ans==Integer.MIN_VALUE ? 1:ans;
    }
}