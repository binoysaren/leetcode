class Solution {
    public int minSubarray(int[] nums, int p) {
        int sum = 0;
        for (int i : nums) {
            sum = (sum + i) % p;
        }
        int target = sum % p;
        if (target == 0)
            return 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int current = 0;
        int ans = nums.length;
        for (int i = 0; i < nums.length; i++) {
            current = (current + nums[i]) % p;
            int rem = (current - target + p) % p;
            if (map.containsKey(rem)) {
                ans = Math.min(ans, i - map.get(rem));
            }
            map.put(current, i);
        }
        return (ans == nums.length) ? -1 : ans;
    }
}