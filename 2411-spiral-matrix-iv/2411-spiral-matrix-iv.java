class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=-1;
            }
        }
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        while (top <= bottom && left <= right && head!=null) {
            for (int i = left; i <= right && head!=null; i++) {
                ans[top][i] = head.val;
                head = head.next;
            }
            top++;
            for (int i = top; i <= bottom && head!=null; i++) {
                ans[i][right] = head.val;
                head = head.next;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left && head!=null; i--) {
                    ans[bottom][i] = head.val;
                    head = head.next;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top && head!=null; i--) {
                    ans[i][left] = head.val;
                    head = head.next;
                }
                left++;
            }
        }
        return ans;
    }
}