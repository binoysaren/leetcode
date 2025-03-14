class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int count=n;
        for(int i=0;i<n;i++){
            int left=i;
            int right=i;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                if(right-left>0){
                    count++;
                }
                left--;
                right++;
            }
            left=i;
            right=i+1;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                count++;
                left--;
                right++;
            }
        }

        return count;
    }
}