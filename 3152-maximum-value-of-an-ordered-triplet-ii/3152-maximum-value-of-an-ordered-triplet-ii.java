class Solution {
    public long maximumTripletValue(int[] nums) {
        long f=0;
        long s=0;
        long ans=0;
        for(int i:nums){
           ans=Math.max(ans,f*i);
           f=Math.max(f,s-i);
           s=Math.max(s,i);
        }
        return ans;
    }
}