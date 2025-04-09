class Solution {
    public int minOperations(int[] nums, int k) {
        // Map<Integer,Integer> map=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        int mini=101;
        for(int i:nums){
            mini=Math.min(mini,i);
            // map.put(i,map.getOrDefault(i,0)+1);
            set.add(i);
        }
        if(mini<k) return -1;
        if(mini==k) return set.size()-1;
        return set.size();
    }
}

