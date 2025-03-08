class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count=0;
        int ans = 101;
        int n=blocks.length();
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                count++;
            }
        }
        ans=Math.min(ans,count);
        for(int i=1;i<=n-k;i++){
            if(blocks.charAt(i-1)=='W'){
                count--;
            }
            if(blocks.charAt(i+k-1)=='W'){
                count++;
            }
            ans=Math.min(ans,count);
            if(ans==0) return ans;
        }
        return ans;
    }
}