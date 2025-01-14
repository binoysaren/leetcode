class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] ans = new int[n];
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map1.put(A[i], map1.getOrDefault(A[i], 0) + 1);
            map2.put(B[i], map2.getOrDefault(B[i], 0) + 1);
            int count = 0;
            for (int j : map1.keySet()) {
                if (map2.containsKey(j)) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}