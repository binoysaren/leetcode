class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for (int i : nums) {
            pq.add((long)i);
        }
        int count=0;
        while(pq.peek()<k){
           long x=pq.poll();
           long y=pq.poll();
           long z=Math.min(x,y)*2+Math.max(x,y);
           pq.offer(z);
            count++;
        }
        //  System.out.println(pq);
        return count;
    }
}