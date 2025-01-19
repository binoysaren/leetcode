class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;    
        int ans=Integer.MIN_VALUE;
        for(int i=n;i>=0;i--){
            int count=0;
            for(int j=0;j<n;j++){
                if(citations[j]>=i){
                    count++;
                }
            }
            if(count>=i){
                ans=Math.max(ans,i);
            }
        }
        return ans;
    }
}