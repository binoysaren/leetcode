class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int ans = 0;
        int sum1 = 0;
        int sum2=0;
        int maxi1 = Integer.MIN_VALUE;
        int maxi2=Integer.MIN_VALUE;
        for (int i : nums) {
            sum1 += i;
            sum2+=i;
            maxi1 = Math.max(maxi1, Math.abs(sum1));
            maxi2=Math.max(maxi2,Math.abs(sum2));
            if (sum1 < 0) {
                sum1 = 0;
            }
            if(sum2>0){
                sum2=0;
            }
            System.out.println(sum1 + " "+ sum2);
        }
        return Math.max(maxi1,maxi2);
    }
}
// 2 3   4  0 3  1 
// 3  1  4  3 1 -2

// 1 2 4 7 3
// 1 0 3 1 -4