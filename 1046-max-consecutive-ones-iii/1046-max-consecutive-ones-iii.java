class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int z = 0;
        int maxi = 0;
        int current = 0;
        int left=0;
        for (int right = 0; right < n; right++) {
            if (nums[right] == 0) {
                z++;
            }
            while(z>k){
                if(nums[left]==0){
                    z--;
                }
                left++;
            }
            maxi=Math.max(maxi,right-left+1);
        }
        return maxi;
    }
}