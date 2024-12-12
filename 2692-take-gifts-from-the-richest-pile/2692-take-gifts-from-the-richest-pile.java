class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i : gifts) {
            pq.add(i);
        }
        long sum=0;
        while(k-->0){
            int n=pq.poll();
            pq.add((int)Math.sqrt(n));
        }
        for(int i:pq){
            sum+=i;
        }
        return sum;
    }
}