class Solution {
    public int findJudge(int n, int[][] trust) {
      if(trust.length==0 && n==1) return 1;
      if(trust.length==0 && n>1) return -1;
      int[] out=new int[n+1];
      int[] in=new int[n+1];
      for(int[] i: trust){
         out[i[0]]++;
         in[i[1]]++;
      }
      int incoming=n-1;
      int outcoming=0;
      int ans=0;
      for(int i=0;i<n+1;i++){
        if(out[i]==0 && in[i]==incoming){
            return i;
        }
      }
      return -1;
    }
}