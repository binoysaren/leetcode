class Solution {
    public boolean isIdealPermutation(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
           if (i - nums[i] > 1 || i - nums[i] < -1){
            return false;
           }
        }
        return true;
    }
}