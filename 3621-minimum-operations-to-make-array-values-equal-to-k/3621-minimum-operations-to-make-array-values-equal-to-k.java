class Solution {
    public int minOperations(int[] nums, int k) {
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        int mini=101;
        for(int i:nums){
            mini=Math.min(mini,i);
            map.put(i,map.getOrDefault(i,0)+1);
        }
        if(mini<k) return -1;
        if(mini==k) return map.size()-1;
        return map.size();
    }
}

