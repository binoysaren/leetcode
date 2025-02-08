class Solution {
    public boolean checkString(String s) {
        boolean flag = false;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (flag && s.charAt(i) == 'a') {
                return false;
            }
            if (s.charAt(i) == 'b') {
                flag = true;
            }
        }
        return true;
    }
}