class Solution {
    public int minStoneSum(int[] piles, int k) {
      PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(b-a));
      for(int i=0;i<piles.length;i++){
        pq.add(piles[i]);
      }  
      while(k-->0){
        int a=pq.poll();
        int b=Math.floorDiv(a,2);
        pq.offer(a-b);
      }
      int ans=0;
      while(!pq.isEmpty()){
        ans+=pq.poll();
      }
      return ans;
    }
}