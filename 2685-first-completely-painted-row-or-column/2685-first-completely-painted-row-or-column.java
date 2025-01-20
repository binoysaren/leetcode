class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int  r=mat.length;
        int c=mat[0].length;
        int n=arr.length;
        Map<Integer,int[]>map=new HashMap<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                map.put(mat[i][j],new int[]{i,j});
            }
        }
        int[] rowcount=new int[r];
        int[] colcount=new int[c];
        for(int i=0;i<n;i++){
            int[] a=map.get(arr[i]);
            rowcount[a[0]]++;
            colcount[a[1]]++;
            if(rowcount[a[0]]==c || colcount[a[1]]==r){
                return i;
            }
        }
        return 0;
    }
}