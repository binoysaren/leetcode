class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] ans = new int[n];
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<n;i++){
            map.put(A[i],map.getOrDefault(A[i],0)+1);
            if(map.containsKey(A[i])){
                if(map.get(A[i])==2){
                    count++;
                }
            }
            map.put(B[i],map.getOrDefault(B[i],0)+1);
           if(map.containsKey(B[i])){
                if(map.get(B[i])==2){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}