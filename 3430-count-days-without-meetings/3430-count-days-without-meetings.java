class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        int count = 0;
        int lastEnd = 0;
        for (int[] m : meetings) {
            int start = m[0];
            int  end = m[1];
            if (start > lastEnd) {
                count += end - start + 1;
            } else if (end > lastEnd) {
                count += end - lastEnd;
            }
            lastEnd = Math.max(lastEnd, end);
        }
        return days - count;
    }
}
