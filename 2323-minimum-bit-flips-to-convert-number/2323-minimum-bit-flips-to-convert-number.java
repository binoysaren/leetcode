class Solution {
    public int minBitFlips(int start, int goal) {
        int xor=start^goal;
        int ans=0;
        while(xor!=0){
            ans+=xor%2;
            xor/=2;
        }
        return ans;
    }
}