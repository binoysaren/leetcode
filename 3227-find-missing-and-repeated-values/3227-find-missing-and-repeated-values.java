class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans=new int[2];
        int n=grid.length;
        Set<Integer> set=new HashSet<>();
        int number=1;
        int a=0;
        int b=0;
        for(int[] i:grid){
            for(int j:i){
                if(set.contains(j)){
                    a=j;
                }
                set.add(j);
            }
        }
        for(int i=1;i<=n*n;i++){
            if(!set.contains(i)){
                b=i;
                break;
            }
        }
        ans[0]=a;
        ans[1]=b;
        return ans;
    }
}
// 10-8 x=2;
// sum-x+y=total

