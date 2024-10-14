class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ans = new String[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : score) {
            pq.add(i);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(score[i], i);
        }
        if (!pq.isEmpty()) ans[map.get(pq.poll())] = "Gold Medal";
        if (!pq.isEmpty()) ans[map.get(pq.poll())] = "Silver Medal";
        if (!pq.isEmpty()) ans[map.get(pq.poll())] = "Bronze Medal";
        int rank = 4;
        while (!pq.isEmpty()) {
            ans[map.get(pq.poll())] = Integer.toString(rank);
            rank++;
        }
        return ans;
    }
}