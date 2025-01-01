class Solution {
    public int maxScore(String s) {
        int n = s.length();
        if (leftsub(s) == n || rightsub(s) == n) {
            return n - 1;
        }
        int maxi = -1;
        for (int i = 1; i < n; i++) {
            maxi = Math.max(maxi, leftsub(s.substring(0, i)) + rightsub(s.substring(i, n)));
        }
        return maxi;
    }

    public int leftsub(String s1) {
        int a = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '0') {
                a++;
            }
        }
        return a;
    }

    public int rightsub(String s2) {
        int b = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == '1') {
                b++;
            }
        }
        return b;
    }
}