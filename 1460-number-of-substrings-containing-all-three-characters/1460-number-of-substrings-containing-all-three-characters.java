class Solution {
    public int numberOfSubstrings(String s) {
        int[] count = new int[3];
        int ans = 0;
        int left = 0;
        int  n = s.length();
        for (int right = 0; right < n; right++) {
            char c=s.charAt(right);
            count[c - 'a']++;
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                ans += n - right;
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return ans;
    }
}
