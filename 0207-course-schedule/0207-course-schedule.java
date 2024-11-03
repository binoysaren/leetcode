class Solution {
    public boolean canFinish(int num, int[][] pre) {
        List<List<Integer>> adjlist = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            adjlist.add(new ArrayList<>());
        }
        for (int[] arr : pre) {
            adjlist.get(arr[1]).add(arr[0]);
        }
        boolean[] visit = new boolean[num];
        boolean[] pathvisit = new boolean[num];
        for (int i = 0; i < num; i++) {
            if (!visit[i] && dfs(adjlist, visit, pathvisit, i)) {
                return false;
            }
        }
        return true;
    }
    public boolean dfs(List<List<Integer>> adjlist, boolean[] visit, boolean[] pathvisit, int node) {
        visit[node] = true;
        pathvisit[node] = true;
        for (int neighbor : adjlist.get(node)) {
            if (!visit[neighbor] && dfs(adjlist, visit, pathvisit, neighbor)) {
                return true;
            } else if (pathvisit[neighbor]) {
                return true;
            }
        }
        pathvisit[node] = false;
        return false;
    }
}