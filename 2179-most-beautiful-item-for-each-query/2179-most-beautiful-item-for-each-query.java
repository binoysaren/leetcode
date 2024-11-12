class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        int n = queries.length;
        Arrays.sort(items, (a, b) -> a[0] - b[0]);
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < items.length; i++) {
            maxi = Math.max(maxi, items[i][1]);
            items[i][1] = maxi;
        }
        for (int i = 0; i < n; i++) {
            int left = 0, right = items.length - 1;
            int maxFoundBeauty = 0;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (items[mid][0] <= queries[i]) {
                    maxFoundBeauty = items[mid][1];
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            queries[i] = maxFoundBeauty;
        }
        return queries;
    }
}