class Solution {
    int R, C;

    public boolean isEscapePossible(int[][] blocked, int[] source, int[] target) {
        R = 1000000;
        C = 1000000;
        int n = blocked.length;
        if (n == 0)
            return true;
        Set<List<Integer>> set = new HashSet<>();
        for (int[] i : blocked) {
            set.add(Arrays.stream(i).boxed().toList());
        }

        // Use separate visited sets for each DFS
        Set<List<Integer>> visitedSource = new HashSet<>();
        Set<List<Integer>> visitedTarget = new HashSet<>();
        return dfs(source[0], source[1], target, set, visitedSource, 0) &&
               dfs(target[0], target[1], source, set, visitedTarget, 0);
    }

    public boolean dfs(int r, int c, int[] target, Set<List<Integer>> set, Set<List<Integer>> visited, int step) {
        if (target[0] == r && target[1] == c) {
            return true;
        }
        if (step > 20000) {
            return true;
        }
        List<Integer> current = Arrays.asList(r, c);
        visited.add(current);
        int[][] adj = { { r, c + 1 }, { r, c - 1 }, { r + 1, c }, { r - 1, c } };
        for (int[] neighbor : adj) {
            int newr = neighbor[0];
            int newc = neighbor[1];
            List<Integer> nei = Arrays.asList(newr, newc);
            if (newr >= 0 && newr < R && newc >= 0 && newc < C &&
                !set.contains(nei) && !visited.contains(nei)) {
                if (dfs(newr, newc, target, set, visited, step + 1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
