class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int in = 1;
        int de = 1;
        int n = nums.length;
        int countin = 1,countde=1;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                countin++;
                in = Math.max(in, countin);
            } else {
                countin = 1;
            }
             if (nums[i] > nums[i + 1]) {
                countde++;
                de = Math.max(de, countde);
            } else {
                countde = 1;
            }
            // System.out.println(in+" "+count);
        }
        return Math.max(in,de);
    }
}