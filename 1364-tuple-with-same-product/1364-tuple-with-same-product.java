class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int k = nums[i] * nums[j];
                map.put(k, map.getOrDefault(k, 0) + 1);
            }
        }
        int count = 0;
        for (int i : map.keySet()) {
            int j = map.get(i);
            if (j > 1) {
                count += j * (j - 1) / 2;
            }
        }
        return count * 8;
    }
}