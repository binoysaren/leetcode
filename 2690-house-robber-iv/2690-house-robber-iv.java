class Solution {
    int n;
    public int minCapability(int[] nums, int k) {
        n=nums.length;
        int left=Integer.MAX_VALUE;
        int right=Integer.MIN_VALUE;
        for(int i:nums){
            left=Math.min(left,i);
            right=Math.max(right,i);
        }
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(f(mid,nums,k)){
               ans=mid;
               right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
    public boolean f(int capa,int[] nums,int k){
        int houserob=0;
        for(int i=0;i<n;i++){
            if(nums[i]<=capa){
                houserob++;
                i++;
            }
            if(houserob>=k){
                return true;
            }
        }
        return false;
    }
}