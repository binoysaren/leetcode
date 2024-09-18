class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        long count = 0;
        for(int i=0;i<nums.length;i++){
            int diff=i-nums[i];
            if(hm.containsKey(diff)){
                count += (i - hm.get(diff));
            }else{
                count += i;
            }
            hm.put(diff,hm.getOrDefault(diff, 0) + 1);
        }
        return count;
    }
}