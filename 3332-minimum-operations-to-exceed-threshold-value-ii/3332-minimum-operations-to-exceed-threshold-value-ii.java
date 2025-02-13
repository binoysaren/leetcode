class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for (int i : nums) {
            pq.add((long)i);
        }
        int count=0;
        while(pq.size()>1 && pq.peek()<k){
           long x=pq.poll();
           long y=pq.poll();
           if(x<k || y<k){
            count++;
           }
           long z=Math.min(x,y)*2+Math.max(x,y);
           pq.offer(z);
        }
         System.out.println(pq);
        return count;
    }
}