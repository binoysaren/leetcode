class Solution {
    public int minChanges(String s) {
        int n = s.length();
        int count = 0;
        char ch = s.charAt(0);
        int consecutive = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ch) {
                consecutive++;
                continue;
            }
            if (consecutive % 2 == 0) {
                consecutive = 1;
            } else {
                consecutive = 0;
                count++;
            }
            ch = s.charAt(i);
        }
        return count;
    }
}