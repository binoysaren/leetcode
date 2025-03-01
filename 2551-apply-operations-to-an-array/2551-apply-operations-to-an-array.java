class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (i + 1 < n && nums[i] == nums[i + 1]) {
                nums[i] *= 2; 
                nums[i + 1] = 0; 
            }
            if (nums[i] != 0) {
                st.push(nums[i]); 
            }
        }
        int[] ans = new int[n];
        int idx = 0;
        while (!st.isEmpty()) {
            ans[idx++] = st.remove(0); 
        }
        return ans;
    }
}
