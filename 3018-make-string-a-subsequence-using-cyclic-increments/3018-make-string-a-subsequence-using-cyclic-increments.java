class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int n1 = str1.length(), n2 = str2.length(), temp = 0;
        for (int i = 0; i < n2; i++) {
            boolean found = false;
            for (int j = temp; j < n1; j++) {
                int t = f(str2.charAt(i), str1.charAt(j));
                if (t == 1 || t == 0) {
                    temp = j + 1;
                    found = true;
                    break;
                }
            }
            if (!found) return false;
        }
        return true;
    }

    public int f(char c1, char c2) {
        if (c1 == c2) return 0;
        if (c2 == (c1 - 1) || (c1 == 'a' && c2 == 'z')) return 1;
        return -1;
    }
}
