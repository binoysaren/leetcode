class Solution {
    public int longestSubarray(int[] nums) {
        int len = 1;
        int val = -1;
        int current = 0;
        for (int i : nums) {
            val = Math.max(val, i);
        }
        for (int j : nums) {
            if (j == val) {
                current = current + 1;
                len = Math.max(len, current);
            } else {
                current = 0;
            }
        }
        return len;
    }
}