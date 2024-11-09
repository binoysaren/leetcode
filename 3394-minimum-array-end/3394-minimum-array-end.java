class Solution {
    public long minEnd(int n, int x) {
        long result = x;
        n = n - 1;
        while (n-- > 0) {
            result = (result + 1) | x;
        }
        return result;
    }
}