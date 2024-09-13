class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int sum = 0;
        int[] result = new int[queries.length];
        int i = 0;
            for (int[] j : queries) {
                int left = j[0];
                int right = j[1];
                while (left <= right) {
                    sum = sum ^ arr[left] ;
                    left++;
                }
                result[i] = sum;
                sum = 0;
                i++;
            }
        return result;
    }
}