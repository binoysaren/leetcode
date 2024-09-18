class Solution {
    public int findCenter(int[][] edges) {
        int node = -1;
        for (int[] i : edges) {
            node = Math.max(Math.max(i[0], i[1]), node);
        }
        int[] A = new int[node+1];
        for (int[] i : edges) {
            A[i[0]]++;
            A[i[1]]++;
        }
        for (int i = 0; i < node+1; i++) {
            if (A[i] == node - 1) {
                return i ;
            }
        }
        return -1;
    }
}