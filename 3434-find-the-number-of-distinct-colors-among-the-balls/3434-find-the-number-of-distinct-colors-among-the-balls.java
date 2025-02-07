class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        int[] ans=new int[n];
        Map<Integer,Integer> colour=new HashMap<>();
        Map<Integer,Integer> count=new HashMap<>();
        int index=0;
        for(int[] i:queries){
            if(!colour.containsKey(i[0])){
                colour.put(i[0],i[1]);
                count.put(i[1],count.getOrDefault(i[1],0)+1);
            }
            else {
                int c=colour.get(i[0]);
                count.put(c,count.getOrDefault(c,0)-1);
                if(count.get(c)==0){
                    count.remove(c);
                }
                colour.put(i[0],i[1]);
                count.put(i[1],count.getOrDefault(i[1],0)+1);
            }
            ans[index++]=count.size();
        }
        return ans;
    }
}