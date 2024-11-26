class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] out=new int[n];
        int[] in=new int[n];
        for(int[] i:edges){
            out[i[0]]++;
            in[i[1]]++;
        }
        int incoming=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(in[i]==0){
                incoming++;
                ans=i;
            }
        }
        return incoming>1?-1:ans;
    }
}