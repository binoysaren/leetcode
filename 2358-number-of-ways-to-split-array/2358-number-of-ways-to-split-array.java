class Solution {
    public int waysToSplitArray(int[] nums) {
      int n=nums.length;
      long[] prefix=new long[n];
      long[] sufix=new long[n];
      long sum=0;
      for(int i=0;i<n;i++){
       sum+=nums[i];
       prefix[i]=sum;
      }
      sum=0;
      for(int i=n-1;i>=0;i--){
        sum+=nums[i];
        sufix[i]=sum;
      }
      int count=0;
      for(int i=1;i<=n-1;i++){
        if(prefix[i-1]>=sufix[i]){
            count++;
        }
      }
      return count;
    }
}