class Solution {
    public long maxKelements(int[] nums, int k) {
      long ans=0;
      PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
      for(int i:nums){
        pq.add(i);
      }
      while(k-->0){
        int a=pq.poll();
        ans+=a;
        if(a%3==0){
            pq.add(a/3);
        }
        else{
            pq.add(a/3+1);
        }
      }
      return ans;
    }
}