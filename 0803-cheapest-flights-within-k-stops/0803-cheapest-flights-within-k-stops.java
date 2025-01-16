class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] ans = new int[n];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[src] = 0;
        for (int i = 0; i < k + 1; i++) {
            int[] temp = new int[n];
            for (int a = 0; a < n; a++) {
                temp[a] = ans[a];
            }
            for (int[] j : flights) {
                int u = j[0];
                int v = j[1];
                int d = j[2];
                if (ans[u]!=Integer.MAX_VALUE && ans[u] + d < temp[v]) {
                    temp[v] = ans[u] + d;
                }
            }
            ans=temp;
        }
        return ans[dst]==Integer.MAX_VALUE?-1:ans[dst];
    }
}