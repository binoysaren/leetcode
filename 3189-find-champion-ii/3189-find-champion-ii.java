class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] in=new int[n];
        for(int[] i:edges){
            in[i[1]]++;
        }
        int incoming=0;
        int ans=-1;
        for(int i=0;i<n;i++){
            if(in[i]==0){
                incoming++;
                ans=i;
            }
        }
        return incoming>1?-1:ans;// ami robi 
    }
}