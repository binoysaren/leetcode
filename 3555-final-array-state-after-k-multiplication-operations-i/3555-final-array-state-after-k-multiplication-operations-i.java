class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k-->0){
            nums[f(nums)]=nums[f(nums)]*multiplier;
        }
        return nums;
    }
    public int f(int[] n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n.length; i++) {
            if (!map.containsKey(n[i])) {
                map.put(n[i], i);
            }
        }
        int mini = Integer.MAX_VALUE;
        for (int i : n) {
            mini = Math.min(mini, i);
        }
        return map.get(mini);
    }
}