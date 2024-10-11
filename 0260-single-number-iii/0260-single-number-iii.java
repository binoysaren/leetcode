class Solution {
    public int[] singleNumber(int[] nums) {
      int[] ans=new int[2];
      Map<Integer,Integer> map=new HashMap<>();
      for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
      } 
      int j=0;
      for(int i:map.keySet()){
        int a=map.get(i);
        if(a==1){
            ans[j]=i;
            j++;
        }
      }
      return ans;
    }
}