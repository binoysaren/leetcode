class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i + 1 < n && nums[i] == nums[i + 1]) {
                nums[i] *= 2; 
                nums[i + 1] = 0; 
            }
        }
        int[] ans = new int[n];
        int index=0;
        for(int i:nums){
            if(i!=0){
                ans[index++]=i;
            }
        }
        return ans;
    }
}
