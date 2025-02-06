class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                map.put(nums[i]*nums[j],map.getOrDefault(nums[i]*nums[j],0)+1);
            }
        }
        int count=0;
        for(int i:map.keySet()){
            int j=map.get(i);
            if(j>1){
                count+=(j*(j-1))/2;
            }
        }
        return count*8;
    }
}