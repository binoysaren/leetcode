class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int ans=0;
        int currentprice=prices[0];
        int currentprofit=0;
        for(int i=1;i<n;i++){
            if(prices[i]<currentprice){
                currentprice=prices[i];
            }
            else if(prices[i]>currentprice){
                currentprofit=prices[i]-currentprice;
            }
            ans=Math.max(ans,currentprofit);
        }
        return ans;
    }
}