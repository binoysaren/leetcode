class Solution {
    public int countHousePlacements(int n) {
       if(n==1) return 4;
       if(n==2) return 9;
       long mod=1000000007;
       long a=2;
       long b=3;
       long c=0;
       for(int i=3;i<=n;i++){
          c=(a+b)%mod;
          a=b;
          b=c;
       } 
       return (int)((1L*c*c)%mod);
    }
}