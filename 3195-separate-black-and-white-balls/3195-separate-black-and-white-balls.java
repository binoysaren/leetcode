class Solution {
    public long minimumSteps(String s) {
        int n = s.length();
        long ans = 0;
        int zeros=0;
        for (int i = 0; i < n ; i++) {
            if (s.charAt(i) == '0') {
              zeros++;
            }
        }
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                zeros--;
            }
            else{
             ans+=zeros;
            }
        }
        return ans;
    }
}