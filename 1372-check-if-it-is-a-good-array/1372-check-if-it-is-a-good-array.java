class Solution {
    public boolean isGoodArray(int[] nums) {
        int n=nums.length;
        if(n==1)return  nums[0] == 1;
        int ans=nums[0];
        int i=1;
        while(i<n){
          ans=gcd(ans,nums[i]);
          i++;
        }
        return ans<=1;
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;  
            a = b;        
            b = r;       
        }
        return a; 
    }
}