class Solution {
    public int maximumSum(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int ans=-1;
        for(int i=0;i<n;i++){
            int add=f(nums[i]);
            if(map.containsKey(add)){
                ans=Math.max(ans,map.get(add)+nums[i]);
            }
            if(map.containsKey(add)){
                if(nums[i]>map.get(add)){
                    map.put(add,nums[i]);
                }
            }
            else{
                map.put(add,nums[i]);
            }
        }
        System.out.println(map);
        return ans;
    }
    public int f(int a){
        if(a<10){
            return a;
        }
        int sum=0;
        while(a>0){
            sum+=a%10;
            a=a/10;
        }
        return sum;
    }
}