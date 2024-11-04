class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int dia = i - j;
                map.putIfAbsent(dia, new ArrayList<>());
                map.get(dia).add(mat[i][j]);
            }
        }
        for(List<Integer> l:map.values()){
            Collections.sort(l);
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int dia=i-j;
                mat[i][j]=map.get(dia).remove(0);
            }
        }
        return mat;
    } 
}