class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int[] c = new int[n+k-1];
        for (int i = 0; i < n+k-1; i++) {
            c[i] = colors[i % n];
        }
        // for (int i : c) {
        //     System.out.print(i + " ");
        // }
        int count = 0;
        int left = 0;
        int right = -1;
        for (int i = 1; i < n+k-1; i++) {
            right = i;
            if (c[i] != c[i - 1]) {
                if (right - left + 1 == k) {
                    count++;
                    left ++;
                }
            } else {
                left = i;
            }
            // System.out.print(count+ " ");
        }
        return count;
    }
}