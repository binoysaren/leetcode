class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length / 2;
        int[] even = new int[n];
        int[] odd = new int[n];
        int i = 0, j = 0;
        for (int a : nums) {
            if (a % 2 == 0) {
                even[i] = a;
                i++;
            } else {
                odd[j] = a;
                j++;
            }
        }
        int k=0;
        i=0;
        j=0;
        int[] ans = new int[nums.length];
        while (k < nums.length) {
            if (k % 2 == 0) {
                ans[k] = even[i];
                i++;
            } else {
                ans[k] = odd[j];
                j++;
            }
            k++;
        }
        return ans;
    }
}