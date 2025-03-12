class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int ne = binary(nums, 0);
        int po = n - binary(nums, 1);
        return Math.max(ne, po);
    }
    public int binary(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int  result = nums.length;
        while (left <= right) {
            int mid = left+(right-left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                result = mid;
                right = mid - 1;
            }
        }
        return result;
    }
}