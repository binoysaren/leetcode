class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
            maxi = Math.max(maxi, nums[i]);
        }
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] != maxi) {
                temp[i] = nums[i];
            } else {
                temp[i] = -1;
            }
        }
        Arrays.sort(temp);
        int m = temp[n - 1];
        for (int i : map.keySet()) {
            if(i==maxi){
                if (i >= m * 2) {
                return map.get(i);
             }
            }
        }
        return -1;
    }
}