class Solution {
    public List<Boolean> checkIfPrerequisite(int num, int[][] pre, int[][] queries) {
        int[][] adj=new int[num][num];
        for(int[] i:pre){
            adj[i[0]][i[1]]++;
        }
        List<Boolean> ans=new ArrayList<>();
        // for(int i=0;i<num;i++){
        //     for(int j=0;j<num;j++){
        //         System.out.print(adj[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println(ans);
        for(int k=0;k<num;k++){
            for(int i=0;i<num;i++){
                for(int j=0;j<num;j++){
                    if(adj[i][j]>0 || (adj[i][k]>0 && adj[k][j]>0)){
                        adj[i][j]++;
                    }
                }
            }
        }
        // for(int i=0;i<num;i++){
        //     for(int j=0;j<num;j++){
        //         System.out.print(adj[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        for(int[] i:queries){
            // System.out.println(adj[i[0]][i[1]]);
            if(adj[i[0]][i[1]]>0){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}