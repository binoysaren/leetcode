class Solution {
    public int largestCombination(int[] candidates) {
      int maxcount=0;
      for(int i=0;i<=24;i++){
        int bit=0;
        for(int j:candidates){
            bit+=((j>>i) & 1);
        }
        maxcount=Math.max(maxcount,bit);
      }
      return maxcount;
    }
}