class Solution {
    public long matrixSumQueries(int n, int[][] queries) {
        HashSet<Integer> rset=new HashSet<>();
        HashSet<Integer> cset=new HashSet<>();
        int row=n;
        int col=n;
        int r=queries.length;
        long sum=0;
        for(int i=r-1;i>=0;i--){
            int type=queries[i][0];
            int index=queries[i][1];
            int val=queries[i][2];
            if(type==0){
                if(!rset.contains(index)){
                  sum+=val*col;
                  rset.add(index);
                  row--;
                }
            }
            else{
                if(!cset.contains(index)){
                    sum+=val*row;
                    cset.add(index);
                    col--;
                }
            }
        }
        return sum;
    }
}