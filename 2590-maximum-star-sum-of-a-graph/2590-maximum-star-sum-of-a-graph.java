class Solution {
    public int maxStarSum(int[] vals, int[][] edges, int k) {
        int result = Integer.MIN_VALUE;
        if (edges.length == 0) {
            for (int val : vals) {
                result = Math.max(result, val);
            }
            return result;
        } 
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < vals.length; i++) {
            list.add(new ArrayList<>());
        }  
        for (int[] edge : edges) {
            list.get(edge[0]).add(vals[edge[1]]);
            list.get(edge[1]).add(vals[edge[0]]);
        }
        for (int i = 0; i < vals.length; i++) {
            int sum = vals[i];
            List<Integer> temp = list.get(i);
            Collections.sort(temp, Collections.reverseOrder());
            int count = Math.min(k, temp.size());
            for (int j = 0; j < count; j++) {
                if (temp.get(j) > 0) {
                    sum += temp.get(j);
                }
            }
            result = Math.max(result, sum);
        }
        
        return result;
    }
}
