class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int sum = 0;
        for (int i : map.keySet()) {
            sum += i;
            if (map.get(i) == 2) {
                ans[0] = i;
            }
        }
        ans[1] = (nums.length) * (nums.length + 1) / 2 - sum;
        return ans;
    }
}