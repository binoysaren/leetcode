class Solution {
    public int numOfSubarrays(int[] arr) {
        int ans=0;
        int even=1;
        int odd=0;
        int sum=0;
        for(int i:arr){
            sum+=i;
            if(sum%2!=0){
                ans+=even;
                odd++;
            }
            else{
                ans+=odd;
                even++;
            }
            ans=ans%1000000007;
        }
        return ans;
    }
}