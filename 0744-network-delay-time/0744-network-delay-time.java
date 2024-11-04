class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        for (int i = 0; i < times.length; i++) {
            for (int j = 0; j < 2; j++) {
                times[i][j] = times[i][j] - 1;
            }
        }
        int ans = 0;
        List<List<int[]>> adjlist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjlist.add(new ArrayList<>());
        }
        for (int[] i : times) {
            int u = i[0];
            int v = i[1];
            int w = i[2];
            adjlist.get(u).add(new int[] { v, w });
        }
        int[] time = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == k - 1) {
                time[i] = 0;
            } else {
                time[i] = Integer.MAX_VALUE;
            }
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[1] - b[1];
            }
        });
        pq.add(new int[] { k - 1, 0 });
        while (!pq.isEmpty()) {
            int[] temp = pq.poll();
            int from = temp[0];
            int weight= temp[1];
            if (weight > time[from]) {
                continue;
            }
            for (int[] neighbor : adjlist.get(from)) {
                int v = neighbor[0];
                int w = neighbor[1];
                if (time[from] + w < time[v]) {
                    time[v] = time[from] + w;
                    pq.offer(new int[] { v, time[v] });
                }
            }
        }
        for(int i=0;i<n;i++){
            ans=Math.max(ans,time[i]);
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}