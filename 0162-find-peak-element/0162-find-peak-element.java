class Solution {
    public int findPeakElement(int[] nums) {
        int i=0;
        int n=nums.length;
        int ans=0;
        while(i+1<n && nums[i]<nums[i+1]){
           i++;
           ans=i;
        
        }
        return ans;
    }
}