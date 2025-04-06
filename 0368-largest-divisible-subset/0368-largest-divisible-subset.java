class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> dp = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            dp.add(new ArrayList<>());
        }

        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            List<Integer> maxSubset = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp.get(j).size() > maxSubset.size()) {
                    maxSubset = dp.get(j);
                }
            }
            dp.get(i).addAll(maxSubset);
            dp.get(i).add(nums[i]);
            if (dp.get(i).size() > dp.get(maxIndex).size()) {
                maxIndex = i;
            }
        }

        return dp.get(maxIndex);
    }
}
