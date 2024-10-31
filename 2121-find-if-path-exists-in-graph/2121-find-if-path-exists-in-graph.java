class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination)
            return true;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int[] i : edges) {
            list.get(i[0]).add(i[1]);
            list.get(i[1]).add(i[0]);
        }
        boolean[] visit = new boolean[n];
        return dfs(list, source, destination, visit);
    }

    public boolean dfs(List<List<Integer>> list, int current, int destination, boolean[] visit) {
        visit[current] = true;
        if (current == destination)
            return true;
        for (int i : list.get(current)) {
            if (!visit[i]) {
                boolean found = dfs(list, i, destination, visit);
                if (found) {
                    return true;
                }
            }
        }
        return false;
    }
}