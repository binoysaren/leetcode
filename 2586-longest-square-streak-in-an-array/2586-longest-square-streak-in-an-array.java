class Solution {
    public int longestSquareStreak(int[] nums) {
       int n=nums.length;
       Arrays.sort(nums);
       Map<Integer,Integer> map=new HashMap<>();
       int ans=-1;
       for(int i=0;i<n;i++){
        int root=(int)Math.sqrt(nums[i]);
           if(root*root==nums[i] && map.containsKey(root)){
            map.put(nums[i],map.get(root)+1);
            ans=Math.max(ans,map.get(nums[i]));
           }
           else{
            map.put(nums[i],1);
           }
       }
       return ans;
    }
}