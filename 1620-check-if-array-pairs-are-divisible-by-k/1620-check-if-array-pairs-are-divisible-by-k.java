class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] rem = new int[k];
        for (int i = 0; i < arr.length; i++) {
            int j = (arr[i] % k + k) % k;
            rem[j]++;
        }
        if (rem[0] % 2 != 0)
            return false;
        for (int i = 1; i <= rem.length / 2; i++) {
            int complement = k - i;
            if (rem[complement] != rem[i]) {
                return false;
            }
        }
        return true;
    }
}