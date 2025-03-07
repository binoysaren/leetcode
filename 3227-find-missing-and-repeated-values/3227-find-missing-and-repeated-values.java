class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long natural = 0;
        long square = 0;
        for (int[] i : grid) {
            for (int j : i) {
                natural += j;
                square += j * j;
            }
        }
        long n=grid.length * grid.length;
        long sum=(n*(n+1))/2;
        long total=(n*(n+1)*(2*n+1))/6;
        long temp1=sum-natural;
        long temp2=(total-square)/temp1;
        int b=(int)((temp1+temp2)/2);
        int a=(int)(temp2-b);
        return new int[]{a,b};
    }
}