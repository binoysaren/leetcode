class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        Map<Integer, Integer> upal = new HashMap<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int temp = i - j;
                if (!upal.containsKey(temp)) {
                    upal.put(temp, matrix[i][j]);
                } else {
                    if (upal.get(temp) != matrix[i][j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
