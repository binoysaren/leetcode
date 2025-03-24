class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String ans="";
        for(int i=0;i<n;i++){
            int left=i;
            int right=i;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                left--;
                right++;
            }
            if(ans.length()<right-left-1){
                ans=s.substring(left+1,right);
            }
            left=i;
            right=i+1;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                left--;
                right++;
            }
            if(ans.length()<right-left-1){
                ans=s.substring(left+1,right);
            }
        }
        return ans;
    }
}