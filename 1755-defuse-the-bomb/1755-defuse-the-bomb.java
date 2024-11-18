class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] next = new int[2 * n];
        int index = 0;
        for (int i = 0; i < 2 * n; i++) {
            if (i < n) {
                next[i] = code[i];
            } else {
                next[i] = code[index++];
            }
        }
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            if(k>0){
                int sum=0;
                for(int j=i+1;j<=i+k;j++){
                    sum+=next[j];
                }
                ans[i]=sum;
            }
            else if(k<0){
                int sum=0;
                for(int j=n+i-1;j>=n+i+k;j--){
                    sum+=next[j];
                }
                ans[i]=sum;
            }
            else{
                ans[i]=0;
            }
        }
        return ans;
    }
}