class Solution {
    public int minCost(int[][] grid) {
       PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int r = grid.length;
        int c = grid[0].length;
        int[][] temp = new int[r][c];
        for (int[] i : temp) {
            Arrays.fill(i, Integer.MAX_VALUE);
        }
        int[][] adj = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
        temp[0][0] = 0;
        pq.offer(new int[] { 0, 0, 0 });
        while (!pq.isEmpty()) {
            int[] t = pq.poll();
            int newcost = t[0];
            int row = t[1];
            int col = t[2];
            if (temp[row][col] < newcost)
                continue;
            for (int i = 0; i < 4; i++) {
                int newr = row + adj[i][0];
                int newc = col + adj[i][1];
                if (newr >= 0 && newr < r && newc >= 0 && newc < c) {
                    int newcellcost = (i + 1 == grid[row][col] ? 0 : 1);
                    int totalcost = newcellcost + newcost;
                    if (totalcost < temp[newr][newc]) {
                        temp[newr][newc] = totalcost;
                        pq.offer(new int[] { totalcost, newr, newc });
                    }
                }
            }
        }
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         System.out.print(temp[i][j] +" ");
        //     }
        //     System.out.println();
        // }
        return temp[r - 1][c - 1];
    }
}