class Solution {
    long findScore(int[] n) {
        long score = 0;
        Set<int[]> set = new TreeSet<>((a, b) -> (a[0] == b[0]) ? a[1] - b[1] : a[0] - b[0]);
        for (int i = 0; i < n.length; ++i)
            set.add(new int[] { n[i], i });
        for (int[] s : set) {
            if (n[s[1]] == 0)
                continue;
            score += (long) s[0];
            n[s[1]] = 0;
            if (s[1] > 0)
                n[s[1] - 1] = 0;
            if (s[1] + 1 < n.length)
                n[s[1] + 1] = 0;
        }
        return score;
    }
}