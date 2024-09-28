class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] remainder = new int[60];
        int count = 0;
        
        for (int t : time) {
            int rem = t % 60;
            int complement = (rem == 0) ? 0 : 60 - rem;
            count += remainder[complement];
            remainder[rem]++;
        }
        
        return count;
    }
}
