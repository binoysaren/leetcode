class Solution {
    public long coloredCells(int n) {
      if(n==1) return 1;
      return (long)((long)((long)n*(long)n)+(long)((long)(n-1)*(long)(n-1)));
    }
}
// 1-1
// 2 -5 (2*2+1*1)
// 3 - 13 (3*3+2*2)
// 4 - 25(4*4+3*3)
