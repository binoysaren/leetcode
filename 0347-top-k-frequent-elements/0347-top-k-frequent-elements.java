class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       int n=nums.length;
       int[] ans=new int[k];
       Map<Integer,Integer> map=new HashMap<>();
       for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
       } 
       List<Integer> sortedKeys = new ArrayList<>(map.keySet());
        sortedKeys.sort((a, b) -> map.get(b) - map.get(a));
        for (int i = 0; i < k; i++) {
            ans[i] = sortedKeys.get(i);
        }
       return ans;
    }
}