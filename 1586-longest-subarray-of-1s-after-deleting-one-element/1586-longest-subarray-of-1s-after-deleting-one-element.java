class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        // int[] temp=new int[n];
        for (int i = 0; i < n; i++) {
            // temp[i]=nums[i];
            if (nums[i] == 0) {
                list.add(i);
            }
        }

        // System.out.println(list);
        if (list.size() == 0) {
            return n-1;
        }
        int N = list.size();
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
                // System.out.println(leftrightsum(nums,list.get(i)));
                ans=Math.max(ans,leftrightsum(nums,list.get(i)));
        }
        return ans;
        
    }
    public int leftrightsum(int[] A,int index){
       int result=0;
       int newindex=index-1;
       while(newindex>=0 && newindex<A.length && A[newindex]==1){
        result+=A[newindex];
        newindex--;
       }
       int ind=index+1;
       while(ind>=0 && ind<A.length && A[ind]==1){
        result+=A[ind];
        ind++;
       }
       return result;
    }
}