class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        long goodp = 0;
        long n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(i - nums[i])) {
                goodp+=map.get(i-nums[i]);
            }
            map.put(i - nums[i],map.getOrDefault(i-nums[i],0)+1);
        }
        return n * (n - 1) / 2 - goodp;
    }
}