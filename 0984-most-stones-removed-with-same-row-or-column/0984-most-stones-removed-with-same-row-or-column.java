class Solution {
    public int removeStones(int[][] stones) {
        int R = stones.length;
        int C = stones[0].length;
        boolean[] visit = new boolean[R];
        List<List<Integer>> adjlist = new ArrayList<>();
        for (int i = 0; i < R; i++) {
            adjlist.add(new ArrayList<>());
        }
        for (int i = 0; i < R - 1; i++) {
            for (int j = i + 1; j < R; j++) {
                if (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]) {
                    adjlist.get(i).add(j);
                    adjlist.get(j).add(i);
                }
            }
        }
        int count = 0;
        System.out.println(adjlist);
        for (int i = 0; i < R; i++) {
            if (!visit[i]) {
                dfs(adjlist, i, visit);
                count++;
            }
        }
        return R - count;
    }

    public void dfs(List<List<Integer>> adjlist, int index, boolean[] visit) {
        if (visit[index]) {
            return;
        }
        visit[index] = true;
        for (int i : adjlist.get(index)) {
            dfs(adjlist, i, visit);
        }
    }
}