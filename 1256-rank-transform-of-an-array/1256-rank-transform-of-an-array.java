class Solution {
    public int[] arrayRankTransform(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        Arrays.sort(arr);
        int n = arr.length;
        int[] ans = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (int i = 0; i < n; i++) {
            map.put(arr[i], rank);
            if (i < n - 1) {
                if (arr[i] < arr[i + 1]) {
                    rank++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            ans[i] = map.get(list.get(i));
        }
        return ans;
    }
}