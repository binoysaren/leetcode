class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] == 0) {
                nums[i] = 1-nums[i];
                nums[i + 1] = 1-nums[i+1];
                nums[i + 2] = 1-nums[i+2];
                count++;
            }
        }
        return (nums[n - 2] == 0 || nums[n - 1] == 0) ? -1 : count;
    }
}
// 1 0 1 1 1 1 0 0
// 1 1 0 0 1 1 0 0
// 1 1 1 1 0 1 0 0
// 1 1 1 1 1 0 0 0
