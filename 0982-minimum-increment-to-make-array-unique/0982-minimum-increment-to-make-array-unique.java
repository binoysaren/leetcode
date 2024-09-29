class Solution {
    public int minIncrementForUnique(int[] nums) {  
       int n=nums.length;
       int m=findmax(nums);
       int[] arr=new int[m+n];
       for(int i=0;i<n;i++){
        arr[nums[i]]++;
       }
       int ans=0;
       for(int i=0;i<m+n;i++){
          if(arr[i]<=1) continue;
          ans+=arr[i]-1;
          arr[i+1]+=arr[i]-1;
          arr[i]=1;
       }
       return ans;
    }
    public int findmax(int[] nums){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            maxi=Math.max(maxi,nums[i]);
        }
        return maxi;
    }
}