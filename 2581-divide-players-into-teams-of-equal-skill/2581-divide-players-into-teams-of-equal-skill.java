class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);  
        int n=skill.length;
        int target=skill[n-1]+skill[0];  
        long ans=skill[n-1]*skill[0];
        int left=1;
        int right=n-2;
        while(left<right){
            if(skill[left]+skill[right]==target){
                ans+=skill[left]*skill[right];
                left++;
                right--;
            }
            else{
                return -1;
            }
        }
        return ans;
    }
}