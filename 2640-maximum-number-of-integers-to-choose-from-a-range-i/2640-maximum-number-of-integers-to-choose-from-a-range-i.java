class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int[] temp = new int[10001];
        for (int b : banned) {
            temp[b] = b;
        }
        int sum = 0, count = 0;
        for (int i = 1; i <= n; i++) {
            if (temp[i]==0 && sum + i <= maxSum) {
                sum += i;
                count++;
            }
        }
        return count;
    }
}
