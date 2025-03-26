class Solution {
    public int minOperations(int[][] grid, int x) {
        int r = grid.length, c = grid[0].length;
        int n = r * c;
        int[] temp = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int[] row : grid) {
            for (int val : row) {
                map.put(val, map.getOrDefault(val, 0) + 1);
                temp[index++] = val;
            }
        }
        if (map.size() == 1) return 0;
        Arrays.sort(temp);
        int mid = temp[n / 2]; 
        int left = (n / 2 > 0) ? temp[n / 2 - 1] : -1;
        int right = (n / 2 < n - 1) ? temp[n / 2 + 1] : -1;
        int mini = Integer.MAX_VALUE;
        int a = f(map, mid, x);
        int b = f(map, left, x);
        int c1 = f(map, right, x);
        if (a != -1) mini = Math.min(mini, a);
        if (b != -1) mini = Math.min(mini, b);
        if (c1 != -1) mini = Math.min(mini, c1);
        return mini == Integer.MAX_VALUE ? -1 : mini;
    }
    public int f(Map<Integer, Integer> map, int target, int x) {
        int count = 0;
        for (int key : map.keySet()) {
            if (Math.abs(target - key) % x != 0) return -1;
            count += (Math.abs(target - key) / x) * map.get(key);
        }
        return count;
    }
}
