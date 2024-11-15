class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n-1;
        for (int k = n - 1; k >= 1; k--) {
            if (arr[k] >= arr[k - 1]) {
                j = k - 1;
            } else {
                break;
            }
        }
        int ans = j;
        System.out.print(j);
        if (j == 0) return 0;
        while(i<n){
            if(i>0 && arr[i-1]>arr[i]){
                break;
            }
            while(j<n && arr[i]>arr[j]){
                j++;
            }
            ans=Math.min(ans,j-i-1);
            i++;
        }
        return ans;
    }
}