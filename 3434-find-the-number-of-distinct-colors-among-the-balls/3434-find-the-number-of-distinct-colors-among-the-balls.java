class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        int[] ans = new int[n];
        int index = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> valueCount = new HashMap<>();
        int uniqueCount = 0;
        for (int[] query : queries) {
            int key = query[0];
            int value = query[1];
            if (map.containsKey(key)) {
                int oldValue = map.get(key);
                valueCount.put(oldValue, valueCount.get(oldValue) - 1);
                if (valueCount.get(oldValue) == 0) {
                    uniqueCount--;
                }
            }
            map.put(key, value);
            valueCount.put(value, valueCount.getOrDefault(value, 0) + 1);
            if (valueCount.get(value) == 1) {
                uniqueCount++;
            }
            ans[index++] = uniqueCount;
        }
        return ans;
    }
}
