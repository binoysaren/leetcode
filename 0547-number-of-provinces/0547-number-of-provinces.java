class Solution {
    int n;
    public int findCircleNum(int[][] isConnected) {
        n = isConnected.length;
        int count = 0; 
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1) { 
                    list.get(i).add(j);
                }
            }
        }
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (!visited.contains(i)) { 
                count++;
                dfs(i, list, visited); 
            }
        }
        return count;
    }

    private void dfs(int node, List<List<Integer>> list, Set<Integer> visited) {
        visited.add(node);
        for (int neighbor : list.get(node)) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, list, visited);
            }
        }
    }
}
