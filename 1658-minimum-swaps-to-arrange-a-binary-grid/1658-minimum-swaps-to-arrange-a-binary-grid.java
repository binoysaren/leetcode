class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int[] a = new int[n];
        boolean[] visit = new boolean[n];
        int index = 0;
        while (index < n) {
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (!visit[i]) {
                    int trailingZeroes = 0;
                    for (int j = n - 1; j >= 0 && grid[i][j] == 0; j--) {
                        trailingZeroes++;
                    }
                    if (trailingZeroes >= n - index - 1) {
                        a[index] = i;
                        visit[i] = true; 
                        found = true;
                        break; 
                    }
                }
            }
            if (!found) return -1; 
            index++;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        int swap=0;
          for (int i = 0; i < n; i++) {
            if (a[i] != i) {
                int j = i;
                while (j < n && a[j] != i) {
                    j++;
                }
                while (j > i) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                    swap++;
                    j--;
                }
            }
        }
        return swap;
    }
}
