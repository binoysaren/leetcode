class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length;
        List<String> list = new ArrayList<>();
        if(n==0 || nums==null) return list;
        int start = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    list.add(Integer.toString(start));
                } else {
                    list.add(start + "->" + nums[i - 1]);
                }
                start = nums[i];
            }
        }
        if (start == nums[n- 1]) {
            list.add(Integer.toString(start));
        } else {
            list.add(start + "->" + nums[nums.length - 1]);
        }
        return list;
    }
}