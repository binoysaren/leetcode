class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] i : matrix) {
            int left = 0;
            int right = i.length-1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (i[mid] == target) {
                    return true;
                } else if (i[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return false;
    }
}