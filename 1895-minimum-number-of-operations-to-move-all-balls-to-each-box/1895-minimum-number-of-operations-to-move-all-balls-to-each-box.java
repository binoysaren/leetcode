class Solution {
    public int[] minOperations(String boxes) {
       int n=boxes.length();
       int[] ans=new int[n];
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(boxes.charAt(j)=='1'){
                ans[i]+=j-i;
            }
        }
       }
       for(int i=n-1;i>=0;i--){
        for(int j=i-1;j>=0;j--){
            if(boxes.charAt(j)=='1'){
                ans[i]+=i-j;
            }
        }
       }
       return ans;
    }
}