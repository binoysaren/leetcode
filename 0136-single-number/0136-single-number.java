class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        if(n==1)
          {
            return nums[0];
          }
        for(int i=0;i<n;i++)
           {
              int count =0;
              for(int j=0;j<n;j++)
                {
                   if(nums[i]==nums[j])
                    {
                      count++;
                    }
                }
                if(count==1)
                return nums[i];
           }
        return -1;  
    }
}