class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        if (goal < 0) return 0;
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }   
    private int atMost(int[] nums, int goal) {
        int count = 0;
        int sum = 0;
        int start = 0;       
        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];
            while (sum > goal && start <= end) {
                sum -= nums[start++];
            }
            if (sum <= goal) {
                int temp = start;
                while (temp <= end) {
                    count++;
                    temp++;
                }
            }
        }
        return count;
    }
}