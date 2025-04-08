class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        if (map.size() == n) return 0;
        int count = 0;
        for (int i = 0; i < n; i += 3) {
            if (map.size() == n - i) {
                return count;
            }
            if (i < n) {
                map.put(nums[i], map.get(nums[i]) - 1);
                if (map.get(nums[i]) == 0) map.remove(nums[i]);
            }
            if (i + 1 < n) {
                map.put(nums[i + 1], map.get(nums[i + 1]) - 1);
                if (map.get(nums[i + 1]) == 0) map.remove(nums[i + 1]);
            }
            if (i + 2 < n) {
                map.put(nums[i + 2], map.get(nums[i + 2]) - 1);
                if (map.get(nums[i + 2]) == 0) map.remove(nums[i + 2]);
            }
            count++;
        }
        return count;
    }
}
