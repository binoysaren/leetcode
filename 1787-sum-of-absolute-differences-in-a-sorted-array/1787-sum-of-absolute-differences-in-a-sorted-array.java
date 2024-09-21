class Solution {
    public int[] getSumAbsoluteDifferences(int[] n) {
        int l = n.length;
        int[] r = new int[l];
        int[] p = new int[l];
        int[] s = new int[l];
        p[0] = n[0];
        s[l - 1] = n[l - 1];
        for (int i = 1; i < l; ++i) {
            p[i] = p[i - 1] + n[i];
            s[l - i - 1] = s[l - i] + n[l - i - 1];
        }
        for (int i = 0; i < l; ++i) {
            r[i] = ((n[i] * i) - p[i]) + (s[i] - (n[i] * (l - i - 1)));
        }
        return r;
    }
}
